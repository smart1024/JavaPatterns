/**   
* @Title: Expression.java 
* @Package com.brucelee.javapatterns.interpreter 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-4-9 下午5:28:13 
*/
package com.brucelee.javapatterns.interpreter;

/** 
 * @ClassName: Expression 
 * @Description: 解释器模式：解释器模式用来做各种各样的解释器，如正则表达式等的解释器等等 
 * @author robertlee1059@163.com 
 * @date 2015-4-9 下午5:28:13 
 *  
 */
public interface Expression {
	int interpret(Context context);
}
