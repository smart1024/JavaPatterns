/**   
* @Title: Minus.java 
* @Package com.brucelee.javapatterns.strategy 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-31 上午11:12:33 
*/
package com.brucelee.javapatterns.strategy;

/** 
 * @ClassName: Minus 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-31 上午11:12:33 
 *  
 */
public class Minus extends AbstractCalculator implements ICalculate {

	/* (non-Javadoc)
	 * @see com.brucelee.javapatterns.strategy.ICalculate#calculate(java.lang.String)
	 */
	@Override
	public int calculate(String exp) {
		int[] arrInt=split(exp,"-");
		return arrInt[0]-arrInt[1];
	}

}
