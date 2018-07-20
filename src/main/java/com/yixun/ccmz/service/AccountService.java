package com.yixun.ccmz.service;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;

import com.yixun.ccmz.dao.*;

import com.yixun.ccmz.domain.*;
import com.yixun.ccmz.dto.SystemMenuModel;

@Service
@Transactional
public class AccountService extends BaseService
{
	@Autowired
	private UserDao userDao;

	@Autowired
	private SystemFunctionDao systemFunctionDao;

	// 默认的实现是org.springframework.security.authentication.ProviderManager
	// 内部实现是循环所有的AuthenticationProvider进行验证
	@Autowired
	@Qualifier("authenticationManager")
	protected AuthenticationManager authenticationManager;

	public /* User */ void ValidateUser(String username, String password)
	{
		/*
		 * UserExample q1 = new UserExample(); q1.or().andUserNameEqualTo(username);
		 * List<User> l1 = userMapper.selectByExample(q1);
		 * 
		 * if (l1.size() > 0) { User u = l1.get(0); }
		 * 
		 * // AspnetUser user = aspnetUserDao.FindByName(username); User u =
		 * this.getUserByUserName(username);
		 * 
		 * if (u != null && u.getMembership().getPassword().equals(password)) { return
		 * u; } else { return null; }
		 */
		Authentication request = new UsernamePasswordAuthenticationToken(username, password);

		Authentication result = authenticationManager.authenticate(request);
		SecurityContextHolder.getContext().setAuthentication(result);

	}

	public User getUserByUserName(String username)
	{
		User u = userDao.getByUserName(username);
		return u;
	}

	@Cacheable(value = "accountCache")
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
