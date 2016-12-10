package com.imooc.test.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.bean.BeanScope;
import com.imooc.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScope extends UnitTestBase {
	
	// 加载配置文件 初始化 形成容器
	public TestBeanScope() {
		super("classpath*:spring-beanscope.xml");
	}
	
	@Test
	public void testSay() {
		// 获取bean的实例
		BeanScope beanScope = super.getBean("beanScope");
		beanScope.say();
		// 在单元测试中 一个方法内 单例模式时 不管 bean实例化多少次 始终只有一个bean被创建
		BeanScope beanScope2 = super.getBean("beanScope");
		beanScope2.say();
	}
	
	// 在单元测试中 不同方法内 单例模式时 原理上不管 bean实例化多少次 始终只有一个bean被创建
	// 但是单元测试的执行原理是每个方法执行结束后自动关闭 所以两个方法的实例不是一个实例 但实际项目里 不管加载几个方法 单例模式下只会产生一个实例
	@Test
	public void testSay2() {
		BeanScope beanScope  = super.getBean("beanScope");
		beanScope.say();
	}

}
