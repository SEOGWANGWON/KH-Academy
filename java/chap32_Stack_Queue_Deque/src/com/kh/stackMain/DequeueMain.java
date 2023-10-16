package com.kh.stackMain;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueMain {

	public static void main(String[] args) {
		/*
		 *   	  ����			        ��
		 *  	   ��			  	    ��
		 * 		[First] �� [second] �� [third] 
		 *   ��								   �� 
		 * [   ]  							[     ]
		 */
		// ArrayDequeue ����Ͽ� Dequeue ����
		Deque<String> deque = new ArrayDeque<>();
		
		// ��� �߰�
		deque.addFirst("Frist");
		deque.addLast("Last");
		
		// �� �հ� �� �� ��� Ȯ��
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		System.out.println(deque);
		
		// �Ǿհ� �� �� ��� ����
		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque);
		
		// ����ִ��� Ȯ��
		System.out.println(deque.isEmpty());
	}

}
