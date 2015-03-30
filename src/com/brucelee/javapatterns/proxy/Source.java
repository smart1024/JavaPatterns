/**   
* @Title: Source.java 
* @Package com.brucelee.javapatterns.proxy 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-30 上午10:11:58 
*/
package com.brucelee.javapatterns.proxy;

/** 
 * @ClassName: Source 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-30 上午10:11:58 
 *  
 */
public class Source implements Sourceable {

	/* (non-Javadoc)
	 * @see com.brucelee.javapatterns.proxy.Sourceable#method()
	 */
	@Override
	public void method() {
		System.out.println("我是源对象");
	}


}
