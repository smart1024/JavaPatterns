/**   
* @Title: Prototype.java 
* @Package com.brucelee.javapatterns.prototype 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-25 上午11:19:32 
*/
package com.brucelee.javapatterns.prototype;

/** 
 * @ClassName: Prototype 
 * @Description: 原型设计模式：该模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象，而克隆对象是通过clone()方法实现的
 * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
	深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
 * @author robertlee1059@163.com 
 * @date 2015-3-25 上午11:19:32 
 *  原型模式属于浅复制
 */
public class Prototype implements Cloneable{
	public Prototype clone() throws CloneNotSupportedException{
		Prototype proto = (Prototype)super.clone();//只需要实现Cloneable接口，覆写clone方法，此处clone方法可以改成任意的名称，因为Cloneable接口是个空接口，你可以任意定义实现类的方法名，如cloneA或者cloneB，因为此处的重点是super.clone()这句话，super.clone()调用的是Object的clone()方法，而在Object类中，clone()是native的，
		return proto;
	}
}
