/**   
* @Title: Orignal.java 
* @Package com.brucelee.javapatterns.memento 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-4-8 下午7:19:05 
*/
package com.brucelee.javapatterns.memento;

/** 
 * @ClassName: Orignal 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-4-8 下午7:19:05 
 *  
 */
public class Original {
	private String value;
	public Original(String value){
		this.value=value;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	public Memento creatMemento(){
		return new Memento(value);
	}
	
	public void restoreMemento(Memento momento){
		this.value=momento.getValue();
	}
}
