package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkdedListExam {

	public static void main(String[] args) {
		// List �������̽� LinkedList ��ü Ȱ���ؼ� ���ְ� ���
		List<String> lkList = new LinkedList<>();
		
		// String �� �ְ� ���� ���� ���
		lkList.add("��������");
		lkList.add("�ƿ� ��¥");
		System.out.println(lkList);
		lkList.set(1, "�ƿ���!!!!��¥!!!!!");
		System.out.println(lkList);
		lkList.remove(1);
		System.out.println(lkList);
		
		
		
		// LinkedList ��ü new LinkedList ��ü
		LinkedList<Integer> lkList2 = new LinkedList<>();
		
		
		
		// int �� �ְ� ���� ���� ���
		
		lkList2.add(18);
		lkList2.add(58);
		System.out.println(lkList2);
		
		lkList2.set(1, 28);
		System.out.println(lkList2);
		lkList2.remove(1);
		System.out.println(lkList2);
		
		
	}

}
