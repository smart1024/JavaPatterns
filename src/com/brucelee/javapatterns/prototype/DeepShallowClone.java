/**   
* @Title: DeepShallowClone.java 
* @Package com.brucelee.javapatterns.prototype 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-25 上午11:32:31 
*/
package com.brucelee.javapatterns.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/** 
 * @ClassName: DeepShallowClone 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-25 上午11:32:31 
 *  
 */
public class DeepShallowClone implements Cloneable,Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 浅复制
	 * @throws CloneNotSupportedException 
	 */
	public DeepShallowClone shallowClone() throws CloneNotSupportedException{
		DeepShallowClone proto=(DeepShallowClone) super.clone();
		return 	proto;	
	}
	
	/**
	 * 深复制
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public DeepShallowClone deepClone() throws IOException, ClassNotFoundException{
		/*
		 * 将当前对象写入字节输出流,从内存中输出到字节数组输出流
		 */
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		//writes to the specified OutputStream
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		/**
		 * 将字节数组输出流中的数据，读到内存
		 */
		ByteArrayInputStream bais = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bais);
		DeepShallowClone readObject = (DeepShallowClone)ois.readObject();
		return readObject;
	}
}
