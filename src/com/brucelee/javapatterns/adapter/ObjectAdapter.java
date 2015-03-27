/**   
* @Title: ObjecAdapter.java 
* @Package com.brucelee.javapatterns.adapter 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-27 上午10:02:00 
*/
package com.brucelee.javapatterns.adapter;

/** 
 * @ClassName: ObjecAdapter 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-27 上午10:02:00 
 *  
 */
public class ObjectAdapter implements Targetable {
	private Source source;
	public ObjectAdapter(Source source){
		this.source=source;
	}
	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("这是Targetable的method2()方法");
	}

}
