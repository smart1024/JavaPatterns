/**   
* @Title: Plus.java 
* @Package com.brucelee.javapatterns.interpreter 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-4-9 下午5:29:47 
*/
package com.brucelee.javapatterns.interpreter;

/** 
 * @ClassName: Plus 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-4-9 下午5:29:47 
 *  
 */
public class Plus implements Expression {

	/* (non-Javadoc)
	 * @see com.brucelee.javapatterns.interpreter.Expression#interpret()
	 */
	@Override
	public int interpret(Context context) {
		return context.getNum1()+context.getNum2();
	}

}
