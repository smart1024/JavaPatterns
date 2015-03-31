/**   
* @Title: Plus.java 
* @Package com.brucelee.javapatterns.templatemethod 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-31 下午1:56:05 
*/
package com.brucelee.javapatterns.templatemethod;

/** 
 * @ClassName: Plus 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-31 下午1:56:05 
 *  
 */
public class Plus extends AbstractCalculator {

	@Override
	public int calculate(int num1, int num2) {
		return num1+num2;
	}

}
