package com.yixun.ccmz.dao.mybatis.mapper;

import com.yixun.ccmz.domain.DictFamilymember;

public interface DictFamilymemberMapper {
    int deleteByPrimaryKey(String sfzh);

    int insert(DictFamilymember record);

    int insertSelective(DictFamilymember record);

    DictFamilymember selectByPrimaryKey(String sfzh);

    int updateByPrimaryKeySelective(DictFamilymember record);

    int updateByPrimaryKey(DictFamilymember record);
}