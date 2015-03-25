/**   
* @Title: Builder.java 
* @Package com.brucelee.javapatterns.builder 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-25 上午11:00:06 
*/
package com.brucelee.javapatterns.builder;

import java.util.ArrayList;
import java.util.List;

import com.brucelee.javapatterns.factorymethod.MailSender;
import com.brucelee.javapatterns.factorymethod.Sender;
import com.brucelee.javapatterns.factorymethod.SmsSender;

/** 
 * @ClassName: Builder 
 * @Description: 建造者模式 ：工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，用来创建复合对象，所谓复合对象就是指某个类具有不同的属
 * @author robertlee1059@163.com 
 * @date 2015-3-25 上午11:00:06 
 *  
 */
public class Builder {
	private List<Sender> list=new ArrayList<Sender>();
	public void produceMailSender(int count){
		for(int i=0;i<count;i++){
			list.add(new MailSender());
		}
	}
	public void produceSms(int count){
		for(int i=0;i<count;i++){
			list.add(new SmsSender());
		}
	}
	/**
	 * @return the list
	 */
	public List<Sender> getList() {
		return list;
	}
	
}

