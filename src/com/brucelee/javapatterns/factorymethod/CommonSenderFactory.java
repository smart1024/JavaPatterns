package com.brucelee.javapatterns.factorymethod;
/**
 * 这是一个普通工厂
 * @author Administrator
 *
 */
public class CommonSenderFactory {
	public Sender produceSender(String type){
		if("MailSender".equals(type)){
			return new MailSender();
		}else if("SmsSender".equals(type)){
			return new SmsSender();
		}else{
			System.out.println("请输入正确类型");
			return null;
		}
	}
}
