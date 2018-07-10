package com.yixun.ccmz.web;

import java.math.BigDecimal;
import java.security.interfaces.RSAKey;
import java.time.LocalDateTime;
import java.util.Date;

import javax.jws.WebParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

	@RequestMapping(value = "GetTRItemById", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public ClientSingleObjectResult<BnTreatmentreimburseModel> GetTRItemById(
			@RequestParam(name = "id", required = false) String id)
	{
		try
		{
			BnTreatmentreimburseModel r;
			if (Strings.isNullOrEmpty(id))
			{
				r = new BnTreatmentreimburseModel();
				r.setReim_Source(ReimSourceType.外转.value());
				r.setReim_Type_ID(ReimType.门诊大病.value());
				r.setFinish_Flag(FinishFlag.未救助.value());
				r.setSelfBaseMoney(BigDecimal.ZERO);
				r.setSpec_BN(Spec_BN.无.value());
				r.setCYDBBC_Money(BigDecimal.ZERO);
				r.setSelBaseMoney_ZY_Total(BigDecimal.ZERO);
				r.setGR_Accout_Pay(BigDecimal.ZERO);
				r.setYB_Other_Pay(BigDecimal.ZERO);
				r.setYLZ_Money(BigDecimal.ZERO);
				r.setZL_Money(BigDecimal.ZERO);
				r.setZF_Money(BigDecimal.ZERO);
				r.setMedicare_Line(BigDecimal.ZERO);
				r.setDBBX_Money(BigDecimal.ZERO);
				r.setYBBX_Money(BigDecimal.ZERO);
				r.setXNH_Money(BigDecimal.ZERO);
				r.setCYDBBC_Money(BigDecimal.ZERO);
				r.setGR_Money(BigDecimal.ZERO);
				r.setPay_Type(0);
				r.setTreatmentHosptial_Code("");
				r.setYLJZ_Money(BigDecimal.ZERO);

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
		catch (Exception e)
		{
			return new ClientSingleObjectResult<BnTreatmentreimburseModel>(false, e.getMessage(), null);
		}
	}

	@RequestMapping(value = "SaveTRItem", method = RequestMethod.POST)
	@ResponseBody
	public ClientSingleObjectResult<BnTreatmentreimburseModel> SaveTRItem(@RequestBody BnTreatmentreimburseModel model)
	{
		try
		{
			model = medicalService.SaveTRItem(model);
			return new ClientSingleObjectResult<BnTreatmentreimburseModel>(true, "", model);
		}
		catch (Exception e)
		{
			return new ClientSingleObjectResult<BnTreatmentreimburseModel>(false, e.getMessage(), null);
		}
	}
}
