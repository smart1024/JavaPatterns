/**   
* @Title: Subject.java 
* @Package com.brucelee.javapatterns.visitor 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-4-9 下午4:26:28 
*/
package com.brucelee.javapatterns.visitor;

/** 
 * @ClassName: Subject 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-4-9 下午4:26:28 
 *  
 */
public interface Subject {
	void accept(Visitor visitor);
	String getSubject();
}
