/**   
* @Title: User.java 
* @Package com.brucelee.javapatterns.mediator 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-4-9 下午5:04:51 
*/
package com.brucelee.javapatterns.mediator;

/** 
 * @ClassName: User 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-4-9 下午5:04:51 
 *  
 */
public abstract class User {
	private Mediator mediator;
	public User(Mediator mediator){
		this.mediator=mediator;
	}
	public Mediator getMediator() {
		return mediator;
	}
	public abstract void work();
}
