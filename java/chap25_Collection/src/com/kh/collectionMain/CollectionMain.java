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
		myList.add("사과");
		myList.add("바나나");
		myList.add("딸기");
		
		System.out.print("List : ");
		// 향상된 for문 활용해서 출력
		for(String furit : myList) {
			System.out.print(furit + " ");
		}
		System.out.println();
		
		// Set 예제
		Set<Integer> myset = new HashSet<>();
		myset.add(1);
		myset.add(2);
		myset.add(3);
		myset.add(7);
		myset.add(5);
		myset.add(8);
		myset.add(9);
		myset.add(2); // 중복된 요소는 허용하지 않음
		
		for(Integer number : myset) {
			System.out.println(number);
		}
		
		// Map 예제
		Map<String, Integer> myMap = new HashMap<>();
		// 	Map<String, Integer>
		myMap.put("한국", 1);
		myMap.put("일본", 77);
		myMap.put("미국", 2);
		myMap.put("스페인", 45);
		myMap.put("독일", 213);
		myMap.put("중국", 666666);
		myMap.put("스페인", 42); // 중복 x 가장 마지막에 입력한 값 출력
		
		for(String country:myMap.keySet()) {
			int code = myMap.get(country);
			System.out.println(country + " : " + code);
	}
		
	
	
	}

}
