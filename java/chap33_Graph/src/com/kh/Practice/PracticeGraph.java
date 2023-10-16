package com.kh.Practice;

import java.util.LinkedList;
import com.kh.Practice.*;

public class PracticeGraph {
	public static void main(String[] agrs) {
		PracticeGraph pg = new PracticeGraph();
		BFSGraph bfs = new BFSGraph(10);
		bfs.addEdge(0, 1);
		bfs.addEdge(0, 2);
		bfs.addEdge(1, 3);
		bfs.addEdge(2, 4);
		bfs.addEdge(1, 5);
		bfs.addEdge(2, 6);
		bfs.addEdge(3, 7);
		bfs.addEdge(7, 9);
		bfs.BFS(0);
	}
	
	
	
	
	
	
}
