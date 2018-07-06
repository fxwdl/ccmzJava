package com.yixun.ccmz.dao.mybatis;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yixun.ccmz.dao.BnTreatmentreimburseDao;
import com.yixun.ccmz.dao.mybatis.mapper.BnTreatmentreimburseMapper;
import com.yixun.ccmz.domain.BnTreatmentreimburse;
import com.yixun.ccmz.dto.BnTreatmentreimburseModel;

@Repository
public class BnTreatmentreimburseDaoImpl extends BaseDaoImpl<BnTreatmentreimburse> implements BnTreatmentreimburseDao
{

	@Autowired
	private BnTreatmentreimburseMapper bnTreatmentreimburseMapper;

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

}
