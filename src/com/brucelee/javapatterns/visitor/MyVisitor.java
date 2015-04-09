/**   
* @Title: MyVisitor.java 
* @Package com.brucelee.javapatterns.visitor 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-4-9 下午4:27:58 
*/
package com.brucelee.javapatterns.visitor;

/** 
 * @ClassName: MyVisitor 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-4-9 下午4:27:58 
 *  
 */
public class MyVisitor implements Visitor {

	
	@Override
	public void visit(Subject sub) {//getSubject()获取将要被访问的属性，
		System.out.println("Visit the Subjects "+sub.getSubject());
	}

}
