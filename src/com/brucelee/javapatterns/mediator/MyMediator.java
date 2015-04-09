/**   
 * @Title: MyMediator.java 
 * @Package com.brucelee.javapatterns.mediator 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author robertlee1059@163.com   
 * @date 2015-4-9 下午5:04:12 
 */
package com.brucelee.javapatterns.mediator;

/**
 * @ClassName: MyMediator
 * @Description: 
 *               中介者模式也是用来降低类类之间的耦合的，因为如果类类之间有依赖关系的话，不利于功能的拓展和维护，因为只要修改一个对象，其它关联的对象都得进行修改
 *               。如果使用中介者模式，只需关心和Mediator类的关系，具体类类之间的关系及调度交给Mediator就行
 * @author robertlee1059@163.com
 * @date 2015-4-9 下午5:04:12
 * 
 */
public class MyMediator implements Mediator {

	private User user1;
	private User user2;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.brucelee.javapatterns.mediator.Mediator#createMediator()
	 */
	@Override
	public void createMediator() {
		user1 = new User1(this);
		user2 = new User2(this);
	}

	@Override
	public void workAll() {
		user1.work();
		user2.work();
	}

}
