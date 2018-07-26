package com.yixun.ccmz.dao.mybatis.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DictReimbursePolicyTargetDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final DictReimbursePolicyTarget dictReimbursePolicyTarget = new DictReimbursePolicyTarget();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ID = dictReimbursePolicyTarget.ID;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> RP_ID = dictReimbursePolicyTarget.RP_ID;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> IC_ID = dictReimbursePolicyTarget.IC_ID;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> maxQuota = dictReimbursePolicyTarget.maxQuota;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> memo = dictReimbursePolicyTarget.memo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class DictReimbursePolicyTarget extends SqlTable {
        public final SqlColumn<String> ID = column("ID", JDBCType.VARCHAR);

        public final SqlColumn<String> RP_ID = column("RP_ID", JDBCType.VARCHAR);

        public final SqlColumn<Integer> IC_ID = column("IC_ID", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> maxQuota = column("MaxQuota", JDBCType.DECIMAL);

        public final SqlColumn<String> memo = column("Memo", JDBCType.VARCHAR);

        public DictReimbursePolicyTarget() {
            super("dict_reimbursepolicy_target");
        }
    }
}