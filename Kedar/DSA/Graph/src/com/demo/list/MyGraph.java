package com.demo.list;

import com.demo.stack.MyGenericStack;
import com.demo.queue.MyGenericQueueList;

public class MyGraph {
	MyLinkedList[] graph;
	
	public MyGraph(int v) {
		this.graph = new MyLinkedList[v];
		
		for(int i = 0;i<graph.length;i++) {
			graph[i] = new MyLinkedList();
		}
	}
	
	public void addEdge(int source,int des) {
		graph[source].addNode(des);
	}
	public void printGraph() {
		for(int i = 0;i<graph.length;i++) {
			System.out.print(i+" ===> ");
			graph[i].display();
			
		}
	}

	public void dfsTraversal(int start) {
		boolean visited[] = new boolean[graph.length];
		
		for(int i = 0;i<graph.length;i++) {
			visited[i] = false;
		}
		
		
		
		MyGenericStack<Integer> st = new MyGenericStack<>();
		
		st.push(start);
		String dfs = "";
		
		while(!st.isEmpty()) {
		
		int val = st.pop();
		if(!visited[val]) {
			dfs += val+",";
			visited[val] = true;
		
			int arr[] = new int[graph.length];
			for(int i = 0;i<graph.length;i++) {
				arr[i] = -1;
			}
			
			graph[val].adjescentsNode(arr);
			
			for(int i = 0;i<graph.length;i++) {
				if(arr[i] != -1 && !visited[arr[i]])
				st.push(arr[i]);
			}
		
		}
		
		}
		System.out.println(dfs);	
	}
	
	public void bfsTraversal(int start) {
		boolean visited[] = new boolean[graph.length];
		
		for(int i = 0;i<graph.length;i++) {
			visited[i] = false;
		}
		
		
		
		MyGenericQueueList<Integer> Q = new MyGenericQueueList<>();
		
		Q.enqueue(start);
		String bfs = "";
		
		while(!Q.isEmpty()) {
		
		int val = Q.dequeue();
		if(!visited[val]) {
			bfs += val+",";
			visited[val] = true;
		
			int arr[] = new int[graph.length];
			for(int i = 0;i<graph.length;i++) {
				arr[i] = -1;
			}
			
			graph[val].adjescentsNode(arr);
			
			for(int i = 0;i<graph.length;i++) {
				if(arr[i] != -1 && !visited[arr[i]])
				Q.enqueue(arr[i]);
			}
		
		}
		
		}
		System.out.println(bfs);	
	}


}
