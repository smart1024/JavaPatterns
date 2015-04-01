/**   
* @Title: MyHandler.java 
* @Package com.brucelee.javapatterns.chainofresponsibity 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-4-1 下午5:06:52 
*/
package com.brucelee.javapatterns.chainofresponsibity;

/** 
 * @ClassName: MyHandler 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-4-1 下午5:06:52 
 *  
 */
public class MyHandler extends AbstractHandler implements Handler {
	private String name;
	public MyHandler(String name){
		this.name=name;
	}
	@Override
	public void operation() {
		System.out.println(name+" handled");
		if (getHandler()!=null) {
			getHandler().operation();
		} 
	}
	
}
