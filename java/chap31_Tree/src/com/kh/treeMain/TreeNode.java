package com.kh.treeMain;
/*
 * 노드를 나타내는 데 적절한 클래스
 * */
public class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data) {
		this.data  = data;
		this.left  = null;
		this.right = null;
	}
}