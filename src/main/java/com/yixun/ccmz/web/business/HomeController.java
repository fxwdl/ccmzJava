package com.yixun.ccmz.web.business;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import com.google.common.base.Strings;
import com.yixun.ccmz.domain.BnTreatmentreimburse;
import com.yixun.ccmz.domain.User;
import com.yixun.ccmz.domain.enums.FinishFlag;
import com.yixun.ccmz.domain.enums.ReimSourceType;
import com.yixun.ccmz.domain.enums.ReimType;
import com.yixun.ccmz.domain.enums.Spec_BN;
import com.yixun.ccmz.dto.BnTreatmentreimburseModel;
import com.yixun.ccmz.dto.ClientSingleObjectResult;
import com.yixun.ccmz.dto.LoginModel;
import com.yixun.ccmz.service.MedicalService;
import com.yixun.ccmz.web.BaseController;
import com.yixun.infrastructure.SpringContextHolder;
import com.yixun.infrastructure.annotation.Authenticated;

import bsh.Console;

@Controller
public class HomeController extends BaseController
{
	@Autowired
	private ApplicationContext applicationContext;

	@RequestMapping(value = { "/", "/index.html" })
	public String Index(HttpServletRequest request, HttpServletResponse response)
	{
		return "index";
	}

	@RequestMapping(value = { "/aa" })
	@ResponseBody
	public ClientSingleObjectResult<BnTreatmentreimburse> Json()
	{

		LoginModel a = new LoginModel();
		a.setUserName("aaa");
		a.setNow(new Date());

		BnTreatmentreimburse b = new BnTreatmentreimburse();
		b.setTypeIn_Date(new Date());
		try
		{
			RequestMappingHandlerAdapter adapter = applicationContext.getBean(RequestMappingHandlerAdapter.class);
			adapter.getMessageConverters().forEach(p ->
			{
				System.out.println(p.getClass().getName());
			});
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ClientSingleObjectResult<BnTreatmentreimburse> rrr = new ClientSingleObjectResult<BnTreatmentreimburse>();
		rrr.setData(b);
		return rrr;
	}

}
