package com.yixun.ccmz.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.yixun.ccmz.domain.User;
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
		User u = getCurrentUser();
		List<SystemMenuModel> m = new ArrayList<SystemMenuModel>();
		if (u != null)
		{
			m = this.getAccountService().GetSystemMenu(u.getUserName());
		}
		getHttpRequest().setAttribute("menu", m);
	}

	protected User getCurrentUser()
	{
		User u = (User) getHttpRequest().getSession(true).getAttribute("user");
		return u;
	}

	protected HttpServletRequest getHttpRequest()
	{
		return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
	}
}
