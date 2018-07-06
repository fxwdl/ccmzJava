package com.yixun.ccmz.web;

import java.math.BigDecimal;
import java.security.interfaces.RSAKey;
import java.time.LocalDateTime;
import java.util.Date;

import javax.jws.WebParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.base.Strings;
import com.yixun.ccmz.domain.User;
import com.yixun.ccmz.domain.enums.FinishFlag;
import com.yixun.ccmz.domain.enums.ReimSourceType;
import com.yixun.ccmz.domain.enums.ReimType;
import com.yixun.ccmz.domain.enums.Spec_BN;
import com.yixun.ccmz.dto.BnTreatmentreimburseModel;
import com.yixun.ccmz.dto.ClientSingleObjectResult;
import com.yixun.ccmz.service.MedicalService;

@Controller
@RequestMapping(value = "/yljz")
public class YLJZController extends BaseController
{
	@Autowired
	private MedicalService medicalService;

	@RequestMapping(value = "newItem", method = RequestMethod.GET)
	public String newItem()
	{
		this.initSystemMenu();
		return "yljz/newItem";
	}

	@RequestMapping(value = "GetTRItemById", method = RequestMethod.GET)
	@ResponseBody
	public ClientSingleObjectResult<BnTreatmentreimburseModel> GetTRItemById(
			@RequestParam(name = "id", required = false) String id)
	{
		BnTreatmentreimburseModel r;
		if (Strings.isNullOrEmpty(id))
		{
			r = new BnTreatmentreimburseModel();
			r.setReim_Source(ReimSourceType.外转.value());
			r.setReim_Type_ID(ReimType.门诊大病.value());
			r.setFinish_Flag(FinishFlag.未救助.value());
			r.setSelfBaseMoney(new BigDecimal(0));
			r.setSpec_BN(Spec_BN.无.value());
			r.setCYDBBC_Money(new BigDecimal(0));
			r.setSelBaseMoney_ZY_Total(new BigDecimal(0));
			r.setGR_Accout_Pay(new BigDecimal(0));
			r.setYB_Other_Pay(new BigDecimal(0));
			r.setYLZ_Money(new BigDecimal(0));
			r.setZL_Money(new BigDecimal(0));
			r.setZF_Money(new BigDecimal(0));
			r.setMedicare_Line(new BigDecimal(0));
			r.setDBBX_Money(new BigDecimal(0));
			r.setYBBX_Money(new BigDecimal(0));
			r.setXNH_Money(new BigDecimal(0));
			r.setCYDBBC_Money(new BigDecimal(0));
			r.setGR_Money(new BigDecimal(0));

			// 目前日期值被序列化成了整数，在前端做了转换，也可以在后面指定序列化的方式http://www.baeldung.com/jackson-serialize-dates
			r.setTypeIn_Date(new Date());
			r.setApply_Date(r.getTypeIn_Date());

			User u = this.getCurrentUser();
			if (u != null)
			{
				r.setOperator_ID(u.getUserId());
				r.setOperator_Name(u.getCNName());
				if (!Strings.isNullOrEmpty(u.getHospitalID()))
				{
					r.setApply_Hospital_ID(u.getHospitalID());
				}
			}

		}
		else
		{
			r = medicalService.GetTRItemByKey(id);
		}

		return new ClientSingleObjectResult<BnTreatmentreimburseModel>(true, "", r);
	}
}
