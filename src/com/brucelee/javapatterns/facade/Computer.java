/**   
* @Title: Computer.java 
* @Package com.brucelee.javapatterns.facade 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-30 上午11:48:14 
*/
package com.brucelee.javapatterns.facade;

/** 
 * @ClassName: Computer 
 * @Description: 装饰类：Computer跟其他三者是聚合关系，观模式是为了解决类与类之家的依赖关系的(计算机的例子)
 * @author robertlee1059@163.com 
 * @date 2015-3-30 上午11:48:14 
 *  
 */
public class Computer {
	private CPU cpu;
	private Memory memory;
	private Disk disk;
	
	public Computer() {
		this.cpu=new CPU();
		this.memory=new Memory();
		this.disk=new Disk();
	}
	public void startup(){
		cpu.startup();
		memory.startup();
		disk.startup();
	}
	
	public void shutdown(){
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
	}
}
