package com.yixun.ccmz.service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.base.Strings;
import com.yixun.ccmz.dao.BnTreatmentreimburseDao;
import com.yixun.ccmz.domain.BnTreatmentreimburse;
import com.yixun.ccmz.domain.enums.FinishFlag;
import com.yixun.ccmz.domain.enums.ReimType;
import com.yixun.ccmz.dto.BnTreatmentreimburseModel;
import com.yixun.infrastructure.exception.MyException;

@Service
@Transactional
public class MedicalService extends BaseService
{
	@Autowired
	private BnTreatmentreimburseDao bnTreatmentreimburseDao;

	public BnTreatmentreimburseModel GetTRItemByKey(String id)
	{
		return bnTreatmentreimburseDao.getByIdWithFullInfo(id);
	}

	public BnTreatmentreimburseModel SaveTRItem(BnTreatmentreimburseModel model) throws Exception
	{
		Validate(model);

		BnTreatmentreimburse item;
		if (Strings.isNullOrEmpty(model.getID()))
		{
			if (bnTreatmentreimburseDao.hasConflict(model.getSfzh(), model.getReim_Type_ID(), model.getOut_Date(),
					model.getTreatmentHosptial_Code(), model.getMedicare_Date(), model.getYLZ_Money(),
					model.getZL_Money(), model.getZF_Money(), model.getYBBX_Money(), model.getDBBX_Money()))
			{
				throw new MyException("检测到与医保接口一站式传入的数据项相同，请到'已报销凭证查询'功能中进行查询.");
			}
			// item = new BnTreatmentreimburse();

			item = MapTR(model);
			item.setID(UUID.randomUUID().toString());
			item.setCreate_Time(new Date());
			String prefix = "A" + new SimpleDateFormat("yyyyMM").format(item.getCreate_Time());
			String maxNO = bnTreatmentreimburseDao.getMaxReimNO(prefix);
			if (Strings.isNullOrEmpty(maxNO))
			{
				item.setReim_NO(prefix + "00001");
			}
			else
			{
				int curNO = Integer.parseInt(maxNO.substring(prefix.length()));
				curNO++;
				item.setReim_NO(prefix + String.format("%05d", curNO));
			}

			if (bnTreatmentreimburseDao.insert(item) == 0)
			{
				throw new MyException("插入数据失败");
			}
			this.MapTRModel(item, model);
		}
		else
		{
			item = bnTreatmentreimburseDao.get(model.getID());
			if (item != null)
			{
				if (item.getFinish_Flag() != FinishFlag.未救助.value())
				{
					throw new MyException("当前救助状态不是'未救助'，不允许进行修改");
				}
				item = this.MapTR(model);
				if (bnTreatmentreimburseDao.update(item) == 0)
				{
					throw new MyException("更新数据失败");
				}
			}
			else
			{
				throw new MyException("当前项目已经删除");
			}
		}

		return model;
	}

	private void Validate(BnTreatmentreimburseModel model) throws Exception
	{
		if (model.getOut_Date() == null)
		{
			throw new MyException("出院日期不能为空");
		}
		else
		{
			Date d1 = new GregorianCalendar(2016, 1, 1).getTime();
			if (model.getOut_Date().before(d1))
			{
				throw new MyException("出院日期不能小于2016-01-01");
			}
		}

		if (model.getMedicare_Date() == null)
		{
			throw new MyException("结算日期不能为空");
		}

		if (Strings.isNullOrEmpty(model.getStdDisease_Name()))
		{
			throw new MyException("疾病名称不能为空");
		}
		if (model.getReim_Type_ID() != ReimType.住院.value() && Strings.isNullOrEmpty(model.getStdDisease_Code()))
		{
			throw new MyException("医疗类别为特殊疾病或大病门诊时,必需选择疾病代码");
		}
	}
}
