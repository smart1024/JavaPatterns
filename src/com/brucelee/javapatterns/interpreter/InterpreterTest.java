/**   
* @Title: InterpreterTest.java 
* @Package com.brucelee.javapatterns.interpreter 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-4-9 下午5:36:05 
*/
package com.brucelee.javapatterns.interpreter;

/** 
 * @ClassName: InterpreterTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-4-9 下午5:36:05 
 *  
 */
public class InterpreterTest {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	public static void main(String[] args) {
		Context context = new Context(18,10);
		//加法的解释
		Plus plus = new Plus();
		System.out.println(plus.interpret(context));
		
		//减法的解释
		Minus minus = new Minus();
		System.out.println(minus.interpret(context));
	}

}
