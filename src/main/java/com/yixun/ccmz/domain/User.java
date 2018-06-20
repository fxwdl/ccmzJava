package com.yixun.ccmz.domain;

import java.util.Date;

public class User extends BaseModel
{
	private String userId;

	private String applicationId;

	private String userName;

	private String loweredUserName;

	private String mobileAlias;

	private Boolean isAnonymous;

	private Date lastActivityDate;

	private String govDeptFullCode;

	private String hospitalID;

	private String CNName;

	public User(String userId, String applicationId, String userName, String loweredUserName, String mobileAlias,
			Boolean isAnonymous, Date lastActivityDate, String govDeptFullCode, String hospitalID, String CNName)
	{
		this.userId = userId;
		this.applicationId = applicationId;
		this.userName = userName;
		this.loweredUserName = loweredUserName;
		this.mobileAlias = mobileAlias;
		this.isAnonymous = isAnonymous;
		this.lastActivityDate = lastActivityDate;
		this.govDeptFullCode = govDeptFullCode;
		this.hospitalID = hospitalID;
		this.CNName = CNName;
	}

	public User()
	{
		super();
	}

	public String getUserId()
	{
		return userId;
	}

	public void setUserId(String userId)
	{
		this.userId = userId == null ? null : userId.trim();
	}

	public String getApplicationId()
	{
		return applicationId;
	}

	public void setApplicationId(String applicationId)
	{
		this.applicationId = applicationId == null ? null : applicationId.trim();
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName == null ? null : userName.trim();
	}

	public String getLoweredUserName()
	{
		return loweredUserName;
	}

	public void setLoweredUserName(String loweredUserName)
	{
		this.loweredUserName = loweredUserName == null ? null : loweredUserName.trim();
	}

	public String getMobileAlias()
	{
		return mobileAlias;
	}

	public void setMobileAlias(String mobileAlias)
	{
		this.mobileAlias = mobileAlias == null ? null : mobileAlias.trim();
	}

	public Boolean getIsAnonymous()
	{
		return isAnonymous;
	}

	public void setIsAnonymous(Boolean isAnonymous)
	{
		this.isAnonymous = isAnonymous;
	}

	public Date getLastActivityDate()
	{
		return lastActivityDate;
	}

	public void setLastActivityDate(Date lastActivityDate)
	{
		this.lastActivityDate = lastActivityDate;
	}

	public String getGovDeptFullCode()
	{
		return govDeptFullCode;
	}

	public void setGovDeptFullCode(String govDeptFullCode)
	{
		this.govDeptFullCode = govDeptFullCode == null ? null : govDeptFullCode.trim();
	}

	public String getHospitalID()
	{
		return hospitalID;
	}

	public void setHospitalID(String hospitalID)
	{
		this.hospitalID = hospitalID == null ? null : hospitalID.trim();
	}

	public String getCNName()
	{
		return CNName;
	}

	public void setCNName(String CNName)
	{
		this.CNName = CNName == null ? null : CNName.trim();
	}

	// 以下为自定义

	private Membership membership;

	public Membership getMembership()
	{
		return membership;
	}

	public void setMembership(Membership membership)
	{
		this.membership = membership;
	}
}