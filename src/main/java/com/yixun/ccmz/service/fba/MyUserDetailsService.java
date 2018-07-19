package com.yixun.ccmz.service.fba;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;

import com.yixun.ccmz.dao.UserDao;
import com.yixun.ccmz.domain.Role;
import com.yixun.ccmz.domain.User;

public class MyUserDetailsService implements UserDetailsService
{

	@Autowired
	private UserDao userDao;

	private String rolePrefix = "";

	// private JdbcDaoImpl dd;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
		MyUser result = null;
		User user = userDao.getByUserName(username);
		if (user != null)
		{
			Set<GrantedAuthority> dbAuthsSet = new HashSet<GrantedAuthority>();
			for (Role r : user.getRoles())
			{
				String roleName = this.rolePrefix + r.getRoleName();
				dbAuthsSet.add(new SimpleGrantedAuthority(roleName));
			}
			result = new MyUser(user.getUserName(), user.getMembership().getPassword(), dbAuthsSet, user);
		}
		// MyUser user=new MyUser(, password, authorities, chineseName)
		return result;
	}

	public void setRolePrefix(String rolePrefix)
	{
		this.rolePrefix = rolePrefix;
	}

	protected String getRolePrefix()
	{
		return this.rolePrefix;
	}
}
