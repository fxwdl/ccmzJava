package com.yixun.ccmz.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.session.SqlSessionFactory;
import org.eclipse.jdt.internal.compiler.flow.FinallyFlowContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.yixun.ccmz.domain.AspnetUser;
import com.yixun.ccmz.domain.User;

public interface UserDao
{
	User getByUserName(String userName);
}
