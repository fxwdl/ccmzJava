package com.yixun.ccmz.dto;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.yixun.infrastructure.serializer.MyDateSerializer;
import com.yixun.infrastructure.serializer.MyDatetimeSerializer;

public class LoginModel
{
	private String userName;
	private String password;
	private boolean rememberMe;

	@JsonSerialize(using = MyDateSerializer.class)
	private Date now;

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getUserName()
	{
		return this.userName;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getPassword()
	{
		return this.password;
	}

	public void setRememberMe(boolean rememberMe)
	{
		this.rememberMe = rememberMe;
	}

	public boolean getRememberMe()
	{
		return this.rememberMe;
	}

	public Date getNow()
	{
		return this.now;
	}

	public void setNow(Date now)
	{
		this.now = now;
	}
}
