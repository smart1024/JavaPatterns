/**   
* @Title: CommanderTest.java 
* @Package com.brucelee.javapatterns.command 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-4-3 上午9:57:01 
*/
package com.brucelee.javapatterns.command;

/** 
 * @ClassName: CommanderTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-4-3 上午9:57:01 
 *  
 */
public class CommanderTest {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	public static void main(String[] args) {
		MyCommand myCommand = new MyCommand(new Reciever());
		Commander commander = new Commander(myCommand);
		commander.action();
	}

}
