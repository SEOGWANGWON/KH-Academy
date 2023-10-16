package com.kh.listAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArrayList {

	public static void main(String[] args) {
		int[] MyArray = new int[5]; // 크기가 5인 배열을 생성
		MyArray[0] = 10; // 첫번째 요소에 값을 전달
		
		List<Integer> myList = new ArrayList<>();
		myList.add(10); // 요소추가
		int value = myList.get(0); // 첫번째 요소 추가
		myList.remove(0); // 첫 번째 요소 삭제

		List<String> arrayList = new ArrayList<>();
		
		arrayList.add("이치닌메");
		arrayList.add("니 닌메");
		String value2 = arrayList.get(0); // 첫번째 요소 가져오기
		arrayList.remove(1); // 두번째 요소 삭제
		
		
		
	}

}
