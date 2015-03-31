/**   
* @Title: MySubject.java 
* @Package com.brucelee.javapatterns.observer 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-31 下午5:36:17 
*/
package com.brucelee.javapatterns.observer;

/** 
 * @ClassName: MySubject 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-31 下午5:36:17 
 *  
 */
public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		notifyObserver();
	}
	

}
