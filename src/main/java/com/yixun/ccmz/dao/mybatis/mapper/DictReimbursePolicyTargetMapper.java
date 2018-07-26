package com.yixun.ccmz.dao.mybatis.mapper;

import static com.yixun.ccmz.dao.mybatis.mapper.DictReimbursePolicyTargetDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.yixun.ccmz.domain.DictReimbursePolicyTarget;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
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
public interface DictReimbursePolicyTargetMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<DictReimbursePolicyTarget> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DictReimbursePolicyTargetResult")
    DictReimbursePolicyTarget selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DictReimbursePolicyTargetResult", value = {
        @Result(column="ID", property="ID", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="RP_ID", property="RP_ID", jdbcType=JdbcType.VARCHAR),
        @Result(column="IC_ID", property="IC_ID", jdbcType=JdbcType.INTEGER),
        @Result(column="MaxQuota", property="maxQuota", jdbcType=JdbcType.DECIMAL),
        @Result(column="Memo", property="memo", jdbcType=JdbcType.VARCHAR)
    })
    List<DictReimbursePolicyTarget> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(dictReimbursePolicyTarget);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, dictReimbursePolicyTarget);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(String ID_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, dictReimbursePolicyTarget)
                .where(ID, isEqualTo(ID_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(DictReimbursePolicyTarget record) {
        return insert(SqlBuilder.insert(record)
                .into(dictReimbursePolicyTarget)
                .map(ID).toProperty("ID")
                .map(RP_ID).toProperty("RP_ID")
                .map(IC_ID).toProperty("IC_ID")
                .map(maxQuota).toProperty("maxQuota")
                .map(memo).toProperty("memo")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(DictReimbursePolicyTarget record) {
        return insert(SqlBuilder.insert(record)
                .into(dictReimbursePolicyTarget)
                .map(ID).toPropertyWhenPresent("ID", record::getID)
                .map(RP_ID).toPropertyWhenPresent("RP_ID", record::getRP_ID)
                .map(IC_ID).toPropertyWhenPresent("IC_ID", record::getIC_ID)
                .map(maxQuota).toPropertyWhenPresent("maxQuota", record::getMaxQuota)
                .map(memo).toPropertyWhenPresent("memo", record::getMemo)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DictReimbursePolicyTarget>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, ID, RP_ID, IC_ID, maxQuota, memo)
                .from(dictReimbursePolicyTarget);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DictReimbursePolicyTarget>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, ID, RP_ID, IC_ID, maxQuota, memo)
                .from(dictReimbursePolicyTarget);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DictReimbursePolicyTarget selectByPrimaryKey(String ID_) {
        return SelectDSL.selectWithMapper(this::selectOne, ID, RP_ID, IC_ID, maxQuota, memo)
                .from(dictReimbursePolicyTarget)
                .where(ID, isEqualTo(ID_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(DictReimbursePolicyTarget record) {
        return UpdateDSL.updateWithMapper(this::update, dictReimbursePolicyTarget)
                .set(ID).equalTo(record::getID)
                .set(RP_ID).equalTo(record::getRP_ID)
                .set(IC_ID).equalTo(record::getIC_ID)
                .set(maxQuota).equalTo(record::getMaxQuota)
                .set(memo).equalTo(record::getMemo);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(DictReimbursePolicyTarget record) {
        return UpdateDSL.updateWithMapper(this::update, dictReimbursePolicyTarget)
                .set(ID).equalToWhenPresent(record::getID)
                .set(RP_ID).equalToWhenPresent(record::getRP_ID)
                .set(IC_ID).equalToWhenPresent(record::getIC_ID)
                .set(maxQuota).equalToWhenPresent(record::getMaxQuota)
                .set(memo).equalToWhenPresent(record::getMemo);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(DictReimbursePolicyTarget record) {
        return UpdateDSL.updateWithMapper(this::update, dictReimbursePolicyTarget)
                .set(RP_ID).equalTo(record::getRP_ID)
                .set(IC_ID).equalTo(record::getIC_ID)
                .set(maxQuota).equalTo(record::getMaxQuota)
                .set(memo).equalTo(record::getMemo)
                .where(ID, isEqualTo(record::getID))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(DictReimbursePolicyTarget record) {
        return UpdateDSL.updateWithMapper(this::update, dictReimbursePolicyTarget)
                .set(RP_ID).equalToWhenPresent(record::getRP_ID)
                .set(IC_ID).equalToWhenPresent(record::getIC_ID)
                .set(maxQuota).equalToWhenPresent(record::getMaxQuota)
                .set(memo).equalToWhenPresent(record::getMemo)
                .where(ID, isEqualTo(record::getID))
                .build()
                .execute();
    }
    
    //以下自定义
}