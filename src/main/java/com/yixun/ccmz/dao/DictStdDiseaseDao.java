package com.yixun.ccmz.dao;

import java.util.*;

import com.yixun.ccmz.domain.DictStdDisease;
import com.yixun.ccmz.domain.PagingModel;
import com.yixun.dao.BaseDao;

public interface DictStdDiseaseDao extends BaseDao<DictStdDisease>
{
	public PagingModel<DictStdDisease> getStdDiseaseListWithPagination(int limit, int offset, String search,
			String sort, String order, int rt_id);
}
