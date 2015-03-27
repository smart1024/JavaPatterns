/**   
* @Title: DecoratorTest.java 
* @Package com.brucelee.javapatterns.decorator 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-27 上午11:01:47 
*/
package com.brucelee.javapatterns.decorator;

/** 
 * @ClassName: DecoratorTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-27 上午11:01:47 
 *  
 */
public class DecoratorTest {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	public static void main(String[] args) {
		Sourceable decorator=new Decorator(new Source());
		decorator.method();
	}

}
