package com.kh.listAndArray;

import java.util.ArrayList;
import java.util.List;

public class List_And_Array {

	public static void main(String[] args) {
		
		List_And_Array LA = new List_And_Array();
		LA.ListArray(); // heap 메모리
		ListArray2();  // static // stack 메모리
	}
	
		
		// Array 예제
		public void ListArray() {
		int[] intArray = new int[2]; // 크기가 5인 정수 배열 SANGSUNG
		intArray[0] = 1;
		intArray[1] = 2;
		// intArray
		// Array 출력
		System.out.println("Array 요소 : ");
		for(int a = 0; a < intArray.length; a++) {
			System.out.print(intArray[a] + " ");
		}
		
		System.out.println(); // 개행문자 포함돼있어 enter같은 역할
		
		// List 예제  Integer = int  ↓ 빈 리스트 생성
		List<Integer> intList= new ArrayList<>(); // Integer 객체를 저장하는 ArrayList 생성
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		// List 출력
		System.out.println("List 요소 : ");
		for (int num : intList) {
			System.out.println(num + " ");
			}
		}
		
		public static void ListArray2() {
		// String 으로 변경 후 Array와 List 출력해보기
		String[] name = new String[2];
		
		name[0] = "고병찬";
		name[1] = "나세희";
		
		for(String Person : name) {
			System.out.println(Person);
		}
		
		List<String> stList = new ArrayList<>();
		stList.add("김경난");
		stList.add("김민수");
		stList.add("김승범");
		stList.add("최병호");		
		for (String Person : stList) {
			System.out.print(Person + " ");
		}
		}
		
	}


