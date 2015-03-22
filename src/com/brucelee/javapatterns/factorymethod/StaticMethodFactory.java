package com.brucelee.javapatterns.factorymethod;
/**
 * 	静态工厂方法模式
 * @author Administrator
 *
 */
public class StaticMethodFactory {
	public static Sender produceMailSender(){
		return new MailSender();
	}
	public static Sender produceSmsSender(){
		return new SmsSender();
	} 
}
