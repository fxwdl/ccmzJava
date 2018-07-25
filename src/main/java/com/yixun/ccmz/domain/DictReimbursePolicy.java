package com.yixun.ccmz.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.annotation.Generated;

public class DictReimbursePolicy extends BaseModel
{
	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	private String ID;

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	private Date fromDate;

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	private Date endDate;

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	private BigDecimal VOD;

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	private Integer childrenAge;

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	private BigDecimal outpatientQuota;

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	private String memo;

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	public String getID()
	{
		return ID;
	}

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	public void setID(String ID)
	{
		this.ID = ID == null ? null : ID.trim();
	}

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	public Date getFromDate()
	{
		return fromDate;
	}

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	public void setFromDate(Date fromDate)
	{
		this.fromDate = fromDate;
	}

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	public Date getEndDate()
	{
		return endDate;
	}

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	public void setEndDate(Date endDate)
	{
		this.endDate = endDate;
	}

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	public BigDecimal getVOD()
	{
		return VOD;
	}

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	public void setVOD(BigDecimal VOD)
	{
		this.VOD = VOD;
	}

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	public Integer getChildrenAge()
	{
		return childrenAge;
	}

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	public void setChildrenAge(Integer childrenAge)
	{
		this.childrenAge = childrenAge;
	}

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	public BigDecimal getOutpatientQuota()
	{
		return outpatientQuota;
	}

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	public void setOutpatientQuota(BigDecimal outpatientQuota)
	{
		this.outpatientQuota = outpatientQuota;
	}

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	public String getMemo()
	{
		return memo;
	}

	@Generated("org.mybatis.generator.api.MyBatisGenerator")
	public void setMemo(String memo)
	{
		this.memo = memo == null ? null : memo.trim();
	}

	// 以下自定义
	private List<DictReimbursePolicyTarget> targets;

	public void setTargets(List<DictReimbursePolicyTarget> targets)
	{
		this.targets = targets;
	}

	public List<DictReimbursePolicyTarget> getTargets()
	{
		return this.targets;
	}
}