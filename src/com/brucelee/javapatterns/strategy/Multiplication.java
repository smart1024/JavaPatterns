/**   
* @Title: Multiplication.java 
* @Package com.brucelee.javapatterns.strategy 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-31 上午11:17:11 
*/
package com.brucelee.javapatterns.strategy;

/** 
 * @ClassName: Multiplication 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-31 上午11:17:11 
 *  
 */
public class Multiplication extends AbstractCalculator implements ICalculate {

	/* (non-Javadoc)
	 * @see com.brucelee.javapatterns.strategy.ICalculate#calculate(java.lang.String)
	 */
	@Override
	public int calculate(String exp) {
		int[] arrInt=split(exp,"\\*");
		return arrInt[0]*arrInt[1];
	}

}
