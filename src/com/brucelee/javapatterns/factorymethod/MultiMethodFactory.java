package com.brucelee.javapatterns.factorymethod;
/**
 * 多个工厂方法模式
 * @author Administrator
 *
 */
public class MultiMethodFactory {
	public Sender produceMailSender(){
		return new MailSender();
	}
	public Sender produceSmsSender(){
		return new SmsSender();
	}
}
