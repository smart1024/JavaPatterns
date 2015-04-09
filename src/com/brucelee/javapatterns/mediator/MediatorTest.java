/**   
* @Title: MediatorTest.java 
* @Package com.brucelee.javapatterns.mediator 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-4-9 下午5:14:39 
*/
package com.brucelee.javapatterns.mediator;

/** 
 * @ClassName: MediatorTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-4-9 下午5:14:39 
 *  
 */
public class MediatorTest {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	public static void main(String[] args) { 
		Mediator myMediator = new MyMediator();//得到一个中介，去找人帮我做事，就这么简单
		myMediator.createMediator();
		myMediator.workAll();
	}

}
