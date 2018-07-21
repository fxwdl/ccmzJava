package com.yixun.ccmz.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yixun.ccmz.domain.User;
import com.yixun.ccmz.dto.ClientSingleObjectResult;
import com.yixun.ccmz.service.SystemService;

@Controller
@RequestMapping(value = "/system")
public class SystemController
{
	@Autowired
	private SystemService systemService;

	// 启用CGLib代理，必需要有构造函数
	public SystemController()
	{

	}

	@RequestMapping(value = "reloadAllCache", method = RequestMethod.GET)
	@ResponseBody
	@Secured(value = "ROLE_管理员")
	// @PreAuthorize("hasRole('ROLE_管理员')")
	public ModelAndView reloadAllCache()
	{
		ModelAndView m = new ModelAndView();
		try
		{
			systemService.reloadAllCache();
			m.addObject("msg", "成功清除所有缓存");
			m.setViewName("success");
		}
		catch (Exception e)
		{
			m.addObject("msg", e.getMessage());
			m.setViewName("error");
		}
		return m;
	}
}
