package com.kh.collectionMain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionMain {

	public static void main(String[] args) {
		// List
		List<String> myList = new ArrayList<>();
		myList.add("���");
		myList.add("�ٳ���");
		myList.add("����");
		
		System.out.print("List : ");
		// ���� for�� Ȱ���ؼ� ���
		for(String furit : myList) {
			System.out.print(furit + " ");
		}
		System.out.println();
		
		// Set ����
		Set<Integer> myset = new HashSet<>();
		myset.add(1);
		myset.add(2);
		myset.add(3);
		myset.add(7);
		myset.add(5);
		myset.add(8);
		myset.add(9);
		myset.add(2); // �ߺ��� ��Ҵ� ������� ����
		
		for(Integer number : myset) {
			System.out.println(number);
		}
		
		// Map ����
		Map<String, Integer> myMap = new HashMap<>();
		// 	Map<String, Integer>
		myMap.put("�ѱ�", 1);
		myMap.put("�Ϻ�", 77);
		myMap.put("�̱�", 2);
		myMap.put("������", 45);
		myMap.put("����", 213);
		myMap.put("�߱�", 666666);
		myMap.put("������", 42); // �ߺ� x ���� �������� �Է��� �� ���
		
		for(String country:myMap.keySet()) {
			int code = myMap.get(country);
			System.out.println(country + " : " + code);
	}
		
	
	
	}

}
