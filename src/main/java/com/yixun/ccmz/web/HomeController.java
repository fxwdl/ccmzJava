package com.yixun.ccmz.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController
{
	@RequestMapping(value = { "/", "/index.html" })
	public String Index(HttpServletRequest request, HttpServletResponse response)
	{
		HttpSession session = request.getSession(true);
		if (session.getAttribute("user") == null)
		{
			return "redirect:/account/login";
		}
		else
		{
			return "index";
		}
	}
}
