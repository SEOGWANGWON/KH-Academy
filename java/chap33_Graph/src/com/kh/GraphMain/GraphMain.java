package com.kh.GraphMain;

public class GraphMain {

	public static void main(String[] args) {
		int ver = 15;	// 그래프 노드의 수를 5로 정의
		Graph graph = new Graph(ver);
		
		//addEdge 간선 추가
		graph.addEdge(0, 1); // 노드 0에서 노드 1로 방향이 있는 엣지를 추가
		graph.addEdge(0, 2); // 노드 0에서 노드 2로 방향이 있는 엣지를 추가
		graph.addEdge(1, 3); // 노드 1에서 노드 3로 방향이 있는 엣지를 추가
		graph.addEdge(2, 4); // 노드 2에서 노드 4로 방향이 있는 엣지를 추가
		graph.addEdge(1, 5);
		graph.addEdge(2, 6);
		graph.addEdge(3, 7);
		graph.addEdge(4, 8);
		graph.addEdge(5, 9);
		graph.addEdge(6, 10);
		graph.addEdge(7, 11);
		graph.addEdge(10, 12);
		graph.addEdge(12, 2);
		
		System.out.println("DFS 탐색 결과 : ");
		// 0으로 시작함
		graph.DFS(6); // DFS 탐색을 시작할 노드의 번호를 전달
		
		
	}

}
/*
	DFS 탐색을 시작하여 그 결과를 출력
	탐색 결과는 시작 노드에서 출발하여
	깊이 우선으로 탐색 후 노드를 방문한 순서대로 출력
*/