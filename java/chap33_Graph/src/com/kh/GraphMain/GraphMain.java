package com.kh.GraphMain;

public class GraphMain {

	public static void main(String[] args) {
		int ver = 15;	// �׷��� ����� ���� 5�� ����
		Graph graph = new Graph(ver);
		
		//addEdge ���� �߰�
		graph.addEdge(0, 1); // ��� 0���� ��� 1�� ������ �ִ� ������ �߰�
		graph.addEdge(0, 2); // ��� 0���� ��� 2�� ������ �ִ� ������ �߰�
		graph.addEdge(1, 3); // ��� 1���� ��� 3�� ������ �ִ� ������ �߰�
		graph.addEdge(2, 4); // ��� 2���� ��� 4�� ������ �ִ� ������ �߰�
		graph.addEdge(1, 5);
		graph.addEdge(2, 6);
		graph.addEdge(3, 7);
		graph.addEdge(4, 8);
		graph.addEdge(5, 9);
		graph.addEdge(6, 10);
		graph.addEdge(7, 11);
		graph.addEdge(10, 12);
		graph.addEdge(12, 2);
		
		System.out.println("DFS Ž�� ��� : ");
		// 0���� ������
		graph.DFS(6); // DFS Ž���� ������ ����� ��ȣ�� ����
		
		
	}

}
/*
	DFS Ž���� �����Ͽ� �� ����� ���
	Ž�� ����� ���� ��忡�� ����Ͽ�
	���� �켱���� Ž�� �� ��带 �湮�� ������� ���
*/