/**   
* @Title: Collection.java 
* @Package com.brucelee.javapatterns.iterator 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-31 下午5:52:12 
*/
package com.brucelee.javapatterns.iterator;

/** 
 * @ClassName: Collection 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-31 下午5:52:12 
 *  
 */
public interface Collection {
	public Iterator iterator();
	
	public Object get(int index);
	
	public int size();
}
