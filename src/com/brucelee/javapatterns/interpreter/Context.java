/**   
* @Title: Context.java 
* @Package com.brucelee.javapatterns.interpreter 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-4-9 下午5:30:43 
*/
package com.brucelee.javapatterns.interpreter;

/** 
 * @ClassName: Context 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-4-9 下午5:30:43 
 *  
 */
public class Context {
	private int num1;
	private int num2;
	public Context(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	/**
	 * @return the num1
	 */
	public int getNum1() {
		return num1;
	}
	/**
	 * @param num1 the num1 to set
	 */
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	/**
	 * @return the num2
	 */
	public int getNum2() {
		return num2;
	}
	/**
	 * @param num2 the num2 to set
	 */
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
}
