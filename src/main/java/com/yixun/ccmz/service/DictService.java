package com.yixun.ccmz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rosegun.plugin.Page;
import com.yixun.ccmz.dao.DictFamilymemberDao;
import com.yixun.ccmz.dao.DictStdDiseaseDao;
import com.yixun.ccmz.domain.DictFamilymember;
import com.yixun.ccmz.domain.DictStdDisease;
import com.yixun.ccmz.domain.DictStdDiseaseExample;
import com.yixun.ccmz.domain.PagingModel;
import com.yixun.ccmz.domain.DictStdDiseaseExample.Criteria;
import com.yixun.ccmz.domain.DictStdDiseaseExample.Criterion;

@Service
@Transactional
public class DictService extends BaseService
{
	@Autowired
	private DictFamilymemberDao dictFamilymemberDao;

	@Autowired
	private DictStdDiseaseDao dictStdDiseaseDao;

	public DictFamilymember getFaimliyMemberBySfzh(String sfzh)
	{
		return dictFamilymemberDao.get(sfzh);
	}

	public PagingModel<DictStdDisease> getStdDiseaseListWithPagination(int limit, int offset, String search,
			String sort, String order, int rt_id)
	{
		return dictStdDiseaseDao.getStdDiseaseListWithPagination(limit, offset, search, sort, order, rt_id);
	}
}
