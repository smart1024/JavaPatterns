/**   
* @Title: Source.java 
* @Package com.brucelee.javapatterns.decorator 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-27 上午10:48:08 
*/
package com.brucelee.javapatterns.decorator;

/** 
 * @ClassName: Source 
 * @Description: 被装饰类 
 * @author robertlee1059@163.com 
 * @date 2015-3-27 上午10:48:08 
 *  
 */
public class Source implements Sourceable {

	/* (non-Javadoc)
	 * @see com.brucelee.javapatterns.decorator.Sourceable#method()
	 */
	@Override
	public void method() {
		System.out.println("这是原始的method方法");
	}

}
