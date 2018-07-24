package com.yixun.ccmz.dao.mybatis.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DictReimbursePolicyDynamicSqlSupport
{
	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	public static final DictReimbursePolicy dictReimbursePolicy = new DictReimbursePolicy();

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	public static final SqlColumn<String> ID = dictReimbursePolicy.ID;

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	public static final SqlColumn<Date> fromDate = dictReimbursePolicy.fromDate;

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	public static final SqlColumn<Date> endDate = dictReimbursePolicy.endDate;

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	public static final SqlColumn<BigDecimal> VOD = dictReimbursePolicy.VOD;

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	public static final SqlColumn<Integer> childrenAge = dictReimbursePolicy.childrenAge;

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	public static final SqlColumn<BigDecimal> outpatientQuota = dictReimbursePolicy.outpatientQuota;

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	public static final SqlColumn<String> memo = dictReimbursePolicy.memo;

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	public static final class DictReimbursePolicy extends SqlTable
	{
		public final SqlColumn<String> ID = column("ID", JDBCType.VARCHAR);

		public final SqlColumn<Date> fromDate = column("FromDate", JDBCType.TIMESTAMP);

		public final SqlColumn<Date> endDate = column("EndDate", JDBCType.TIMESTAMP);

		public final SqlColumn<BigDecimal> VOD = column("VOD", JDBCType.DECIMAL);

		public final SqlColumn<Integer> childrenAge = column("ChildrenAge", JDBCType.INTEGER);

		public final SqlColumn<BigDecimal> outpatientQuota = column("OutpatientQuota", JDBCType.DECIMAL);

		public final SqlColumn<String> memo = column("Memo", JDBCType.VARCHAR);

		public DictReimbursePolicy()
		{
			super("dict_reimbursepolicy");
		}
	}
}