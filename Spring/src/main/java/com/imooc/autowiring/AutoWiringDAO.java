package com.imooc.autowiring;

/**
 * 数据操作 Spring中被注解controller替代
 * @author Clover
 *
 */
public class AutoWiringDAO {
	
	public void say(String word) {
		System.out.println("AutoWiringDAO : " + word);
	}

}
