/**   
 * @Title: Decorator.java 
 * @Package com.brucelee.javapatterns.decorator 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author robertlee1059@163.com   
 * @date 2015-3-27 上午10:48:48 
 */
package com.brucelee.javapatterns.decorator;

/**
 * @ClassName: Decorator
 * @Description: 装饰类 :对Source进行了功能的增强
 * @author robertlee1059@163.com
 * @date 2015-3-27 上午10:48:48 
 * 装饰器模式的应用场景： 1、需要扩展一个类的功能。
 *       2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
 *       缺点：产生过多相似的对象，不易排错！
 */
public class Decorator implements Sourceable {
	private Source source;

	public Decorator(Source source) {
		this.source = source;
	}

	@Override
	public void method() {
		System.out.println("在Source的method方法之前做。。。。。");

		source.method();

		System.out.println("在Source的method方法之后做。。。。。");
	}

}
