package com.demo.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BST {
	Node root;
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	public BST() {
		root = null;
	}
	public void insert(int data) {
		root = insertData(root,data);
	}
	private Node insertData(Node root, int data) {
			Node newNode = new Node(data);
			
			if(root == null) {
				root = newNode;
				return root;
			}
			else {
				if(data<root.data) {
					root.left = insertData(root.left,data);
				}
				else {
					root.right = insertData(root.right,data);
				}
				return root;
			}
			
			
			
	}
	
	public void inorder() {
		inorderTraversal(root);
	}
	private void inorderTraversal(Node root) {
		if(root != null) {
		inorderTraversal(root.left);
		System.out.print(root.data+" ");
		inorderTraversal(root.right);
		}
		
		
	}
	
	public void preorder() {
		preorderTraversal(root);
	}
	private void preorderTraversal(Node root) {
		if(root != null) {
			System.out.print(root.data+" ");
				preorderTraversal(root.left);
				preorderTraversal(root.right);
		}
		
		
	}
	
	public void postorder() {
		postorderTraversal(root);
	}
	private void postorderTraversal(Node root) {
		if(root != null) {
			
				postorderTraversal(root.left);
				postorderTraversal(root.right);
				System.out.print(root.data+" ");
		}
		
		
	}
	
	List<Integer> arr =new ArrayList<>();
	public boolean isBst(){
		
		inorderStore(root);
		
		for(int i = 0;i<arr.size()-1;i++) {
			if(arr.get(i)>arr.get(i+1)) {
				return false;
			}
		}
		return true;
	}
	private void inorderStore(Node root) {
		
		if(root != null) {
		inorderStore(root.left);
		arr.add(root.data);
		inorderStore(root.right);
		}
		
		
	}
}
