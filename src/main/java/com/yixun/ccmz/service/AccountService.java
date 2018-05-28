package com.yixun.ccmz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yixun.ccmz.dao.AspnetUserDao;
import com.yixun.ccmz.domain.AspnetUser;

@Service
@Transactional
public class AccountService
{
	private AspnetUserDao aspnetUserDao;

	@Autowired
	public void setAspnetUserDao(AspnetUserDao aspnetUserDao)
	{
		this.aspnetUserDao = aspnetUserDao;
	}

	public boolean ValidateUser(String username, String password)
	{
		// AspnetUser user = aspnetUserDao.FindByName(username);
		if (username.equals("admin") && password.equals("1"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
