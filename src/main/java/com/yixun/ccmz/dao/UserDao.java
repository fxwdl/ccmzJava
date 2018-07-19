package com.yixun.ccmz.dao;

import com.yixun.ccmz.domain.User;
import com.yixun.dao.BaseDao;

public interface UserDao extends BaseDao<User>
{
	User getByUserName(String userName);
}
