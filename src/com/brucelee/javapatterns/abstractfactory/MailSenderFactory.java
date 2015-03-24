package com.brucelee.javapatterns.abstractfactory;
/**
 * 
* @ClassName: MailSenderFactory 
* @Description: 快递员工厂类 
* @author robertlee1059@163.com 
* @date 2015-3-24 上午10:29:41 
*
 */
public class MailSenderFactory implements SendFactory {

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
