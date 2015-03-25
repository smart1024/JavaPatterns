package com.brucelee.javapatterns.abstractfactory;

import com.brucelee.javapatterns.factorymethod.MailSender;

import com.brucelee.javapatterns.factorymethod.Sender;


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
