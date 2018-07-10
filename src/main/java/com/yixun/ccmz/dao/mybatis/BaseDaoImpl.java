package com.yixun.ccmz.dao.mybatis;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yixun.dao.BaseDao;

@Repository
public class BaseDaoImpl<T extends Serializable> implements BaseDao<T>
{

	private Class<T> c;

	private SqlSessionTemplate sessionTemplate;

	@Autowired
	public void setSessionTemplate(SqlSessionTemplate sessionTemplate)
	{
		this.sessionTemplate = sessionTemplate;
	}

	public SqlSessionTemplate getSessionTemplate()
	{
		return this.sessionTemplate;
	}

	protected String getStatement(String prefix)
	{
		if (c == null)
		{
			c = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		}
		String result = c.getSimpleName();
		result = "com.yixun.ccmz.dao.mybatis.mapper." + result + "Mapper." + prefix;
		return result;
	}

	@Override
	public int insert(T t)
	{
		return sessionTemplate.insert(getStatement("insert"), t);
	}

	@Override
	public int update(T t)
	{
		return sessionTemplate.update(getStatement("updateByPrimaryKey"), t);
	}

	@Override
	public int delete(Serializable id)
	{
		return sessionTemplate.delete(getStatement("deleteByPrimaryKey"), id);
	}

	@Override
	public T get(Serializable id)
	{
		return sessionTemplate.selectOne(getStatement("selectByPrimaryKey"), id);
	}
}
