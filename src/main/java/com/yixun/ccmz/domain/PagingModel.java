package com.yixun.ccmz.domain;

import java.util.*;

public class PagingModel<T>
{
	private Long total;
	private List<T> rows;

	public Long getTotal()
	{
		return total;
	}

	public void setTotal(Long total)
	{
		this.total = total;
	}

	public List<T> getRows()
	{
		return rows;
	}

	public void setRows(List<T> rows)
	{
		this.rows = rows;
	}

}
