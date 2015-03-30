/**   
* @Title: MyBridge.java 
* @Package com.brucelee.javapatterns.bridge 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-30 下午2:22:09 
*/
package com.brucelee.javapatterns.bridge;

/** 
 * @ClassName: MyBridge 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-30 下午2:22:09 
 *  
 */
public class MyBridge extends Bridge {
	@Override
	public void method() {
		getSource().method();
	}

}
