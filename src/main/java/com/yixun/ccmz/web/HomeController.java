package com.yixun.ccmz.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController
{
	@RequestMapping(value = { "/", "/index.html" })
	public String Index()
	{
		return "redirect:/account/login";
	}
}
