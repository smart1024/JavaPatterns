package com.brucelee.javapatterns.factorymethod;
import com.brucelee.javapatterns.factorymethod.Sender;
public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("我是MailSender");
	}

}
