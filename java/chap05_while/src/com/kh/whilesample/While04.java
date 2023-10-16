package com.kh.whilesample;

public class While04 {

	public static void main(String[] args) {
		
		// 1부터 100까지 합 구하기
		/*
		int sum = 0; // 최종 합
		int num = 1;
		
		while (num <=100 ) {
			System.out.println("num 은 : " + num);
			sum += ++num;
			System.out.println(sum);
		}
	*/
		
		
		int sum = 0;
		int num = 1;
		while(num <=5 ) { // true
			System.out.println("num : " + 1);
			sum += num;
			num = num + 1;
			// System.out.println("sum 은 : " + sum);
			// sum의 합계를 주기적으로 보고싶으면 while문 안에 작성하기
			
		}
		System.out.println("sum 은 : " + sum);
		
		/*
		 while이 종료되었다해서 클래스가 종료된 것은 아님
		 while문이 종료된 후 남아있는 System.out,println(sum);이 출력됨
		 */
	
	}

}
