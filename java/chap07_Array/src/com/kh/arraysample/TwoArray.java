package com.kh.arraysample;

public class TwoArray {

	public static void main(String[] args) {
		// 이중 문자열 배열 선언과 초기화
		String[][] fruits = {
				{"Apple", "Banana", "Cherry"},
				{"Grapes", "Orenge", "Strawberry"},
				// {"Kiwi", "Mango", "pineApple"}
		};
		
		for( int i = 0; i < fruits.length; i++) { // 이차원 배열length 기준은 행
			for(int a = 0; a < fruits.length; a++) { // 행값이 기준이라 2행2열까지만 출력
				System.out.print(fruits[i][a] + " ");
			}
		System.out.println(); // 다음행으로 이동할 수 있게 enter용 출메
		}
		
	}

}
