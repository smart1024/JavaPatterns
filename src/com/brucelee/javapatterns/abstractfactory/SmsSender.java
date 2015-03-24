/**   
* @Title: SmsSender.java 
* @Package com.brucelee.javapatterns.abstractfactory 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-24 上午10:24:46 
*/
package com.brucelee.javapatterns.abstractfactory;

/** 
 * @ClassName: SmsSender 
 * @Description: 消息发送者 
 * @author robertlee1059@163.com 
 * @date 2015-3-24 上午10:24:46 
 *  
 */
public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("我是SmsSender");
	}

}
