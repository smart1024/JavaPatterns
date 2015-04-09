/**   
* @Title: User1.java 
* @Package com.brucelee.javapatterns.mediator 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-4-9 下午5:09:04 
*/
package com.brucelee.javapatterns.mediator;

/** 
 * @ClassName: User1 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-4-9 下午5:09:04 
 *  
 */
public class User2 extends User {
	
	public User2(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("User2 work!");
	}

}
