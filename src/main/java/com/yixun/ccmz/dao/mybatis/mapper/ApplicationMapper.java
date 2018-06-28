package com.yixun.ccmz.dao.mybatis.mapper;

import com.yixun.ccmz.domain.Application;

public interface ApplicationMapper {
    Application selectByPrimaryKey(String applicationId);
}