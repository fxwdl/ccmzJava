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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yixun.ccmz.domain.User;
import com.yixun.ccmz.dto.BnTreatmentreimburseModel;
import com.yixun.ccmz.dto.ClientSingleObjectResult;
import com.yixun.ccmz.dto.LoginModel;

@Controller
@RequestMapping(value = "/account")
public class AccountController extends BaseController
{
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(HttpServletRequest request, Model model)
	{
		model.addAttribute("title", "长春市医疗救助管理系统");
		model.addAttribute("user", new LoginModel());
		return getViewName("login");
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("user") LoginModel user)
	{
		ModelAndView m = new ModelAndView();
		try
		{
			this.getAccountService().ValidateUser(user.getUserName(), user.getPassword());
			// m.setViewName("redirect:/");
		}
		catch (Exception ex)
		{
			HashSet<String> modelState = new HashSet<String>();
			modelState.add("用户名或密码错误!");
			m.addObject("modelState", modelState);
			m.setViewName(getViewName("login"));
			m.addObject("title", "长春市医疗救助管理系统");
		}

		return m;
	}

	@RequestMapping(value = "GetCurUserInfo", method = RequestMethod.GET)
	@ResponseBody
	public ClientSingleObjectResult<User> GetCurUserInfo()
	{
		ClientSingleObjectResult<User> r = new ClientSingleObjectResult<User>();
		if (this.getUser() != null)
		{
			r.setSuccess(true);
			r.setMsg("");
			;
			r.setData(this.getUser());
		}
		else
		{
			r.setSuccess(false);
			r.setMsg("当前用户未登录");
		}
		return r;
	}
}
