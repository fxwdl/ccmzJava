package com.yixun.ccmz.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yixun.ccmz.domain.DictFamilymember;
import com.yixun.ccmz.service.DictService;
import com.yixun.infrastructure.annotation.AuthenticatedController;

@AuthenticatedController
@RequestMapping(value = "/DictFamilyMember")
public class DictFamilyMemberController extends BaseController
{

	@Autowired
	private DictService dictService;

	@RequestMapping(value = "getData/{sfzh}", method = RequestMethod.GET)
	@ResponseBody
	public DictFamilymember GetData(@PathVariable String sfzh)
	{
		return dictService.getFaimliyMemberBySfzh(sfzh);
	}
}
