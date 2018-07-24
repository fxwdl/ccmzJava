package com.yixun.ccmz.dao;

//import static com.yixun.ccmz.dao.mybatis.mapper.DictReimbursePolicyDynamicSqlSupport.DictReimbursePolicy.fromDate;
import static com.yixun.ccmz.dao.mybatis.mapper.DictReimbursePolicyDynamicSqlSupport.*;
import static org.testng.Assert.assertEquals;
import static org.mybatis.dynamic.sql.SqlBuilder.*;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSource;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yixun.ccmz.dao.mybatis.mapper.DictReimbursePolicyMapper;
import com.yixun.ccmz.dao.mybatis.mapper.DynamicPageing;
import com.yixun.ccmz.dao.mybatis.mapper.LimitAndOffsetAdapter.LimitAndOffsetDecorator;
import com.yixun.ccmz.domain.DictReimbursePolicy;

import afu.org.checkerframework.checker.regex.qual.Var;

/**
 * 参考示例https://github.com/mybatis/mybatis-dynamic-sql/tree/master/src/test/java/examples/paging
 * 
 * @author fx__w
 *
 */
public class LimitAndOffsetTest
{
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/yixunccmz";
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

	private SqlSessionFactory sqlSessionFactory;

	@BeforeTest
	public void setup() throws Exception
	{
		Class.forName(JDBC_DRIVER);
		// InputStream is =
		// getClass().getResourceAsStream("/examples/animal/data/CreateAnimalData.sql");
		// try (Connection connection = DriverManager.getConnection(JDBC_URL, "sa", ""))
		// {
		// ScriptRunner sr = new ScriptRunner(connection);
		// sr.setLogWriter(null);
		// sr.runScript(new InputStreamReader(is));
		// }

		UnpooledDataSource ds = new UnpooledDataSource(JDBC_DRIVER, JDBC_URL, "root", "abc#1234");
		Environment environment = new Environment("test", new JdbcTransactionFactory(), ds);
		Configuration config = new Configuration(environment);
		config.addMapper(DictReimbursePolicyMapper.class);

		// config.setLogImpl(StdOutImpl.class);
		config.setLogImpl(org.apache.ibatis.logging.log4j.Log4jImpl.class);

		// org.apache.ibatis.logging.LogFactory.useStdOutLogging();

		sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
	}

	@Test
	public void testLimitandOffset()
	{
		try (SqlSession sqlSession = sqlSessionFactory.openSession())
		{
			DictReimbursePolicyMapper mapper = sqlSession.getMapper(DictReimbursePolicyMapper.class);
			SelectStatementProvider s1 = select(ID, fromDate, endDate).from(dictReimbursePolicy).build()
					.render(RenderingStrategy.MYBATIS3);
			List<DictReimbursePolicy> rows3 = mapper.selectMany(s1);
			assertEquals(rows3.size(), 1);

			DynamicPageing limit = new DynamicPageing(s1, 1, 0);

			List<DictReimbursePolicy> rows = mapper.selectByExampleWithLimitAndOffset(1, 0).orderBy(fromDate).build()
					.execute();
			assertEquals(rows.size(), 1);

			List<DictReimbursePolicy> rows1 = mapper.selectMany(limit);
			assertEquals(rows1.size(), 1);
		}
	}
}
