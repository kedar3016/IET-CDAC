package com.demo.test;

import com.demo.list.MyGraph;

public class TestMyLinkedList {

	public static void main(String[] args) {
//		MyLinkedList list = new MyLinkedList();
//		list.addNode(12);
//		list.addNode(30);
//		list.addNode(50);
//		list.addNode(2);
//		
//		
//		
//		list.display();
//		System.out.println();
//		
//		boolean flag = list.search(12);
//		if(flag) {
//			System.out.println("Found!!!");
//		}else {
//			System.out.println("Not Found!!!");
//		}
		
		MyGraph graph = new MyGraph(7);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 5);
		graph.addEdge(3, 6);
		
		graph.dfsTraversal(0);
		
		
		graph.bfsTraversal(0);
		System.out.print("BFS : - ");
		System.out.println();
		graph.printGraph();

	}

}
