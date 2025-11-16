package com.demo.test;

import com.demo.BinaryTree.BST;

public class testBST {

	public static void main(String[] args) {
		BST bst = new BST();
		
		bst.insert(10);
		bst.insert(5);
		bst.insert(20);
		bst.insert(2);
		bst.insert(30);
		bst.insert(25);
		
//		bst.inorder();
//		
//		System.out.println("\nPreorder : ");
//		bst.preorder();
//		System.out.println("\npostOrder: ");
//		bst.postorder();
		
		System.out.println("Check BST OR NOT\n");
		boolean flag = bst.isBst();
		if(flag) {
			System.out.println("\nit is a BST");
		}else {
			System.out.println("Not A Bst!!!!");
		}
		

	}

}
