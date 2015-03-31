/**   
* @Title: StrategyTest.java 
* @Package com.brucelee.javapatterns.strategy 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-31 上午10:56:23 
*/
package com.brucelee.javapatterns.strategy;

/** 
 * @ClassName: StrategyTest 
 * @Description: 策略设计模式
 * @author robertlee1059@163.com 
 * @date 2015-3-31 上午10:56:23 
 * 策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换 
 */
public class StrategyTest {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	public static void main(String[] args) {
		Plus plus = new Plus();
		System.out.println(plus.calculate("2+3"));
		
		Minus minus = new Minus();
		System.out.println(minus.calculate("2-3"));
		
		Multiplication mul = new Multiplication();
		System.out.println(mul.calculate("2*3"));
		
		
	}

}
