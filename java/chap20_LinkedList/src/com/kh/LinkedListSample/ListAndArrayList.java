package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class ListAndArrayList {
	public static void main(String[] agrs) {
		// ����
		List<String> linkedList = new LinkedList<>();
		
		// ��� �߰�
		linkedList.add("ù ��°");
		linkedList.add("�� ��°");
		linkedList.add("�� ��°");
		
		System.out.println("linkedList : " + linkedList);
		
		// ��� ����
		linkedList.remove(2);
		
		System.out.println("���� �� : " + linkedList);
		
		boolean isTrue = linkedList.contains("�ټ� ��°"); // üũ
		System.out.println("�� ��° ��� ���Կ��� : " + isTrue);
		
		
		// ��� ����
		int size = linkedList.size();
		System.out.println("ũ�� : " + size);
		
		
		
		
	}

}
