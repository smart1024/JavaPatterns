/**   
* @Title: Visitor.java 
* @Package com.brucelee.javapatterns.visitor 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-4-9 下午4:25:16 
*/
package com.brucelee.javapatterns.visitor;

/** 
 * @ClassName: Visitor 
 * @Description: 访问者模式适用于数据结构相对稳定，算法易变化的系统。
 * @author robertlee1059@163.com 
 * @date 2015-4-9 下午4:25:16 
 *  
 */
public interface Visitor {
	void visit(Subject sub);
}
