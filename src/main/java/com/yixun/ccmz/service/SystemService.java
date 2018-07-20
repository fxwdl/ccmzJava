package com.yixun.ccmz.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

public interface SystemService
{
	// @Secured(value = "ROLE_管理员")
	public void reloadAllCache();
}
