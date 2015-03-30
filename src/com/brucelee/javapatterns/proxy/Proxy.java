/**   
* @Title: Proxy.java 
* @Package com.brucelee.javapatterns.proxy 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-30 上午10:12:25 
*/
package com.brucelee.javapatterns.proxy;

/** 
 * @ClassName: Proxy 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-30 上午10:12:25 
 *  
 */
public class Proxy implements Sourceable {

	private Source source;
	public Proxy(){
		this.source=new Source();
	}
	@Override
	public void method() {
		before();
		source.method();
		after();
	}
	/** 
	* @Title: after 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param     设定文件 
	* @return void    返回类型 
	* @throws 
	*/
	private void after() {
		System.out.println("after proxy!");
	}
	/** 
	* @Title: before 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param     设定文件 
	* @return void    返回类型 
	* @throws 
	*/
	private void before() {
		System.out.println("before proxy!");
	}

}
