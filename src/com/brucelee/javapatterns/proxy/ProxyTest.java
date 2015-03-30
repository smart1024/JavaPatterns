/**   
 * @Title: ProxyTest.java 
 * @Package com.brucelee.javapatterns.proxy 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author robertlee1059@163.com   
 * @date 2015-3-30 上午10:18:19 
 */
package com.brucelee.javapatterns.proxy;

/**
 * @ClassName: ProxyTest
 * @Description: 代理设计模式与装饰设计模式区别 ：一种是依赖关系，一种是关联关系
 * @author robertlee1059@163.com
 * @date 2015-3-30 上午10:18:19 代理模式的应用场景： 如果已有的方法在使用的时候需要对原有的方法进行改进，此时有两种办法：
 *       1、修改原有的方法来适应。这样违反了“对扩展开放，对修改关闭”的原则。
 *       2、就是采用一个代理类调用原有的方法，且对产生的结果进行控制。这种方法就是代理模式。 使用代理模式，可以将功能划分的更加清晰，有助于后期维护！
 */
public class ProxyTest {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		Sourceable proxy = new Proxy();
		proxy.method();
	}

}
