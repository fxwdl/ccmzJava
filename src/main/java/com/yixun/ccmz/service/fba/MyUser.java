package com.yixun.ccmz.service.fba;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class MyUser extends User
{

	private final com.yixun.ccmz.domain.User user;

	public MyUser(String username, String password, Collection<? extends GrantedAuthority> authorities,
			com.yixun.ccmz.domain.User user)
	{
		super(username, password, true, true, true, true, authorities);
		this.user = user;
	}

	public MyUser(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities,
			com.yixun.ccmz.domain.User user)
	{
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		this.user = user;
	}

	public com.yixun.ccmz.domain.User getUser()
	{
		return user;
	}
}
