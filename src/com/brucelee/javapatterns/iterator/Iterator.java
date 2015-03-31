/**   
* @Title: Iterator.java 
* @Package com.brucelee.javapatterns.iterator 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-31 下午5:54:18 
*/
package com.brucelee.javapatterns.iterator;

/** 
 * @ClassName: Iterator 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-31 下午5:54:18 
 *  
 */
public interface Iterator {
	public Object previous();
	public Object next();
	
	public boolean hasNext();
	
	public Object first();
}
