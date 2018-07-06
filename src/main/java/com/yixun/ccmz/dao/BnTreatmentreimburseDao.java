package com.yixun.ccmz.dao;

import com.yixun.ccmz.domain.BnTreatmentreimburse;
import com.yixun.ccmz.dto.BnTreatmentreimburseModel;
import com.yixun.dao.BaseDao;

public interface BnTreatmentreimburseDao extends BaseDao<BnTreatmentreimburse>
{
	public BnTreatmentreimburseModel getByIdWithFullInfo(String id);
}
