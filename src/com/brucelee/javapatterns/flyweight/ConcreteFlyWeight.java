/**   
* @Title: ConcreteFlyWeight.java 
* @Package com.brucelee.javapatterns.flyweight 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-30 下午5:30:56 
*/
package com.brucelee.javapatterns.flyweight;

/** 
 * @ClassName: ConcreteFlyWeight 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-30 下午5:30:56 
 *  
 */
public class ConcreteFlyWeight extends FlyWeight {
	private String string;
	private ConcreteFlyWeight(String string){
		this.string=string;
	}
	public static ConcreteFlyWeight getInstance(String string){
		
		return new ConcreteFlyWeight(string);
	}
	@Override
	public void operation() {
		System.out.println("Concrete---Flyweight : " + string);
	}

}
