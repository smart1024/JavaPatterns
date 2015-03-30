/**   
 * @Title: TreeNode.java 
 * @Package com.brucelee.javapatterns.composite 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author robertlee1059@163.com   
 * @date 2015-3-30 下午3:48:43 
 */
package com.brucelee.javapatterns.composite;

import java.util.Vector;

/**
 * @ClassName: TreeNode
 * @Description: 组合设计模式：代表整体与部分的关系;将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树
 * @author robertlee1059@163.com
 * @date 2015-3-30 下午3:48:43
 * 
 */
public class TreeNode {
	private String name;
	private TreeNode parent;
	private Vector<TreeNode> children = new Vector<TreeNode>();
	public TreeNode(String name){
		this.name=name;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the parent
	 */
	public TreeNode getParent() {
		return parent;
	}

	/**
	 * @param parent
	 *            the parent to set
	 */
	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	public void add(TreeNode tn) {
		children.add(tn);
	}

	public void remove(TreeNode tn) {
		children.remove(tn);
	}

	/**
	 * 获得所有子节点集合
	 * @Title: getChildren
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @return 设定文件
	 * @return Vector<TreeNode> 返回类型
	 * @throws
	 */
	public Vector<TreeNode> getChildren() {
		return children;
	}
}
