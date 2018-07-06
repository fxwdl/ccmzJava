package com.yixun.ccmz.dao.mybatis.mapper;

import com.yixun.ccmz.domain.BnTreatmentreimburse;
import com.yixun.ccmz.domain.BnTreatmentreimburseExample;
import com.yixun.ccmz.dto.BnTreatmentreimburseModel;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BnTreatmentreimburseMapper
{
	long countByExample(BnTreatmentreimburseExample example);

	int deleteByExample(BnTreatmentreimburseExample example);

	int deleteByPrimaryKey(String ID);

	int insert(BnTreatmentreimburse record);

	int insertSelective(BnTreatmentreimburse record);

	List<BnTreatmentreimburse> selectByExample(BnTreatmentreimburseExample example);

	BnTreatmentreimburse selectByPrimaryKey(String ID);

	int updateByExampleSelective(@Param("record") BnTreatmentreimburse record,
			@Param("example") BnTreatmentreimburseExample example);

	int updateByExample(@Param("record") BnTreatmentreimburse record,
			@Param("example") BnTreatmentreimburseExample example);

	int updateByPrimaryKeySelective(BnTreatmentreimburse record);

	int updateByPrimaryKey(BnTreatmentreimburse record);

	// 以下自定义

	List<BnTreatmentreimburseModel> getFullInfoList(@Param("id") String id);
}