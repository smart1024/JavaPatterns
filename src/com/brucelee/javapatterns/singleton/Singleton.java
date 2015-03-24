/**   
* @Title: Singleton.java 
* @Package com.brucelee.javapatterns.singleton 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-24 下午5:30:48 
*/
package com.brucelee.javapatterns.singleton;

/** 
 * @ClassName: Singleton 
 * @Description: 单例设计模式 ：在Java应用中，单例对象能保证在一个JVM中，该对象只有一个实例存在。
 * 1、某些类创建比较频繁，对于一些大型的对象，这是一笔很大的系统开销。
   2、省去了new操作符，降低了系统内存的使用频率，减轻GC压力。
   3、有些类如交易所的核心交易引擎，控制着交易流程，如果该类可以创建多个的话，系统完全乱了。（比如一个军队出现了多个司令员同时指挥，肯定会乱成一团），所以只有使用单例模式，才能保证核心交易服务器独立控制整个流程。
 * 
 * @author robertlee1059@163.com 
 * @date 2015-3-24 下午5:30:48 
 *  
 */
public class Singleton {//懒汉式，存在线程安全问题，多线程环境下会出现线程安全问题
	private Singleton instance=null;
	private Singleton(){	
		
	}
	public Singleton getInstance(){
		if(instance==null){
			instance=new Singleton();
		}
		return instance;
	}
	//如果对象被序列化,可以保证对象序列化前后保持一致
	public Object readSolve(){
		return instance;
	}
}
