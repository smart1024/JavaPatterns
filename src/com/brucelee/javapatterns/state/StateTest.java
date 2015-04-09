/**   
* @Title: StateTest.java 
* @Package com.brucelee.javapatterns.state 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-4-9 下午4:01:06 
*/
package com.brucelee.javapatterns.state;

/** 
 * @ClassName: StateTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-4-9 下午4:01:06 
 *  
 */
public class StateTest {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	public static void main(String[] args) {
		State state =new State();
		Context context = new Context(state);
		//设置第一种状态时
		state.setValue("state1");
		context.method();
		
		//设置第二种状态时
		state.setValue("state2");
		context.method();
	}

}
