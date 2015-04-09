/**   
* @Title: MySubject.java 
* @Package com.brucelee.javapatterns.visitor 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-4-9 下午4:30:12 
*/
package com.brucelee.javapatterns.visitor;

/** 
 * @ClassName: MySubject 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-4-9 下午4:30:12 
 *  
 *  被访问对象封装了一系列算法
 */
public class MySubject implements Subject {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String getSubject() {
		return "LOVE";
	}
	
}
