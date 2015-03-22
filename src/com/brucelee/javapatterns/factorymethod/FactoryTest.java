package com.brucelee.javapatterns.factorymethod;
/**
 * 工厂方法模式分为三种：
 * 普通工厂、多个工厂方法、和静态工厂模式，
 * 其中多个工厂方法模式是对普通工厂的优化、而静态工厂方法是对多个工厂方法的优化
 * 
 * 
 * 此为简单工厂模式
 * @author Administrator
 *
 */
public class FactoryTest {
	public static void main(String[] args){
		//简单工厂(传入字符串容易出错)
		CommonSenderFactory senderFactory = new CommonSenderFactory();
		Sender mailSender = senderFactory.produceSender("MailSender");
		mailSender.send();
		//多方法工厂对其优化，避免传参出错
		 MultiMethodFactory mmf = new MultiMethodFactory();
		mmf.produceSmsSender().send();
		
		//对多个工厂方法模式优化，静态工厂方法模式,不用创建对象
		StaticMethodFactory.produceSmsSender().send();
		
	}
}
