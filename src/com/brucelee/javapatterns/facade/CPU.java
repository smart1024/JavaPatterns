/**   
* @Title: CPU.java 
* @Package com.brucelee.javapatterns.facade 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-30 上午11:44:51 
*/
package com.brucelee.javapatterns.facade;

/** 
 * @ClassName: CPU 
 * @Description: CPU为装饰类 
 * @author robertlee1059@163.com 
 * @date 2015-3-30 上午11:44:51 
 *  
 */
public class CPU {
	public void startup(){
		System.out.println("CPU启动了");
	}
	
	public void shutdown(){
		System.out.println("CPU关闭了");
	}
}
