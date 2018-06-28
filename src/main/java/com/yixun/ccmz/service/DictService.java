package com.yixun.ccmz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yixun.ccmz.dao.DictFamilymemberDao;
import com.yixun.ccmz.domain.DictFamilymember;

@Service
@Transactional
public class DictService
{
	@Autowired
	private DictFamilymemberDao dictFamilymemberDao;

	public DictFamilymember getFaimliyMemberBySfzh(String sfzh)
	{
		return dictFamilymemberDao.get(sfzh);
	}
}
