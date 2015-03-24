package com.brucelee.javapatterns.abstractfactory;
/**
* @ClassName: SendFactory 
* @Description: 抽象工厂：避免了工厂方法模式,如果增加一类发送者，就必须修改工厂类,违背了开闭原则（Open Close Principle）(对拓展开放，对修改关闭)
* @author robertlee1059@163.com 
* @date 2015-3-24 上午10:30:33 
*
 */
public interface SendFactory {
	public Sender produce();
}
