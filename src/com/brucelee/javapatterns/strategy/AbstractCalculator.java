/**   
* @Title: AbstractCalculator.java 
* @Package com.brucelee.javapatterns.strategy 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-31 上午10:43:15 
*/
package com.brucelee.javapatterns.strategy;

/** 
 * @ClassName: AbstractCalculator 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-31 上午10:43:15 
 *  
 */
public abstract class AbstractCalculator {
	/**
	 * 
	* @Title: split 
	* @Description: 分割字符串 
	* @param exp	被分割的字符串
	* @param opt	分隔符
	* @return int[]    返回类型 
	* @throws
	 */
	public int[] split(String exp,String opt){
		String[] arrayStr=exp.split(opt);
		//假定是两个数相加
		int[] arrayInt = new int[2];
		arrayInt[0]=Integer.parseInt(arrayStr[0]);
		arrayInt[1]=Integer.parseInt(arrayStr[1]);
		return arrayInt;
	};
}
