package com.yixun.ccmz.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yixun.ccmz.domain.User;
import com.yixun.ccmz.dto.ClientSingleObjectResult;
import com.yixun.ccmz.service.SystemService;

@Controller
@RequestMapping(value = "/system")
public class SystemController
{
	@Autowired
	private SystemService systemService;

	@RequestMapping(value = "reloadAllCache", method = RequestMethod.GET)
	@ResponseBody
	@Secured(value = "ROLE_管理员")
	// @PreAuthorize("hasRole('ROLE_管理员')")
	public ClientSingleObjectResult<String> reloadAllCache()
	{
		ClientSingleObjectResult<String> r = new ClientSingleObjectResult<String>();
		try
		{
			systemService.reloadAllCache();
			r.setSuccess(true);
			r.setMsg("成功清除所有缓存");
		}
		catch (Exception ex)
		{
			r.setSuccess(false);
			r.setMsg(ex.getMessage());
		}

		return r;
	}
}
