/**   
* @Title: MyCollection.java 
* @Package com.brucelee.javapatterns.iterator 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-31 下午6:50:16 
*/
package com.brucelee.javapatterns.iterator;

/** 
 * @ClassName: MyCollection 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-31 下午6:50:16 
 *  集合内部实现就是数组
 */
public class MyCollection implements Collection {
	
	String[] str={"A","B","C","D","E"};

	@Override
	public Iterator iterator() {
		return new MyIterator(this);
	}

	/* (non-Javadoc)
	 * @see com.brucelee.javapatterns.iterator.Collection#get(int)
	 */
	@Override
	public Object get(int index) {
		return str[index];
	}

	/* (non-Javadoc)
	 * @see com.brucelee.javapatterns.iterator.Collection#size()
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return str.length;
	}

}
