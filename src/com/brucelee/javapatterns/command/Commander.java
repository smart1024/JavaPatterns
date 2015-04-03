/**   
* @Title: Commander.java 
* @Package com.brucelee.javapatterns.command 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-4-3 上午9:52:14 
*/
package com.brucelee.javapatterns.command;

/** 
 * @ClassName: Commander 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-4-3 上午9:52:14 
 *  
 */
public class Commander {
	private Command command;
	public Commander(Command command){
		this.command=command;
	}
	public void action(){
		command.exe();
	};
}
