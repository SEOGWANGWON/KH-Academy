package com.kh.listAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArrayList {

	public static void main(String[] args) {
		int[] MyArray = new int[5]; // ũ�Ⱑ 5�� �迭�� ����
		MyArray[0] = 10; // ù��° ��ҿ� ���� ����
		
		List<Integer> myList = new ArrayList<>();
		myList.add(10); // ����߰�
		int value = myList.get(0); // ù��° ��� �߰�
		myList.remove(0); // ù ��° ��� ����

		List<String> arrayList = new ArrayList<>();
		
		arrayList.add("��ġ�Ѹ�");
		arrayList.add("�� �Ѹ�");
		String value2 = arrayList.get(0); // ù��° ��� ��������
		arrayList.remove(1); // �ι�° ��� ����
		
		
		
	}

}
