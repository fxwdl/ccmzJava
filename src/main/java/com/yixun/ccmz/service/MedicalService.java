package com.yixun.ccmz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yixun.ccmz.dao.BnTreatmentreimburseDao;
import com.yixun.ccmz.domain.BnTreatmentreimburse;
import com.yixun.ccmz.dto.BnTreatmentreimburseModel;

@Service
@Transactional
public class MedicalService
{
	@Autowired
	private BnTreatmentreimburseDao bnTreatmentreimburseDao;

	public BnTreatmentreimburseModel GetTRItemByKey(String id)
	{
		return bnTreatmentreimburseDao.getByIdWithFullInfo(id);
	}
}
