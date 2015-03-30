/**   
* @Title: Bridge.java 
* @Package com.brucelee.javapatterns.bridge 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-30 下午2:19:39 
*/
package com.brucelee.javapatterns.bridge;

/** 
 * @ClassName: Bridge 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-30 下午2:19:39 
 *  
 */
public abstract class Bridge {
	private Sourceable source;
	public abstract void method();
	/**
	 * @return the source
	 */
	public Sourceable getSource() {
		return source;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(Sourceable source) {
		this.source = source;
	}
	
}
