package com.yixun.ccmz.domain;

import java.math.BigDecimal;
import javax.annotation.Generated;

public class DictReimbursePolicyTarget extends BaseModel {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String ID;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String RP_ID;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer IC_ID;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal maxQuota;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String memo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getID() {
        return ID;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setID(String ID) {
        this.ID = ID == null ? null : ID.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRP_ID() {
        return RP_ID;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRP_ID(String RP_ID) {
        this.RP_ID = RP_ID == null ? null : RP_ID.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getIC_ID() {
        return IC_ID;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIC_ID(Integer IC_ID) {
        this.IC_ID = IC_ID;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getMaxQuota() {
        return maxQuota;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMaxQuota(BigDecimal maxQuota) {
        this.maxQuota = maxQuota;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMemo() {
        return memo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}