/**   
 * @Title: AdapterTest.java 
 * @Package com.brucelee.javapatterns.adapter 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author robertlee1059@163.com   
 * @date 2015-3-26 上午10:31:02 
 */
package com.brucelee.javapatterns.adapter;

/**
 * @ClassName: AdapterTest
 * @Description: 适配器模式测试类 ：适配器模式三要素：源对象、目标对象、适配器对象
 * @author robertlee1059@163.com
 * @date 2015-3-26 上午10:31:02 
 * 总结一下三种适配器模式的应用场景：
 *       类的适配器模式：当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可。
 *       
 *       对象的适配器模式：当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，
 *       调用实例的方法就行。
 *       
 *       接口的适配器模式：当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可。
 */
public class AdapterTest {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param args 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		// 类的适配器模式：
		Targetable target = new ClassAdapter();
		target.method1();
		target.method2();

		// 对象的适配器模式
		Targetable target1 = new ObjectAdapter(new Source());
		target1.method1();
		target1.method2();

		// 接口适配器模式
		Sourceable source1=new TargetObj1();
		source1.method1();
		
		Sourceable source2=new TargetObj2();
		source2.method2();
	}

}
