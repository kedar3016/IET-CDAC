package com.demo.tree;

public class MyBinaryTree {
	Node root;
	class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	public MyBinaryTree() {
		root = null;
	}
	
	public void insertNode(int key) {
		root = insertData(root,key);
	}

	private Node insertData(Node root, int key) {
		Node newNode = new Node(key);
		if(root == null) {
			root = newNode;
			return root;
		}
		else {
			if(key<root.data) {
				root.left = insertData(root.left,key);
			}
			else {
				root.right = insertData(root.right,key);
			}
			return root;
		}
	}
	public void inorder() {
		inorderTraversal(root);
		System.out.println();
	}

	private void inorderTraversal(Node root) {
		if(root != null) {
			inorderTraversal(root.left);
			System.out.print(root.data+"  ");
			inorderTraversal(root.right);
		}
		
	}
	
	public void preorder() {
		preorderTraversal(root);
		System.out.println();
	}

	private void preorderTraversal(Node root) {
		if(root!= null) {
		System.out.print(root.data+" ");
		preorderTraversal(root.left);
		preorderTraversal(root.right);
		}
		
	}
	
	public void postorder() {
		postorderTraversal(root);
		System.out.println();
	}

	private void postorderTraversal(Node root) {
		if(root != null) {
		postorderTraversal(root.left);
		postorderTraversal(root.right);
		System.out.print(root.data+" ");
		}
		
	}
	
	public void deleteNode(int key) {
		root = deleteData(root,key);
	}

	private Node deleteData(Node root, int key) {
		
		if(root == null) {
			return root;
			
		}
		
		if(key < root.data) {
			root.left = deleteData(root.left,key);
		}
		else if(key > root.data){
			root.right = deleteData(root.right,key);
		}
		else {
			if(root.left == null && root.right == null) {
				return null;
			}
			else if(root.left == null) {
				return root.right;
			}
			else if(root.right == null) {
				return root.left;
			}
			root.data = minValue(root.right);
			root.right = deleteData(root.right,root.data);
		}
		return root;
	}

	private int minValue(Node right) {
		int min = root.data;
		while(root.left != null) {
			min = root.left.data;
			root = root.left;
		}
		return min;
	}
	
	public boolean search(int key) {
		return searchBinaryTree(root,key);
	}

	private boolean searchBinaryTree(Node root, int key) {
		if(root != null) {
			if(root.data == key) {
				System.out.println(key+"Data Found!!");
			}
			else if(key<root.data) {
				return searchBinaryTree(root.left,key);
			}
			else {
				return searchBinaryTree(root.right,key);
			}
			
		}
		System.out.println(key+"Data Found!!");
		return false;
	}

	public boolean searchBinaryTree(int key) {
		// TODO Auto-generated method stub
		return searchBinaryTreeNonRecursive(root,key);
	}
	


	private boolean searchBinaryTreeNonRecursive(Node root, int key) {
		if(root != null) {
			Node temp = root;
			while(temp != null) {
				if(temp.data == key) {
					System.out.println(key+" data");
					return true;
				}
				else if(key<temp.data) {
					temp = temp.left;
				}
				else{
					temp = temp.right;
				}
				
		
				
		}
			
			
	}
		System.out.println(key+" Not Found!!");
		return false;
}

}
