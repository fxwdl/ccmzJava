package com.yixun.ccmz.web;

import javax.servlet.ServletContext;

import org.springframework.web.context.ServletContextAware;

public class ResourcePathExposer implements ServletContextAware
{
	private ServletContext servletContext;
	private String resourceRoot;

	public void init()
	{
		String version = "1.0.0";

		resourceRoot = "/resources-" + version;

		getServletContext().setAttribute("resourceRoot", getServletContext().getContextPath() + resourceRoot);
	}

	@Override
	public void setServletContext(ServletContext servletContext)
	{
		this.servletContext = servletContext;
	}

	public ServletContext getServletContext()
	{
		return this.servletContext;
	}

	public String getResourceRoot()
	{
		return this.resourceRoot;
	}
}
