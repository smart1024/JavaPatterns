/**   
* @Title: MyCommand.java 
* @Package com.brucelee.javapatterns.command 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-4-3 上午9:48:24 
*/
package com.brucelee.javapatterns.command;

/** 
 * @ClassName: MyCommand 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-4-3 上午9:48:24 
 *  
 */
public class MyCommand implements Command {

	private Reciever reciever;
	public MyCommand(Reciever reciever){
		this.reciever=reciever;
	}
	@Override
	public void exe() {
		reciever.action();
	}

}
