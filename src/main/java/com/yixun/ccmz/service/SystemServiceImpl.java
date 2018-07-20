package com.yixun.ccmz.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

@Service
public class SystemServiceImpl implements SystemService
{
	@CacheEvict(cacheNames = { "default", "accountCache" }, allEntries = true, beforeInvocation = true)
	public void reloadAllCache()
	{

	}
}
