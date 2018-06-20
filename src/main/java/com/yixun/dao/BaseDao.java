package com.yixun.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T extends Serializable>
{
	public int save(T t);

	public int update(T t);

	public int delete(Serializable id);

	public T get(Serializable id);

}
