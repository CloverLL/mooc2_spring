package com.imooc.autowiring;

/**
 * 业务管理层 调用控制层
 * @author Clover
 *
 */
public class AutoWiringService {
	
	private AutoWiringDAO autoWiringDAO;
	
	/**
	 * 构造装配
	 * @param autoWiringDAO
	 */
	public AutoWiringService(AutoWiringDAO autoWiringDAO) {
		System.out.println("AutoWiringService");
		this.autoWiringDAO = autoWiringDAO;
	}
	
	/**
	 * byName、byType装配需要 set方法
	 * @param autoWiringDAO
	 */
	public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
		System.out.println("setAutoWiringDAO");
		this.autoWiringDAO = autoWiringDAO;
	}
	
	/**
	 * 调用传入对象的方法
	 * @param word
	 */
	public void say(String word) {
		this.autoWiringDAO.say(word);
	}

}
