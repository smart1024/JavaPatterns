/**   
* @Title: ChainOfResponsiblityTest.java 
* @Package com.brucelee.javapatterns.chainofresponsibity 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-4-1 下午5:10:25 
*/
package com.brucelee.javapatterns.chainofresponsibity;

/** 
 * @ClassName: ChainOfResponsiblityTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-4-1 下午5:10:25 
 *  
 */
public class ChainOfResponsiblityTest {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	public static void main(String[] args) {
		MyHandler h1 = new MyHandler("h1");
		MyHandler h2 = new MyHandler("h2");
		MyHandler h3 = new MyHandler("h3");
		h1.setHandler(h2);
		h2.setHandler(h3);
		h1.operation();
	}

}
