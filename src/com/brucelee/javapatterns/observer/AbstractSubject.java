/**   
* @Title: AbstractSubject.java 
* @Package com.brucelee.javapatterns.observer 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-31 下午3:40:39 
*/
package com.brucelee.javapatterns.observer;

import java.util.Enumeration;
import java.util.Vector;

/** 
 * @ClassName: AbstractSubject 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-31 下午3:40:39 
 *  
 */
public abstract class AbstractSubject implements Subject {
	private Vector<Observer> vector =new Vector<Observer>();
	@Override
	public void add(Observer observer) {
		vector.add(observer);
	}
	@Override
	public void del(Observer observer) {
		vector.remove(observer);
	}
	
	@Override
	public void notifyObserver() {
		Enumeration<Observer> elements = vector.elements();
		while (elements.hasMoreElements()) {
			Observer observer = (Observer) elements.nextElement();
			observer.update();
		}
	}
}
