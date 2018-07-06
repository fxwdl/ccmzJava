package com.yixun.infrastructure;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringContextHolder implements ApplicationContextAware, BeanNameAware
{
	private static ApplicationContext applicationContext = null;

	/**
	 * 获取静态变量中的ApplicationContext.
	 * 
	 * @throws Exception
	 */
	public static ApplicationContext getApplicationContext() throws Exception
	{
		assertContextInjected();
		return applicationContext;
	}

	/**
	 * 从静态变量applicationContext中得到Bean, 自动转型为所赋值对象的类型.
	 * 
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getBean(String name) throws Exception
	{
		assertContextInjected();
		return (T) applicationContext.getBean(name);
	}

	/**
	 * 从静态变量applicationContext中得到Bean, 自动转型为所赋值对象的类型.
	 * 
	 * @throws Exception
	 */
	public static <T> T getBean(Class<T> requiredType) throws Exception
	{
		assertContextInjected();
		return applicationContext.getBean(requiredType);
	}

	/**
	 * 清除SpringContextHolder中的ApplicationContext为Null.
	 */
	public static void clearHolder()
	{
		applicationContext = null;
	}

	/**
	 * 实现ApplicationContextAware接口, 注入Context到静态变量中.
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
	{
		SpringContextHolder.applicationContext = applicationContext;
	}

	/**
	 * 检查ApplicationContext不为空.
	 * 
	 * @throws Exception
	 */
	private static void assertContextInjected() throws Exception
	{
		if (applicationContext == null)
		{
			throw new Exception("applicaitonContext属性未注入, 请在applicationContext.xml中定义SpringContextHolder.");
		}

	}

	@Override
	public void setBeanName(String name)
	{
		System.out.println(name);
	}

}
