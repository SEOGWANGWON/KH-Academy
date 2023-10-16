package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkdedListExam {

	public static void main(String[] args) {
		// List 인터페이스 LinkedList 객체 활용해서 값넣고 출력
		List<String> lkList = new LinkedList<>();
		
		// String 값 넣고 수정 삭제 출력
		lkList.add("그지같네");
		lkList.add("아오 진짜");
		System.out.println(lkList);
		lkList.set(1, "아오오!!!!진짜!!!!!");
		System.out.println(lkList);
		lkList.remove(1);
		System.out.println(lkList);
		
		
		
		// LinkedList 객체 new LinkedList 객체
		LinkedList<Integer> lkList2 = new LinkedList<>();
		
		
		
		// int 값 넣고 수정 삭제 출력
		
		lkList2.add(18);
		lkList2.add(58);
		System.out.println(lkList2);
		
		lkList2.set(1, 28);
		System.out.println(lkList2);
		lkList2.remove(1);
		System.out.println(lkList2);
		
		
	}

}
