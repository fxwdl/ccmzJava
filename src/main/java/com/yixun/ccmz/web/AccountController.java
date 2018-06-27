package com.yixun.ccmz.web;

import java.util.HashSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yixun.ccmz.dto.LoginModel;

@Controller
@RequestMapping(value = "/account")
public class AccountController extends BaseController
{
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(Model model)
	{
		model.addAttribute("user", new LoginModel());
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("user") LoginModel user)
	{
		ModelAndView m = new ModelAndView();
		if (this.getAccountService().ValidateUser(user.getUserName(), user.getPassword()))
		{
			HttpSession session = request.getSession(true);
			session.setAttribute("user", user.getUserName());
			m.setViewName("redirect:/");
		}
		else
		{
			java.util.HashSet<String> modelState = new HashSet<String>();
			modelState.add("用户名或密码错误!");
			m.addObject("modelState", modelState);
			m.addObject("user", user);
			m.setViewName("login");
		}
		return m;
	}
}
