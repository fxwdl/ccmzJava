package com.yixun.ccmz.web;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yixun.ccmz.domain.DictStdDisease;
import com.yixun.ccmz.dto.PagingModel;

@Controller
@RequestMapping(value = "/DictStdDisease")
public class DictStdDiseaseController extends BaseController
{
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
		PagingModel<DictStdDisease> result = new PagingModel<DictStdDisease>();

		result.setTotal(1);

		DictStdDisease d = new DictStdDisease();
		d.setCode("001");
		d.setName("大病啊啊");
		d.setRT_ID(15);
		d.setShortName("DB");

		List<DictStdDisease> l = new ArrayList<DictStdDisease>();
		l.add(d);

		result.setRows(l);

		return result;
	}
}
