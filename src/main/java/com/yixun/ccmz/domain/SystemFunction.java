package com.yixun.ccmz.domain;

import java.util.*;

public class SystemFunction extends BaseModel
{
	private String permissionId;

	private String permissionName;

	private String permissionDisplayName;

	private Integer funType;

	private String parentPermissionId;

	private String seq;

	private String page;

	private String cssClass;

	public String getPermissionId()
	{
		return permissionId;
	}

	public void setPermissionId(String permissionId)
	{
		this.permissionId = permissionId == null ? null : permissionId.trim();
	}

	public String getPermissionName()
	{
		return permissionName;
	}

	public void setPermissionName(String permissionName)
	{
		this.permissionName = permissionName == null ? null : permissionName.trim();
	}

	public String getPermissionDisplayName()
	{
		return permissionDisplayName;
	}

	public void setPermissionDisplayName(String permissionDisplayName)
	{
		this.permissionDisplayName = permissionDisplayName == null ? null : permissionDisplayName.trim();
	}

	public Integer getFunType()
	{
		return funType;
	}

	public void setFunType(Integer funType)
	{
		this.funType = funType;
	}

	public String getParentPermissionId()
	{
		return parentPermissionId;
	}

	public void setParentPermissionId(String parentPermissionId)
	{
		this.parentPermissionId = parentPermissionId == null ? null : parentPermissionId.trim();
	}

	public String getSeq()
	{
		return seq;
	}

	public void setSeq(String seq)
	{
		this.seq = seq == null ? null : seq.trim();
	}

	public String getPage()
	{
		return page;
	}

	public void setPage(String page)
	{
		this.page = page == null ? null : page.trim();
	}

	public String getCssClass()
	{
		return cssClass;
	}

	public void setCssClass(String cssClass)
	{
		this.cssClass = cssClass == null ? null : cssClass.trim();
	}

}