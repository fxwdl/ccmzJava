package com.yixun.ccmz.dao;

import java.util.List;

import com.yixun.ccmz.domain.SystemFunction;

public interface SystemFunctionDao
{
	List<SystemFunction> getByUserName(String userName);

	SystemFunction getById(String id);
}
