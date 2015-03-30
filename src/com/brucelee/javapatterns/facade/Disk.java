/**   
* @Title: CPU.java 
* @Package com.brucelee.javapatterns.facade 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-30 上午11:44:51 
*/
package com.brucelee.javapatterns.facade;

/** 
 * @ClassName: Memory 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-30 上午11:44:51 
 *  
 */
public class Disk {
	public void startup(){
		System.out.println("Disk启动了");
	}
	
	public void shutdown(){
		System.out.println("Disk关闭了");
	}
}
