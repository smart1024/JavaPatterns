/**   
* @Title: TemplateMethodTest.java 
* @Package com.brucelee.javapatterns.templatemethod 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-31 下午1:57:36 
*/
package com.brucelee.javapatterns.templatemethod;

/** 
 * @ClassName: TemplateMethodTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-31 下午1:57:36 
 *  
 */
public class TemplateMethodTest {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	public static void main(String[] args) {
		AbstractCalculator plus = new Plus();
		System.out.println(plus.calculate("8+8","\\+"));
	}

}
