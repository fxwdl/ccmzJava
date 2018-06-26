package com.yixun.ccmz.dao.mybatis.mapper;

import com.yixun.ccmz.domain.SystemFunction;
import com.yixun.ccmz.domain.SystemFunctionExample;
import com.yixun.ccmz.domain.User;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemFunctionMapper
{
	int countByExample(SystemFunctionExample example);

	int deleteByExample(SystemFunctionExample example);

	int deleteByPrimaryKey(String permissionId);

	int insert(SystemFunction record);

	int insertSelective(SystemFunction record);

	List<SystemFunction> selectByExample(SystemFunctionExample example);

	SystemFunction selectByPrimaryKey(String permissionId);

	int updateByExampleSelective(@Param("record") SystemFunction record,
			@Param("example") SystemFunctionExample example);

	int updateByExample(@Param("record") SystemFunction record, @Param("example") SystemFunctionExample example);

	int updateByPrimaryKeySelective(SystemFunction record);

	int updateByPrimaryKey(SystemFunction record);

	// 以下自定义

	List<SystemFunction> getByUserName(String userName);
}