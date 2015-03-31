/**   
* @Title: IteratorTest.java 
* @Package com.brucelee.javapatterns.iterator 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-31 下午7:14:38 
*/
package com.brucelee.javapatterns.iterator;

/** 
 * @ClassName: IteratorTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-31 下午7:14:38 
 *  
 */
public class IteratorTest {

	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	public static void main(String[] args) {
		MyCollection myCollection = new MyCollection();
		Iterator iterator = myCollection.iterator();
		while (iterator.hasNext()) {
			String type = (String) iterator.next();
			System.out.println(type);
		}

	}

}
