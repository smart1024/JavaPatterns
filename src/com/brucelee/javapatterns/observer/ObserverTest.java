/**   
* @Title: ObserverTest.java 
* @Package com.brucelee.javapatterns.observer 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-31 下午5:33:55 
*/
package com.brucelee.javapatterns.observer;

/** 
 * @ClassName: ObserverTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-31 下午5:33:55 
 *  
 */
public class ObserverTest {

	/** 
	 * @Title: main 
	 * @Description: 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	public static void main(String[] args) {
		Observer observer1 = new Observer1();
		Observer observer2 = new Observer2();
		MySubject mySubject = new MySubject();
		mySubject.add(observer1);
		mySubject.add(observer2);
		//做完操作时通知所有观察者
		mySubject.operation();
	}

}
