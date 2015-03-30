/**   
* @Title: Tree.java 
* @Package com.brucelee.javapatterns.composite 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-30 下午3:59:06 
*/
package com.brucelee.javapatterns.composite;

/** 
 * @ClassName: Tree 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-30 下午3:59:06 
 *  
 */
public class Tree {
	private TreeNode root;
	
	public Tree(String name){
		this.root=new TreeNode(name);
	}
	/** 
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	public static void main(String[] args) {
		Tree tree = new Tree("NodeA");
		TreeNode tnb = new TreeNode("NodeB");
		TreeNode tnc = new TreeNode("NodeC");
		//将NodeA添加到节点NodeB
		tnc.add(tnb);
		//将NodeB添加到根节点
		tree.root.add(tnc);
		
		System.out.println("NodeA子节点个数"+tnb.getChildren().size());
		
		System.out.println("NodeC子节点个数"+tnc.getChildren().firstElement().getName());
		
		System.out.println("根节点的子节点"+tree.root.getChildren().firstElement().getName());
		
	}

}
