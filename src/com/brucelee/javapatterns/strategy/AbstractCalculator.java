package com.brucelee.javapatterns.strategy;

/**
 * @ClassName: AbstractCalculator
 * @Description: 算法多变的情况下适合策略设计模式：策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响到使用算法的客户
 * @author robertlee1059@163.com
 * @date 2015-3-31 上午10:43:15
 * 
 */
public abstract class AbstractCalculator {
	/**
	 * 
	 * @Title: split
	 * @Description: 分割字符串
	 * @param exp
	 *            被分割的字符串
	 * @param opt
	 *            分隔符
	 * @return int[] 返回类型
	 * @throws
	 */
	public int[] split(String exp, String opt) {
		String[] arrayStr = exp.split(opt);
		// 假定是两个数相加
		int[] arrayInt = new int[2];
		arrayInt[0] = Integer.parseInt(arrayStr[0]);
		arrayInt[1] = Integer.parseInt(arrayStr[1]);
		return arrayInt;
	};
}
