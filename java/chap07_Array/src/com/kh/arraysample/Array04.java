package com.kh.arraysample;

public class Array04 {

	public static void main(String[] args) {
		// Array 예제
		//
		String[] inturnArray = {"김경난","김말똥","홍길동","박철수","허허허"};
		inturnArray[3] = "박한나";
		System.out.println("박철수대신 " + inturnArray[3]);
		
		/*
		 예제 String[] fruitArray = {"사과","딸기","키위","메론","귤"};
		 사과에는 바나나
		 딸기에는 수박
		 키위에는 레몬
		 베론에는 귤
		 귤에는 오렌지
		 */
		
		String[] fruitArray = {"사과","딸기","키위","메론","귤"};
		
		fruitArray[0] = "바나나";
		fruitArray[1] = "수박";
		fruitArray[2] = "레몬";
		fruitArray[3] = "귤";
		fruitArray[4] = "오렌지";
		
		for (int i = 0; i < 5; i++) {
			System.out.println(fruitArray[i]);
		}
		
		
		
		int[] numbers = {1,2,3,4,5};
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i]; //1,2,3,4,5
		}
		System.out.println("배열 요소의 합 : " + sum);
		
		
		
	}

}
