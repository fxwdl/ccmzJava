package com.yixun.ccmz.dto;

import java.util.*;

import com.yixun.ccmz.domain.SystemFunction;

public class SystemMenuModel
{
	private String title;
	private String cssClass;
	private List<SystemFunction> systemFunctions = new ArrayList<SystemFunction>();

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getCssClass()
	{
		return this.cssClass;
	}

	public void setCssClass(String cssClass)
	{
		this.cssClass = cssClass;
	}

	public List<SystemFunction> getSystemFunctions()
	{
		return this.systemFunctions;
	}

	public void setSystemFunctions(List<SystemFunction> systemFunctions)
	{
		this.systemFunctions = systemFunctions;
	}
}
