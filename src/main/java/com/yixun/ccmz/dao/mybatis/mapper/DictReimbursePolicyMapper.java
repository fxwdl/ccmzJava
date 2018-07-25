package com.yixun.ccmz.dao.mybatis.mapper;

import static com.yixun.ccmz.dao.mybatis.mapper.DictReimbursePolicyDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.yixun.ccmz.dao.mybatis.mapper.DictReimbursePolicyTargetDynamicSqlSupport.DictReimbursePolicyTarget;
import com.yixun.ccmz.domain.DictReimbursePolicy;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

@Mapper
public interface DictReimbursePolicyMapper
{
	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<DictReimbursePolicy> insertStatement);

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("DictReimbursePolicyResult")
	DictReimbursePolicy selectOne(SelectStatementProvider selectStatement);

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "DictReimbursePolicyResult", value = {
			@Result(column = "ID", property = "ID", jdbcType = JdbcType.VARCHAR, id = true),
			@Result(column = "FromDate", property = "fromDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "EndDate", property = "endDate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "VOD", property = "VOD", jdbcType = JdbcType.DECIMAL),
			@Result(column = "ChildrenAge", property = "childrenAge", jdbcType = JdbcType.INTEGER),
			@Result(column = "OutpatientQuota", property = "outpatientQuota", jdbcType = JdbcType.DECIMAL),
			@Result(column = "Memo", property = "memo", jdbcType = JdbcType.VARCHAR) })

	List<DictReimbursePolicy> selectMany(SelectStatementProvider selectStatement);

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample()
	{
		return SelectDSL.selectWithMapper(this::count, SqlBuilder.count()).from(dictReimbursePolicy);
	}

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample()
	{
		return DeleteDSL.deleteFromWithMapper(this::delete, dictReimbursePolicy);
	}

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	default int deleteByPrimaryKey(String ID_)
	{
		return DeleteDSL.deleteFromWithMapper(this::delete, dictReimbursePolicy).where(ID, isEqualTo(ID_)).build()
				.execute();
	}

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	default int insert(DictReimbursePolicy record)
	{
		return insert(SqlBuilder.insert(record).into(dictReimbursePolicy).map(ID).toProperty("ID").map(fromDate)
				.toProperty("fromDate").map(endDate).toProperty("endDate").map(VOD).toProperty("VOD").map(childrenAge)
				.toProperty("childrenAge").map(outpatientQuota).toProperty("outpatientQuota").map(memo)
				.toProperty("memo").build().render(RenderingStrategy.MYBATIS3));
	}

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	default int insertSelective(DictReimbursePolicy record)
	{
		return insert(
				SqlBuilder.insert(record).into(dictReimbursePolicy).map(ID).toPropertyWhenPresent("ID", record::getID)
						.map(fromDate).toPropertyWhenPresent("fromDate", record::getFromDate).map(endDate)
						.toPropertyWhenPresent("endDate", record::getEndDate).map(VOD)
						.toPropertyWhenPresent("VOD", record::getVOD).map(childrenAge)
						.toPropertyWhenPresent("childrenAge", record::getChildrenAge).map(outpatientQuota)
						.toPropertyWhenPresent("outpatientQuota", record::getOutpatientQuota).map(memo)
						.toPropertyWhenPresent("memo", record::getMemo).build().render(RenderingStrategy.MYBATIS3));
	}

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DictReimbursePolicy>>> selectByExample()
	{
		return SelectDSL
				.selectWithMapper(this::selectMany, ID, fromDate, endDate, VOD, childrenAge, outpatientQuota, memo)
				.from(dictReimbursePolicy);
	}

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DictReimbursePolicy>>> selectDistinctByExample()
	{
		return SelectDSL.selectDistinctWithMapper(this::selectMany, ID, fromDate, endDate, VOD, childrenAge,
				outpatientQuota, memo).from(dictReimbursePolicy);
	}

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	default DictReimbursePolicy selectByPrimaryKey(String ID_)
	{
		return SelectDSL
				.selectWithMapper(this::selectOne, ID, fromDate, endDate, VOD, childrenAge, outpatientQuota, memo)
				.from(dictReimbursePolicy).where(ID, isEqualTo(ID_)).build().execute();
	}

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(DictReimbursePolicy record)
	{
		return UpdateDSL.updateWithMapper(this::update, dictReimbursePolicy).set(ID).equalTo(record::getID)
				.set(fromDate).equalTo(record::getFromDate).set(endDate).equalTo(record::getEndDate).set(VOD)
				.equalTo(record::getVOD).set(childrenAge).equalTo(record::getChildrenAge).set(outpatientQuota)
				.equalTo(record::getOutpatientQuota).set(memo).equalTo(record::getMemo);
	}

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(DictReimbursePolicy record)
	{
		return UpdateDSL.updateWithMapper(this::update, dictReimbursePolicy).set(ID).equalToWhenPresent(record::getID)
				.set(fromDate).equalToWhenPresent(record::getFromDate).set(endDate)
				.equalToWhenPresent(record::getEndDate).set(VOD).equalToWhenPresent(record::getVOD).set(childrenAge)
				.equalToWhenPresent(record::getChildrenAge).set(outpatientQuota)
				.equalToWhenPresent(record::getOutpatientQuota).set(memo).equalToWhenPresent(record::getMemo);
	}

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	default int updateByPrimaryKey(DictReimbursePolicy record)
	{
		return UpdateDSL.updateWithMapper(this::update, dictReimbursePolicy).set(fromDate).equalTo(record::getFromDate)
				.set(endDate).equalTo(record::getEndDate).set(VOD).equalTo(record::getVOD).set(childrenAge)
				.equalTo(record::getChildrenAge).set(outpatientQuota).equalTo(record::getOutpatientQuota).set(memo)
				.equalTo(record::getMemo).where(ID, isEqualTo(record::getID)).build().execute();
	}

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	default int updateByPrimaryKeySelective(DictReimbursePolicy record)
	{
		return UpdateDSL.updateWithMapper(this::update, dictReimbursePolicy).set(fromDate)
				.equalToWhenPresent(record::getFromDate).set(endDate).equalToWhenPresent(record::getEndDate).set(VOD)
				.equalToWhenPresent(record::getVOD).set(childrenAge).equalToWhenPresent(record::getChildrenAge)
				.set(outpatientQuota).equalToWhenPresent(record::getOutpatientQuota).set(memo)
				.equalToWhenPresent(record::getMemo).where(ID, isEqualTo(record::getID)).build().execute();
	}

	// 以下自定义，实现分页
	default QueryExpressionDSL<LimitAndOffsetAdapter<List<DictReimbursePolicy>>> selectByExampleWithLimitAndOffset(
			int limit, int offset)
	{
		return SelectDSL.select(selectModel ->
		{
			return LimitAndOffsetAdapter.of(selectModel, this::selectMany, limit, offset);
		}, ID, fromDate, endDate, VOD, childrenAge, outpatientQuota, memo).from(dictReimbursePolicy);
	}

	/**
	 * 通过join获取数据
	 * 有点局限性，需要定义DictReimbursePolicyMapper.xml，然后从里面编写collection的ResultMap，通过注解的方式没办法声明。只通声明N+1那种查询的（通过@Result(mary=@Many()）
	 * 不过也同时证明了，myBatis会将使用Java代码声明的ResultMap与XML定义的ResultMap进行合并。实际上也就说明了2者可以混用。如果注解解决不了的问题，还是可以用XML的方式解决
	 * https://github.com/mybatis/mybatis-dynamic-sql/tree/master/src/test/java/examples/joins
	 * 
	 * @param selectStatement
	 * @return
	 */
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("JoinResultMap")
	List<DictReimbursePolicy> selectManyWithTargets(SelectStatementProvider selectStatement);
}