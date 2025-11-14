package com.demo.test;

import com.demo.tree.MyBinaryTree;

public class TestMyBinaryTree {

	public static void main(String[] args) {

		MyBinaryTree bst = new MyBinaryTree();
		bst.insertNode(30);
		bst.insertNode(25);
		bst.insertNode(35);
		bst.insertNode(21);
		bst.insertNode(7);
		bst.insertNode(32);
		bst.insertNode(33);
		bst.insertNode(37);
	
		
		System.out.print("Inorder : ");
		bst.inorder();
		
		System.out.print("preorder : ");
		bst.preorder();

		System.out.print("postorder : ");
		bst.postorder();
		bst.deleteNode(7);
		
		System.out.println("Element deleted!!!");
		System.out.print("postorder : ");
		bst.postorder();
		
		if(bst.searchBinaryTree(30)) {
			System.out.println("Found!!!");
		}
		else {
			System.out.println("Not Found!!!");
		}
		
		if(bst.search(21)) {
			System.out.println("Found!!!");
		}
		else {
			System.out.println("Not Found!!!");
		}
	}

}
