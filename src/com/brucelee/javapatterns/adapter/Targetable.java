/**   
* @Title: Targetable.java 
* @Package com.brucelee.javapatterns.adapter 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-26 上午10:23:06 
*/
package com.brucelee.javapatterns.adapter;

/** 
 * @ClassName: Targetable 
 * @Description: 目标接口
 * @author robertlee1059@163.com 
 * @date 2015-3-26 上午10:23:06 
 *  
 */
public interface Targetable {
	//与源类中相同的方法
	public void method1();
	
	//目标类的方法
	public void method2();
}
