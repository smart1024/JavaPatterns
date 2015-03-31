/**   
* @Title: MyIterator.java 
* @Package com.brucelee.javapatterns.iterator 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-31 下午6:53:06 
*/
package com.brucelee.javapatterns.iterator;

/** 
 * @ClassName: MyIterator 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-31 下午6:53:06 
 *  
 */
public class MyIterator implements Iterator {
	private Collection collection;
	
	private int curPos=-1;
	
	public MyIterator(Collection collection){
		this.collection=collection;
	}
	
	@Override
	public Object previous() {
		return curPos>0?collection.get(--curPos):null;
	}

	/* (non-Javadoc)
	 * @see com.brucelee.javapatterns.iterator.Iterator#next()
	 */
	@Override
	public Object next() {
		return curPos<collection.size()-1?collection.get(++curPos):null;
	}

	/* (non-Javadoc)
	 * @see com.brucelee.javapatterns.iterator.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		return curPos==collection.size()-1?false:true;
	}

	/* (non-Javadoc)
	 * @see com.brucelee.javapatterns.iterator.Iterator#first()
	 */
	@Override
	public Object first() {
		curPos=0;
		return collection.get(curPos);
	}

}
