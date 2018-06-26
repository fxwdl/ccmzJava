package com.yixun.ccmz.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yixun.ccmz.dao.SystemFunctionDao;
import com.yixun.ccmz.dao.mybatis.mapper.SystemFunctionMapper;
import com.yixun.ccmz.domain.SystemFunction;

@Repository
public class SystemFunctionDaoImpl extends BaseDaoImpl<SystemFunction> implements SystemFunctionDao
{
	@Autowired
	private SystemFunctionMapper systemFunctionMapper;

	@Override
	public List<SystemFunction> getByUserName(String userName)
	{
		return systemFunctionMapper.getByUserName(userName);
	}

	@Override
	public SystemFunction getById(String id)
	{
		return systemFunctionMapper.selectByPrimaryKey(id);
	}

}
