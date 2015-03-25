package com.brucelee.javapatterns.factorymethod;

public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("我是SmsSender");
	}

}
