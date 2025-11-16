package com.demo.list;

import java.util.Stack;

public class MyGraph {
	
	MyLinkedList[] Graph;
	
	public MyGraph(int v) {
		this.Graph = new MyLinkedList[v];
		
		for(int i = 0;i<Graph.length;i++) {
			Graph[i] = new MyLinkedList();
		}
	}
	
	public void addEdge(int source,int dest) {
		Graph[source].addNode(dest);
	}
	
	public void printGraph() {
		for(int i = 0;i<Graph.length;i++) {
			System.out.println(i+" ---> ");
			Graph[i].display();
		}
	}
	
	public void dfsTraversal(int start) {
		boolean[] visited = new boolean[Graph.length];
		
		for(int i = 0;i<Graph.length;i++) {
			visited[i] = false;
		}
		Stack<Integer> st = new Stack<>();
		
		st.push(start);
		String dfs = "";
		
		while(!st.isEmpty()) {
			int v = st.pop();
			if(!visited[v]) {
				dfs += v+",";
				visited[v] = true;
				
				int arr[] = new int[Graph.length];
				for(int i = 0;i<Graph.length;i++) {
					arr[i] = -1;
				}
				
				Graph[v].getadjescentNodes(arr);
				for(int i = 0;i<Graph.length;i++) {
					if(arr[i]!= -1&& !visited[arr[i]]) {
						st.push(arr[i]);
					}
				}
			}
		}
	}

}
