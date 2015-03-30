/**   
* @Title: BridgeTest.java 
* @Package com.brucelee.javapatterns.bridge 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-30 下午2:25:08 
*/
package com.brucelee.javapatterns.bridge;

/** 
 * @ClassName: BridgeTest 
 * @Description: 桥接模式就是两个
 * @author robertlee1059@163.com 
 * @date 2015-3-30 下午2:25:08 
 *  
 */
public class BridgeTest {

	/** 
	 * @Title: main 
	 * @Description: 桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	public static void main(String[] args) {
		//调用source1
		Bridge bridge = new MyBridge();
		bridge.setSource(new SourceableStub1());
		bridge.method();
		
		//调用source2
		bridge.setSource(new SourceableStub2());
		bridge.method();
	}

}
