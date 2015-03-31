/**   
* @Title: Observer1.java 
* @Package com.brucelee.javapatterns.observer 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-31 下午5:32:27 
*/
package com.brucelee.javapatterns.observer;

/** 
 * @ClassName: Observer1 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-31 下午5:32:27 
 *  
 */
public class Observer1 implements Observer {

	@Override
	public void update() {
		System.out.println("Observer1收到通知");
	}

}
