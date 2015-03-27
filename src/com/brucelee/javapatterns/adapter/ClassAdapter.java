/**   
* @Title: Adapter.java 
* @Package com.brucelee.javapatterns.adapter 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-26 上午10:25:58 
*/
package com.brucelee.javapatterns.adapter;

/** 
 * @ClassName: Adapter 
 * @Description: 适配器类： 适配器模式将某个类的接口转换成客户端期望的另一个接口表示，目的是消除由于接口不匹配所造成的类的兼容性问题。主要分为三类：类的适配器模式、对象的适配器模式、接口的适配器模式。
 * @author robertlee1059@163.com 
 * @date 2015-3-26 上午10:25:58 
 *  类的适配器模式
 */
public class ClassAdapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("我是目标对象的方法method2()");
	}

}
