package com.yixun.ccmz.web.business;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yixun.ccmz.domain.DictStdDisease;
import com.yixun.ccmz.domain.PagingModel;
import com.yixun.ccmz.service.DictService;
import com.yixun.ccmz.web.BaseController;
import com.yixun.infrastructure.annotation.Authenticated;

@Controller
@RequestMapping(value = "/DictStdDisease")
public class DictStdDiseaseController extends BaseController
{
	@Autowired
	private DictService dictService;

	@RequestMapping(value = "selDisease", method = RequestMethod.GET)
	public String selDisease()
	{
		return "shared/selDisease";
	}

	@RequestMapping(value = { "/getData" })
	@ResponseBody
	public PagingModel<DictStdDisease> getData(@RequestParam("limit") int limit, @RequestParam("offset") int offset,
			@RequestParam("search") String search, @RequestParam("sort") String sort,
			@RequestParam("order") String order, @RequestParam("rt_id") int rt_id)
	{
		return dictService.getStdDiseaseListWithPagination(limit, offset, search, sort, order, rt_id);
	}
}
