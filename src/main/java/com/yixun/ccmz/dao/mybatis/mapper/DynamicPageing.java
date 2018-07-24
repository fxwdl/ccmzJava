package com.yixun.ccmz.dao.mybatis.mapper;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;

/*
 * 用于Mybatis Dynamic SQL 的分页 支持mySql
 */
public class DynamicPageing implements SelectStatementProvider
{
	private Map<String, Object> parameters = new HashMap<>();
	private String selectStatement;

	public DynamicPageing(SelectStatementProvider delegate, int limit, int offset)
	{
		parameters.putAll(delegate.getParameters());
		parameters.put("limit", limit);
		parameters.put("offset", offset);

		selectStatement = delegate.getSelectStatement() + " LIMIT #{parameters.limit} OFFSET #{parameters.offset}";
	}

	@Override
	public Map<String, Object> getParameters()
	{
		return parameters;
	}

	@Override
	public String getSelectStatement()
	{
		return selectStatement;
	}
}