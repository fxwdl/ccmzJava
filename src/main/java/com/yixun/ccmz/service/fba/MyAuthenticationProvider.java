package com.yixun.ccmz.service.fba;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.authentication.dao.SaltSource;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.Assert;

//参考了默认的DaoAuthenticationProvider实现
public class MyAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider
{

	private UserDetailsService userDetailsService;
	private static final String USER_NOT_FOUND_PASSWORD = "userNotFoundPassword";
	private PasswordEncoder passwordEncoder;
	private String userNotFoundEncodedPassword;
	private SaltSource saltSource;

	public MyAuthenticationProvider()
	{
		setPasswordEncoder(NoOpPasswordEncoder.getInstance());
	}

	@Override
	protected void additionalAuthenticationChecks(UserDetails userDetails,
			UsernamePasswordAuthenticationToken authentication) throws AuthenticationException
	{
		Object salt = null;

		if (this.saltSource != null)
		{
			salt = this.saltSource.getSalt(userDetails);
		}

		if (authentication.getCredentials() == null)
		{
			logger.debug("Authentication failed: no credentials provided");

			throw new BadCredentialsException(
					messages.getMessage("AbstractUserDetailsAuthenticationProvider.badCredentials", "Bad credentials"));
		}

		String presentedPassword = authentication.getCredentials().toString();
		if (salt != null)
		{
			// 这里考虑对用户录入的密码进行编码后再匹配
			presentedPassword = passwordEncoder.encode(presentedPassword);
		}

		if (!passwordEncoder.matches(presentedPassword, userDetails.getPassword()))
		{
			logger.debug("Authentication failed: password does not match stored value");

			throw new BadCredentialsException(
					messages.getMessage("AbstractUserDetailsAuthenticationProvider.badCredentials", "Bad credentials"));
		}

		authentication.setDetails(userDetails);
	}

	@Override
	protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication)
			throws AuthenticationException
	{
		UserDetails loadedUser = this.getUserDetailsService().loadUserByUsername(username);

		if (loadedUser == null)
		{
			throw new InternalAuthenticationServiceException(
					"UserDetailsService returned null, which is an interface contract violation");
		}
		return loadedUser;
	}

	public void setPasswordEncoder(Object passwordEncoder)
	{
		Assert.notNull(passwordEncoder, "passwordEncoder cannot be null");

		if (passwordEncoder instanceof PasswordEncoder)
		{
			setPasswordEncoder((PasswordEncoder) passwordEncoder);
			return;
		}
		else
		{
			throw new IllegalArgumentException("passwordEncoder must be a PasswordEncoder instance");
		}

	}

	private void setPasswordEncoder(PasswordEncoder passwordEncoder)
	{
		Assert.notNull(passwordEncoder, "passwordEncoder cannot be null");

		this.userNotFoundEncodedPassword = passwordEncoder.encode(USER_NOT_FOUND_PASSWORD);
		this.passwordEncoder = passwordEncoder;
	}

	protected PasswordEncoder getPasswordEncoder()
	{
		return passwordEncoder;
	}

	public void setSaltSource(SaltSource saltSource)
	{
		this.saltSource = saltSource;
	}

	protected SaltSource getSaltSource()
	{
		return saltSource;
	}

	public void setUserDetailsService(UserDetailsService userDetailsService)
	{
		this.userDetailsService = userDetailsService;
	}

	protected UserDetailsService getUserDetailsService()
	{
		return userDetailsService;
	}

}
