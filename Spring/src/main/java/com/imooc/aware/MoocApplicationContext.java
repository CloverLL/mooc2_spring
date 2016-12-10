package com.imooc.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class MoocApplicationContext implements ApplicationContextAware  {
	
//	private ApplicationContext applicationContext ;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		
		// 对Application进行注入到当前类中 并在类中用方法进行操作或者判断 一般不建议使用 避免错误
//		this.applicationContext = applicationContext ;
		
		System.out.println("MoocApplicationContext : " + applicationContext.getBean("moocApplicationContext").hashCode());
	}
	
}
