package com.kh.mytest.func;

import java.util.Scanner;

public class ang {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 입력받기 위한 메소드
		
		//  1. 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		//	2. 단, 입력한 	수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		  System.out.println("숫자를 입력하세요."); // 출력 메소드
		  int num = sc.nextInt(); 
		
		  if ( num < 2) { // 만약에 입력한 수가 2보다 작을 경우
			  System.out.println("잘못 입력하셨습니다.");
		  }else { 
			  for(int i = 2; i <= num; i++) {
					  if(i % num == 0 && i / num == 1) {
				System.out.println("소수입니다.");
					  }else {
						  System.out.println("소수가 아닙니다");
					  }
					  // 만약에 입력한 수가 2보다 클 경우
			  }
		

	}

}
}