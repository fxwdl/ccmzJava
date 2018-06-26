package com.yixun.ccmz.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.yixun.ccmz.dto.SystemMenuModel;
import com.yixun.ccmz.service.AccountService;

public abstract class BaseController
{
	private AccountService accountService;

	@Autowired
	public void setAccountService(AccountService accountService)
	{
		this.accountService = accountService;
	}

	public AccountService getAccountService()
	{
		return this.accountService;
	}

	public void initSystemMenu()
	{
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		String userName = (String) request.getSession(true).getAttribute("user");
		List<SystemMenuModel> m = new ArrayList<SystemMenuModel>();
		if (userName != null)
		{
			m = this.getAccountService().GetSystemMenu(userName);
		}
		request.setAttribute("menu", m);
	}
}
