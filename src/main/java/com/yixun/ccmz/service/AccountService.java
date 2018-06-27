package com.yixun.ccmz.service;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yixun.ccmz.dao.*;

import com.yixun.ccmz.domain.*;
import com.yixun.ccmz.dto.SystemMenuModel;

@Service
@Transactional
public class AccountService
{
	@Autowired
	private UserDao userDao;

	@Autowired
	private SystemFunctionDao systemFunctionDao;

	public boolean ValidateUser(String username, String password)
	{
		/*
		 * UserExample q1 = new UserExample(); q1.or().andUserNameEqualTo(username);
		 * List<User> l1 = userMapper.selectByExample(q1);
		 * 
		 * if (l1.size() > 0) { User u = l1.get(0); }
		 */
		// AspnetUser user = aspnetUserDao.FindByName(username);
		User u = userDao.getByUserName(username);

		if (u != null && u.getMembership().getPassword().equals(password))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public List<SystemMenuModel> GetSystemMenu(String userName)
	{
		List<SystemMenuModel> result = new ArrayList<SystemMenuModel>();
		List<SystemFunction> list = systemFunctionDao.getByUserName(userName);

		Map<String, SystemMenuModel> m = new HashMap<String, SystemMenuModel>();

		for (SystemFunction p : list)
		{
			if (!m.containsKey(p.getParentPermissionId()))
			{
				SystemFunction s1 = systemFunctionDao.getById(p.getParentPermissionId());

				if (s1 != null)
				{
					SystemMenuModel sm = new SystemMenuModel();
					sm.setCssClass(s1.getCssClass());
					sm.setTitle(s1.getPermissionDisplayName());

					m.put(p.getParentPermissionId(), sm);
				}
			}
			SystemMenuModel smm = m.get(p.getParentPermissionId());
			if (smm != null)
			{
				smm.getSystemFunctions().add(p);
			}
		}
		// 使用lambda表达式也可以.java的lambda表达式是通过匿名类实现接口这种方式。
		// list.forEach((p) ->
		// {
		//
		// });

		m.forEach((k, p) ->
		{
			result.add(p);
		});

		return result;
	}
}
