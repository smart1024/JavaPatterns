/**   
* @Title: Subject.java 
* @Package com.brucelee.javapatterns.observer 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-31 下午2:58:06 
*/
package com.brucelee.javapatterns.observer;

/** 
 * @ClassName: Subject 
 * @Description: 被观察的对象 
 * @author robertlee1059@163.com 
 * @date 2015-3-31 下午2:58:06 
 *  
 */
public interface Subject {
	public void add(Observer observer);
	
	public void del(Observer observer);
	
	public void notifyObserver();
	/**
	 * 
	* @Title: operation 
	* @Description: 当作完某件事时通知所有的观察者更新状态
	* @param     设定文件 
	* @return void    返回类型 
	* @throws
	 */
	public void operation();
}
