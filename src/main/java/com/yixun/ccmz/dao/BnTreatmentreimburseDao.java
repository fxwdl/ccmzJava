package com.yixun.ccmz.dao;

import java.math.BigDecimal;
import java.util.Date;

import com.yixun.ccmz.domain.BnTreatmentreimburse;
import com.yixun.ccmz.dto.BnTreatmentreimburseModel;
import com.yixun.dao.BaseDao;

public interface BnTreatmentreimburseDao extends BaseDao<BnTreatmentreimburse>
{
	public BnTreatmentreimburseModel getByIdWithFullInfo(String id);

	public boolean hasConflict(String sfzh, int reim_type_id, Date out_date, String treatmentHosptial_code,
			Date medicare_date, BigDecimal ylz_money, BigDecimal zl_money, BigDecimal zf_money, BigDecimal ybbx_money,
			BigDecimal dbbx_money);

	public String getMaxReimNO(String prefix);
}
