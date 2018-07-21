package com.yixun.ccmz.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

@Service
public class SystemService
{
	// @Secured(value = "ROLE_管理员")
	@CacheEvict(cacheNames = { "default", "accountCache" }, allEntries = true, beforeInvocation = true)
	public void reloadAllCache()
	{

	}
}
