package com.yixun.ccmz.dao.mybatis;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yixun.ccmz.dao.BnTreatmentreimburseDao;
import com.yixun.ccmz.dao.mybatis.mapper.BnTreatmentreimburseMapper;
import com.yixun.ccmz.domain.BnTreatmentreimburse;
import com.yixun.ccmz.domain.BnTreatmentreimburseExample;
import com.yixun.ccmz.domain.BnTreatmentreimburseExample.*;
import com.yixun.ccmz.domain.enums.FinishFlag;
import com.yixun.ccmz.dto.BnTreatmentreimburseModel;

@Repository
public class BnTreatmentreimburseDaoImpl extends BaseDaoImpl<BnTreatmentreimburse> implements BnTreatmentreimburseDao
{

	@Autowired
	private BnTreatmentreimburseMapper bnTreatmentreimburseMapper;

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public BnTreatmentreimburseModel getByIdWithFullInfo(String id)
	{
		List<BnTreatmentreimburseModel> result = bnTreatmentreimburseMapper.getFullInfoList(id);
		Optional<BnTreatmentreimburseModel> op = result.stream().findFirst();
		if (op.isPresent())
		{
			return op.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public boolean hasConflict(String sfzh, int reim_type_id, Date out_date, String treatmentHosptial_code,
			Date medicare_date, BigDecimal ylz_money, BigDecimal zl_money, BigDecimal zf_money, BigDecimal ybbx_money,
			BigDecimal dbbx_money)
	{
		BnTreatmentreimburseExample ex = new BnTreatmentreimburseExample();

		Criteria ca = ex.createCriteria();
		ca = ca.andSfzhEqualTo(sfzh).andReim_Type_IDEqualTo(reim_type_id).andOut_DateEqualTo(out_date)
				.andTreatmentHosptial_CodeEqualTo(treatmentHosptial_code).andMedicare_DateEqualTo(medicare_date)
				.andYLZ_MoneyEqualTo(ylz_money).andZL_MoneyEqualTo(zl_money).andZF_MoneyEqualTo(zf_money)
				.andYBBX_MoneyEqualTo(ybbx_money).andDBBX_MoneyEqualTo(dbbx_money)
				.andXNH_MoneyEqualTo(new BigDecimal(0)).andFinish_FlagEqualTo(FinishFlag.已救助.value())
				.andYB_InfoIsNotNull();

		Criterion c1 = new Criterion("CHAR_LENGTH(YB_Info)>0");

		ca.getAllCriteria().add(c1);

		long c = bnTreatmentreimburseMapper.countByExample(ex);

		return c > 0;
	}

	@Override
	public String getMaxReimNO(String prefix)
	{
		return bnTreatmentreimburseMapper.getMaxReimNO(prefix + "%");
	}

}
