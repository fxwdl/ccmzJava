package com.yixun.ccmz.service.fba;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

public class MyAuthenticationSuccessHandler implements AuthenticationSuccessHandler // extends
																					// SavedRequestAwareAuthenticationSuccessHandler
{

	// @Override
	// public void onAuthenticationSuccess(HttpServletRequest request,
	// HttpServletResponse response,
	// Authentication authentication) throws ServletException, IOException
	// {
	// // request.getSession().setMaxInactiveInterval(60 * 60);
	//
	// System.out.println("成功登录，记录日志");
	//
	// // response.sendRedirect(request.getContextPath() + "/index");
	//
	// super.onAuthenticationSuccess(request, response, authentication);
	// }

	protected Log logger = LogFactory.getLog(this.getClass());

	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException
	{

		handle(request, response, authentication);
		clearAuthenticationAttributes(request);
	}

	protected void handle(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException
	{

		String targetUrl = determineTargetUrl(authentication);

		if (response.isCommitted())
		{
			logger.debug("Response has already been committed. Unable to redirect to " + targetUrl);
			return;
		}

		redirectStrategy.sendRedirect(request, response, targetUrl);
	}

	protected String determineTargetUrl(Authentication authentication)
	{
		return "/index";
	}

	protected void clearAuthenticationAttributes(HttpServletRequest request)
	{
		HttpSession session = request.getSession(false);
		if (session == null)
		{
			return;
		}
		session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
	}

	public void setRedirectStrategy(RedirectStrategy redirectStrategy)
	{
		this.redirectStrategy = redirectStrategy;
	}

	protected RedirectStrategy getRedirectStrategy()
	{
		return redirectStrategy;
	}

}
