/**   
* @Title: Storage.java 
* @Package com.brucelee.javapatterns.memento 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-4-8 下午7:24:52 
*/
package com.brucelee.javapatterns.memento;

/** 
 * @ClassName: Storage 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-4-8 下午7:24:52 
 *  
 */
public class Storage {
	private Memento memento;
	public Storage(Memento memento){
		this.memento=memento;
	}
	/**
	 * @return the memento
	 */
	public Memento getMemento() {
		return memento;
	}
	/**
	 * @param memento the memento to set
	 */
	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
}
