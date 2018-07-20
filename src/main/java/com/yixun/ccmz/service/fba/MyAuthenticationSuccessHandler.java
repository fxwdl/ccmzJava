package com.yixun.ccmz.service.fba;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

public class MyAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler
{
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws ServletException, IOException
	{
		// request.getSession().setMaxInactiveInterval(60 * 60);

		System.out.println("成功登录，记录日志");

		super.onAuthenticationSuccess(request, response, authentication);
	}
}
