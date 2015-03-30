/**   
* @Title: FlyweightFactory.java 
* @Package com.brucelee.javapatterns.flyweight 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-30 下午5:33:53 
*/
package com.brucelee.javapatterns.flyweight;

import java.util.Hashtable;


/** 
 * @ClassName: FlyweightFactory 
 * @Description: FlyWeight保证没有相同的对象，Singleton保证只有一个对象。
 * @author robertlee1059@163.com 
 * @date 2015-3-30 下午5:33:53 
 *  
 */
public class FlyweightFactory {
	private Hashtable<String,ConcreteFlyWeight> ht=new Hashtable<String,ConcreteFlyWeight>();
	public FlyWeight getFlyWeight(Object obj){
		ConcreteFlyWeight cfw=ht.get(obj);
		if(cfw==null){
			cfw = ConcreteFlyWeight.getInstance((String)obj);
			ht.put((String)obj,cfw);
		}
		return cfw;
	}
	
	public int getHtSize(){
		return ht.size();
	}
}
