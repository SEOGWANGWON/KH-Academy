package com.kh.stackMain;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		// ť ����
		Queue<String> queue = new LinkedList<>();
		/*
		 * 
		 * Front    	   Rear (tail)
		 *   ��       ��       ��
		 * +---+   +---+   +---+
		 * | 1 | �� | 2 | �� | 3 |
		 * +---+   +---+   +---+
		 * 
		 */
		
		// ť�� ��� �߰�
		queue.offer("Apple");
		queue.offer("Banana");
		queue.offer("Cherry");
		
		
		// ť�� ��� ���� �� ��� (FIFO ������� ��µ�)
		String removedElement = queue.poll(); // queue���� Apple �����ϰ� ��ȯ
		System.out.println(removedElement);
		
		removedElement = queue.poll(); // Banana ����
		
		//ť�� Front ��� Ȯ��
		String frontElemnet = queue.peek(); // queue���� front ��� Cherry ��ȯ
		
		// ť�� ũ�� Ȯ��
		int size = queue.size();	// 1�� �ɰ�
		System.out.println("size : " + size);
		
		
		/*
		while(!queue.isEmpty()) {
			String element = queue.poll();
			System.out.println(element);
		}
		*/
		
	}

}
