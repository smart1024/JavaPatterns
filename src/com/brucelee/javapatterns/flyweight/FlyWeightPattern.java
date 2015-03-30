/**   
* @Title: FlyWeightTest.java 
* @Package com.brucelee.javapatterns.flyweight 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-30 下午7:14:30 
*/
package com.brucelee.javapatterns.flyweight;

/** 
 * @ClassName: FlyWeightTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-30 下午7:14:30 
 *  
 */
public class FlyWeightPattern {
	private FlyweightFactory ff = new FlyweightFactory();
	private FlyWeight fw1;
	private FlyWeight fw2;
	private FlyWeight fw3;
	private FlyWeight fw4;
	private FlyWeight fw5;
	private FlyWeight fw6;
	
	public FlyWeightPattern(){
		this.fw1=ff.getFlyWeight("Google");
		this.fw2=ff.getFlyWeight("Qutr");
		this.fw3=ff.getFlyWeight("Google");
		this.fw4=ff.getFlyWeight("Google");
		this.fw5=ff.getFlyWeight("Google");
		this.fw6=ff.getFlyWeight("Google");
	}
	public void showFlyWeight(){
		fw1.operation();
		fw2.operation();
		fw3.operation();
		fw4.operation();
		fw5.operation();
		fw6.operation();
		System.out.println(ff.getHtSize());
	}
}
