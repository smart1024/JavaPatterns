/**   
* @Title: AbstractFactoryTest.java 
* @Package com.brucelee.javapatterns.abstractfactory 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-24 上午10:41:13 
*/
package com.brucelee.javapatterns.abstractfactory;

/** 
 * @ClassName: AbstractFactoryTest 
 * @Description: 抽象工厂方法测试类
 * @author robertlee1059@163.com 
 * @date 2015-3-24 上午10:41:13 
 *  
 */
public class AbstractFactoryTest {
	public static void main(String[] args) {
		//邮件发送者
		SendFactory msf=new MailSenderFactory();
		msf.produce().send();
		
		//消息发送者
		SendFactory ssf=new SmsSenderFactory();
		ssf.produce().send();
	}
}
