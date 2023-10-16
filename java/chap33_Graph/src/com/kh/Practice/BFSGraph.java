package com.kh.Practice;

import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {
	private int V; 
	private LinkedList<Integer>[] adj;
	
	public BFSGraph(int v) {
		this.V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList();
		}
		
	}

	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	public void BFS(int start) {
		boolean[] visited = new boolean[V];
		Queue<Integer> queue = new LinkedList<>();
		
		visited[start] = true;
		queue.add(start);
		
		
		while(!queue.isEmpty()) {
			start = queue.poll();
			System.out.print(start + " ");
			
			for(Integer neighbor : adj[start]) {
				if(!visited[neighbor]) {
					visited[neighbor] = true;
					queue.add(neighbor);
				}
			}
		}
	}
}
