/**   
* @Title: MementoTest.java 
* @Package com.brucelee.javapatterns.memento 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-4-8 下午7:39:11 
*/
package com.brucelee.javapatterns.memento;

/** 
 * @ClassName: MementoTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-4-8 下午7:39:11 
 *  
 */
public class MementoTest {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	public static void main(String[] args) {
		Original original = new Original("egg");
		Storage storage = new Storage(original.creatMemento());//存储了原始类的value到Memento类中，并且保存在Storage
		System.out.println(original.getValue());
		original.setValue("ogg");						//修改原始类的value
		System.out.println(original.getValue());
		original.restoreMemento(storage.getMemento());			//从备忘录中获取存储的value值
		System.out.println(original.getValue());
	}

}
