/**   
* @Title: Plus.java 
* @Package com.brucelee.javapatterns.strategy 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-31 上午10:52:37 
*/
package com.brucelee.javapatterns.strategy;

/** 
 * @ClassName: Plus 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-31 上午10:52:37 
 *  
 */
public class Plus extends AbstractCalculator implements ICalculate {

	@Override
	public int calculate(String exp) {
		int[] arrInt=split(exp,"\\+");
		return arrInt[0]+arrInt[1];
	}

}
