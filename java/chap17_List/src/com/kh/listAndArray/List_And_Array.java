package com.kh.listAndArray;

import java.util.ArrayList;
import java.util.List;

public class List_And_Array {

	public static void main(String[] args) {
		
		List_And_Array LA = new List_And_Array();
		LA.ListArray(); // heap �޸�
		ListArray2();  // static // stack �޸�
	}
	
		
		// Array ����
		public void ListArray() {
		int[] intArray = new int[2]; // ũ�Ⱑ 5�� ���� �迭 SANGSUNG
		intArray[0] = 1;
		intArray[1] = 2;
		// intArray
		// Array ���
		System.out.println("Array ��� : ");
		for(int a = 0; a < intArray.length; a++) {
			System.out.print(intArray[a] + " ");
		}
		
		System.out.println(); // ���๮�� ���Ե��־� enter���� ����
		
		// List ����  Integer = int  �� �� ����Ʈ ����
		List<Integer> intList= new ArrayList<>(); // Integer ��ü�� �����ϴ� ArrayList ����
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		// List ���
		System.out.println("List ��� : ");
		for (int num : intList) {
			System.out.println(num + " ");
			}
		}
		
		public static void ListArray2() {
		// String ���� ���� �� Array�� List ����غ���
		String[] name = new String[2];
		
		name[0] = "����";
		name[1] = "������";
		
		for(String Person : name) {
			System.out.println(Person);
		}
		
		List<String> stList = new ArrayList<>();
		stList.add("��泭");
		stList.add("��μ�");
		stList.add("��¹�");
		stList.add("�ֺ�ȣ");		
		for (String Person : stList) {
			System.out.print(Person + " ");
		}
		}
		
	}


