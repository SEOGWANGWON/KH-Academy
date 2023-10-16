package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class ListAndArrayList {
	public static void main(String[] agrs) {
		// 생성
		List<String> linkedList = new LinkedList<>();
		
		// 요소 추가
		linkedList.add("첫 번째");
		linkedList.add("두 번째");
		linkedList.add("세 번째");
		
		System.out.println("linkedList : " + linkedList);
		
		// 요소 삭제
		linkedList.remove(2);
		
		System.out.println("삭제 후 : " + linkedList);
		
		boolean isTrue = linkedList.contains("다섯 번째"); // 체크
		System.out.println("두 번째 요소 포함여부 : " + isTrue);
		
		
		// 요소 개수
		int size = linkedList.size();
		System.out.println("크기 : " + size);
		
		
		
		
	}

}
