package com.kh.ifsample;

public class IfSample {

	public static void main(String[] args) {
		// 조건문
		/*
		 if, else if, else 등의 문장을 사용해서 조건에 따라 코드 블록 실행
		 주어진 조건을 평가하고, 참일 경우 특정 코드 실행
		 거짓일 경우 다른 코드 실행
		 if(조건문){
		 	참(true)이면 실행
		 }거짓(false)면 종료
		 
		 
		 */
		int money = 300;
		if (money >= 200) {
			//true
			System.out.println("집에 가져간다.");
			int age = 18;
			if (age >= 18) {
				System.out.println("틀딱");
				
				int temp = 25;
				if (temp > 24) {
					System.out.println("날씨가 선선하여 무더위도 점점 줄어들고 있습니다.");
				}
			}
		
		}
			
	}

}
