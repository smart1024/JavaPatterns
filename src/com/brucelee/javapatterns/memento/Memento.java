/**   
 * @Title: Memento.java 
 * @Package com.brucelee.javapatterns.memento 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author robertlee1059@163.com   
 * @date 2015-4-8 上午10:54:42 
 */
package com.brucelee.javapatterns.memento;

/**
 * @ClassName: Memento
 * @Description: 
 *               备忘录设计模式：主要目的是保存一个对象的某个状态，以便在适当的时候恢复对象，个人觉得叫备份模式更形象些，通俗的讲下：假设有原始类A
 *               ，A中有各种属性，A可以决定需要备份的属性，备忘录类B是用来存储A的一些内部状态，类C呢，就是一个用来存储备忘录的，且只能存储
 *               ，不能修改等操作。
 * @author robertlee1059@163.com
 * @date 2015-4-8 上午10:54:42
 * 
 */
public class Memento {
	private String value;
	public Memento(String value){
		this.value=value;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
