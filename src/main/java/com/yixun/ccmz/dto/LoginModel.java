package com.yixun.ccmz.dto;

public class LoginModel
{
	private String userName;
	private String password;
	private boolean rememberMe;

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
}
