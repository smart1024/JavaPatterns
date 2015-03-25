/**   
* @Title: BuilderTest.java 
* @Package com.brucelee.javapatterns.builder 
* @Description: 创建者模式测试类 
* @author robertlee1059@163.com   
* @date 2015-3-25 上午11:13:15 
*/
package com.brucelee.javapatterns.builder;

/** 
 * @ClassName: BuilderTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-25 上午11:13:15 
 *  
 */
public class BuilderTest {

	public static void main(String[] args) {
		Builder builder=new Builder();
		builder.produceMailSender(10);
		System.out.println("集合的长度为："+builder.getList().size());
	}

}
