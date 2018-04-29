package com.yixun.ccmz.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yixun.ccmz.service.AccountService;

@Controller
@RequestMapping(value = "account")
public class AccountController
{
	private AccountService accountService;

	public void setAccountService(AccountService accountService)
	{
		this.accountService = accountService;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String Login()
	{
		return "login";
	}
}
