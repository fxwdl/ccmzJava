package com.yixun.ccmz.service;

import java.util.Date;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.*;

import com.thoughtworks.xstream.mapper.Mapper.Null;
import com.yixun.ccmz.domain.BnTreatmentreimburse;
import com.yixun.ccmz.dto.BnTreatmentreimburseModel;

import junit.framework.Assert;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
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

	@Test
	public void testMapper()
	{
		BnTreatmentreimburse s = new BnTreatmentreimburse();
		s.setStdDisease_Name("ABC");

		BnTreatmentreimburseModel r = new BnTreatmentreimburseModel();

		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		mapper.map(s, r);

		Assert.assertEquals("ABC", r.getStdDisease_Name());
		Assert.assertEquals(null, r.getName());
	}
}
