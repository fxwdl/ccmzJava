package com.yixun.ccmz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yixun.ccmz.dao.*;
import com.yixun.ccmz.domain.*;
import java.util.*;

@Service
@Transactional
public class AccountService
{
	@Autowired
	private AspnetUserDao aspnetUserDao;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private MembershipMapper membershipMapper;

	public boolean ValidateUser(String username, String password)
	{
		/*
		 * UserExample q1 = new UserExample(); q1.or().andUserNameEqualTo(username);
		 * List<User> l1 = userMapper.selectByExample(q1);
		 * 
		 * if (l1.size() > 0) { User u = l1.get(0); }
		 */
		// AspnetUser user = aspnetUserDao.FindByName(username);
		User u = userMapper.getByUserName(username);

		if (u != null && u.getMembership().getPassword().equals(password))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
