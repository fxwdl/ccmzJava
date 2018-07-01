package com.yixun.ccmz.dao.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.rosegun.plugin.Page;
import com.yixun.ccmz.dao.DictStdDiseaseDao;
import com.yixun.ccmz.dao.mybatis.mapper.DictStdDiseaseMapper;
import com.yixun.ccmz.domain.DictStdDisease;
import com.yixun.ccmz.domain.DictStdDiseaseExample;
import com.yixun.ccmz.domain.PagingModel;
import com.yixun.ccmz.domain.DictStdDiseaseExample.Criteria;
import com.yixun.ccmz.domain.DictStdDiseaseExample.Criterion;

@Repository
public class DictStdDiseaseDaoImpl extends BaseDaoImpl<DictStdDisease> implements DictStdDiseaseDao
{

	@Autowired
	private DictStdDiseaseMapper dictStdDiseaseMapper;

	@Override
	public PagingModel<DictStdDisease> getStdDiseaseListWithPagination(int limit, int offset, String search,
			String sort, String order, int rt_id)
	{
		DictStdDiseaseExample ex = new DictStdDiseaseExample();
		ex.setPage(new Page(offset, limit));

		ex.setOrderByClause(sort + " " + order);

		Criteria ca = ex.createCriteria().andRT_IDEqualTo(rt_id);

		if (!Strings.isNullOrEmpty(search))
		{
			// 对%转义需要%%，其中，%1$表示的是第一个参数，后面的s表示输出字符串
			String s = String.format("(Name like '%%%1$s%%' or ShortName like '%%%1$s%%' or Code like '%%%1$s%%')",
					search);
			Criterion c1 = new Criterion(s);

			ca.getAllCriteria().add(c1);
		}

		PagingModel<DictStdDisease> result = new PagingModel<DictStdDisease>();

		result.setRows(dictStdDiseaseMapper.selectByExample(ex));

		result.setTotal(dictStdDiseaseMapper.countByExample(ex));

		return result;
	}

}
