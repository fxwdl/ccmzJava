package com.yixun.ccmz.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.yixun.ccmz.domain.User;
import com.yixun.ccmz.dto.SystemMenuModel;
import com.yixun.ccmz.service.AccountService;
import com.yixun.ccmz.service.fba.MyUser;
import com.yixun.infrastructure.annotation.Authenticated;

import bsh.This;

//使用@ControllerAdvice确保每次在调用Controller的Method之前都先调行使用了@ModelAttribute标注的方法
//不过不知道为什么后面的参数想限定只有特定的类或者包才执行，始终不好使
@ControllerAdvice(basePackages = "com.yixun.ccmz.web.business")
public class BaseController
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

	@ModelAttribute
	public void initSystemMenu(Model model)
	{
		MyUser u = this.getMyUser();
		if (u != null)
		{
			List<SystemMenuModel> m = new ArrayList<SystemMenuModel>();
			m = this.getAccountService().GetSystemMenu(u.getUsername());
			model.addAttribute("menu", m);
			model.addAttribute("user", this.getUser());
		}
	}

	protected Authentication getAuthentication()
	{
		return SecurityContextHolder.getContext().getAuthentication();
	}

	protected MyUser getMyUser()
	{
		MyUser result = null;
		Authentication au = getAuthentication();

		if (au.getDetails() instanceof MyUser) // 不清楚为什么AbstractUserDetailsAuthenticationProvider的实现，并不是将userDetails放到Details上，而是放到了Principal上
		{
			result = (MyUser) au.getDetails();
		}
		return result;
	}

	protected User getUser()
	{
		User result = null;
		MyUser myUser = getMyUser();
		if (myUser != null)
		{
			result = myUser.getUser();
		}
		return result;
	}

	/*
	 * protected User getCurrentUser() { User u = (User)
	 * getHttpRequest().getSession(true).getAttribute("user"); return u; }
	 */

	protected HttpServletRequest getHttpRequest()
	{
		return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
	}

	/**
	 * 决定是否加载thymeleaf模板的页面
	 * 
	 * @param viewName
	 * @return
	 */
	protected String getViewName(String viewName)
	{
		if (getHttpRequest().getServletPath().contains(".html"))
		{
			return viewName + ".html";
		}
		else
		{
			return viewName;
		}
	}
}
