package com.kh.practice4.func;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		System.out.println("====" + num + "단 ====");
		for(int i = 1; i <= 9; i++ ) {
			System.out.println(num +" * "+ i+" = "+ num * i);
		}
		
		
	
	
	
	}

}
