package com.kh.arrayListSample;

import java.util.ArrayList;
/*
  toDoSample.java
  ArrayList 이용해서 할일 만들고 3
  수정하고 2
  지우고 1
  전부다 삭제하기
 */
/*
  요소추가 == add
  요소 수정 == set
  요소 개수 확인 == size
  요소 지정 확인 == get
  요소 제거 == remove
  요소 비우기 == clear 
 */
public class ArrayListExam {

	public static void main(String[] args) {
		// 빈 ArrayList 생성
		ArrayList<String> fruits = new ArrayList();
		
		System.out.println("fruits : " + fruits); // fruits : [] 
		
		
		// 요소 추가
		fruits.add("aplle");
		System.out.println("사과 추가 : " + fruits);
		fruits.add("banana");
		System.out.println("바나나 추가 : " + fruits);
		fruits.add("kiwi");
		System.out.println("키위 추가 : " + fruits);
		
		// 요소 개수 확인
		int size = fruits.size();
		System.out.println("과일 목록의 크기 : " + size);
		
	
		String firstFruits = fruits.get(0);
		
		System.out.println("과일목록의 첫번째 과일 : " +firstFruits);
		
		String fruits3 =fruits.get(2); // 참조 변수
		System.out.println("과일목록의 세번째 과일 : " + fruits3);
		
		
		// 요소 수정할거야
		fruits.set(2, "복숭아");
		
		System.out.println("수정체크 : " + fruits3);
		System.out.println("수정체크 all : " + fruits);
		
		// 요소 제거
		fruits.remove(1);
		System.out.println("banana 제거확인 : " + fruits);
		
		// ArrayList 순회해서 요소출력
		System.out.println("모든 과일 목록");
		
	//  for (요소의 데이터 타입 / (우리가 정할 변수명 ) : (목록이 들어있는 변수명) {
		for (	String			fruit 		: 		fruits)
		
		
		// ArrayList 비우기
		fruits.clear();
		System.out.println("모든 과일을 제거한 후  : " + fruits);
	}

}
