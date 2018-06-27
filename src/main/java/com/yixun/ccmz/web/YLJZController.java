package com.yixun.ccmz.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/yljz")
public class YLJZController extends BaseController
{
	@RequestMapping(value = "newItem", method = RequestMethod.GET)
	public String newItem()
	{
		this.initSystemMenu();
		return "yljz/newItem";
	}
}
