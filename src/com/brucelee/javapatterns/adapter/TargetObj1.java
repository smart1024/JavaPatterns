/**   
* @Title: TargetOb1.java 
* @Package com.brucelee.javapatterns.adapter 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-27 上午10:25:30 
*/
package com.brucelee.javapatterns.adapter;

/** 
 * @ClassName: TargetOb1 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-27 上午10:25:30 
 *  
 */
public class TargetObj1 extends AbstractAdapter {
	/* (non-Javadoc)
	 * @see com.brucelee.javapatterns.adapter.AbstractAdapter#method1()
	 */
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		super.method1();
		System.out.println("我是目标对象TargetObj1需要的方法method1()");
	}
	
}
