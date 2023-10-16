package com.kh.practice4.func;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int num2 = 1;
		for(int i = 1; i <= num; i++ ) {
			num2 +=  i;
			System.out.println(num2);
			
		}
	}

}
