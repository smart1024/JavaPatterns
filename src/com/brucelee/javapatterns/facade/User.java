/**   
* @Title: User.java 
* @Package com.brucelee.javapatterns.facade 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-30 上午11:55:00 
*/
package com.brucelee.javapatterns.facade;

/** 
 * @ClassName: User 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-30 上午11:55:00 
 *  
 */
public class User {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	public static void main(String[] args) {
		Computer computer=new Computer();
		computer.startup();
		computer.shutdown();
	}

}
