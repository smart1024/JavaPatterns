/**   
* @Title: AbstractCalculator.java 
* @Package com.brucelee.javapatterns.templatemethod 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-31 下午1:46:42 
*/
package com.brucelee.javapatterns.templatemethod;

/** 
 * @ClassName: AbstractCalculator 
 * @Description: 模板方法 
 * @author robertlee1059@163.com 
 * @date 2015-3-31 下午1:46:42 
 *  
 */
public abstract class AbstractCalculator {
	public int calculate(String exp,String opt){
		int[] intArr = split(exp, opt);
		return calculate(intArr[0],intArr[1]);
	}
	public abstract int calculate(int num1,int num2);
	
	private int[] split(String exp,String opt){  
        String array[] = exp.split(opt);  
        int arrayInt[] = new int[2];  
        arrayInt[0] = Integer.parseInt(array[0]);  
        arrayInt[1] = Integer.parseInt(array[1]);  
        return arrayInt;  
    }  
}
