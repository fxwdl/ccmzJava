package com.yixun.ccmz.service.fba;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

public class MyAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler
{

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException
	{

		System.out.println("验证登录失败");
		// this.setDefaultFailureUrl("/login?error=用户名或密码错误");
		super.onAuthenticationFailure(request, response, exception);
	}

}
