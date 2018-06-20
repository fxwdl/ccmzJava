package com.yixun.ccmz.dao.mybatis;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yixun.ccmz.dao.UserDao;
import com.yixun.ccmz.dao.mybatis.mapper.UserMapper;
import com.yixun.ccmz.domain.User;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao
{

	@Autowired
	private UserMapper userMapper;

	@Override
	public User getByUserName(String userName)
	{
		return userMapper.getByUserName(userName);
	}

}
