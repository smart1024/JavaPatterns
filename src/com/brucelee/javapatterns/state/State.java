/**   
 * @Title: State.java 
 * @Package com.brucelee.javapatterns.state 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author robertlee1059@163.com   
 * @date 2015-4-9 下午3:50:01 
 */
package com.brucelee.javapatterns.state;

/**
 * @ClassName: State
 * @Description: 
 *               当对象的状态改变时，同时改变其行为，很好理解！就拿QQ来说，有几种状态，在线、隐身、忙碌等，每个状态对应不同的操作，而且你的好友也能看到你的状态
 *               ，所以，状态模式就两点：1、可以通过改变状态来获得不同的行为。2、你的好友能同时看到你的变化。
 * @author robertlee1059@163.com
 * @date 2015-4-9 下午3:50:01
 * 
 */
public class State {
	private String value;
	public void method1(){
		System.out.println("执行了方法method1()");
	}
	public void method2(){
		System.out.println("执行了方法method2()");
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
}
