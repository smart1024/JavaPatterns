/**   
* @Title: Context.java 
* @Package com.brucelee.javapatterns.state 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-4-9 下午3:55:47 
*/
package com.brucelee.javapatterns.state;

/** 
 * @ClassName: Context 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-4-9 下午3:55:47 
 *  
 */
public class Context {
	private State state;
	public Context(State state){
		this.state=state;
	}
	/**
	 * @return the state
	 */
	public State getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(State state) {
		this.state = state;
	}
	public void method(){
		if(state.getValue().equals("state1")){
			state.method1();
		}else if(state.getValue().equals("state2")){
			state.method2();
		}
	}
	
}
