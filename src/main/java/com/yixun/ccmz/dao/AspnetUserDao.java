package com.yixun.ccmz.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.eclipse.jdt.internal.compiler.flow.FinallyFlowContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.yixun.ccmz.domain.AspnetUser;

@Repository
public class AspnetUserDao
{
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public AspnetUser FindByName(final String username) 
	{
		if(this.jdbcTemplate==null)
		{
			
		}
		return new AspnetUser();
	}
}
