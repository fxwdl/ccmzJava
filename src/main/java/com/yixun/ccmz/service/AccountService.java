package com.yixun.ccmz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yixun.ccmz.dao.AspnetUserDao;
import com.yixun.ccmz.domain.AspnetUser;

@Service
public class AccountService
{
	private AspnetUserDao aspnetUserDao;

	@Autowired
	public void setAspnetUserDao(AspnetUserDao aspnetUserDao)
	{
		this.aspnetUserDao = aspnetUserDao;
	}

	@Transactional
	public boolean ValidateUser(String username, String password)
	{
		AspnetUser user = aspnetUserDao.FindByName(username);
		if (user != null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
