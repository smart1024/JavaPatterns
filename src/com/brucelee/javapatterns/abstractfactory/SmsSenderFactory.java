/**   
* @Title: SmsSenderFactory.java 
* @Package com.brucelee.javapatterns.abstractfactory 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-24 上午10:31:37 
*/
package com.brucelee.javapatterns.abstractfactory;

import com.brucelee.javapatterns.factorymethod.Sender;
import com.brucelee.javapatterns.factorymethod.SmsSender;

/** 
 * @ClassName: SmsSenderFactory 
 * @Description: 消息发送工厂
 * @author robertlee1059@163.com 
 * @date 2015-3-24 上午10:31:37 
 *  
 */
public class SmsSenderFactory implements SendFactory {
	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
