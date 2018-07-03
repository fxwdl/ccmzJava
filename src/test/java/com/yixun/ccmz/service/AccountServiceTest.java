package com.yixun.ccmz.service;

import java.util.Date;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.testng.Assert.*;

@ContextConfiguration("classpath*:/ccmz-context.xml")
public class AccountServiceTest extends AbstractTransactionalTestNGSpringContextTests
{
	@Autowired
	private AccountService accountService;

	@Test
	public void testValidateUser()
	{
		/*
		 * boolean b1 = accountService.ValidateUser("admin", "123456"); assertTrue(b1);
		 */
	}
}
