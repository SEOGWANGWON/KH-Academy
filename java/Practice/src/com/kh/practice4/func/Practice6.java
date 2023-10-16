package com.kh.practice4.func;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		System.out.println("숫자를 입력하세요");
		int num2 = sc.nextInt();
		
		for(int i = 1; num <= num2 ; num++) {
			System.out.println(num);
		}
				
	}

}
