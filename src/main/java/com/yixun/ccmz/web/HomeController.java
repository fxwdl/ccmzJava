package com.yixun.ccmz.web;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yixun.ccmz.dao.*;
import com.yixun.ccmz.dto.LoginModel;

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

	@RequestMapping(value = { "/json" })
	@ResponseBody
	public ArrayList<LoginModel> Json()
	{
		ArrayList<LoginModel> l = new ArrayList<LoginModel>();

		LoginModel a = new LoginModel();
		a.setUserName("aaa");

		l.add(a);
		a = new LoginModel();
		a.setUserName("bbb");
		l.add(a);

		return l;
	}
}
