package com.kh.practice4.func;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		/*
		    위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
			“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		while(num <1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			num = sc.nextInt();
		}
		for(int i = 1; i <= num; num--) {
			System.out.println(num);
		}
	}

}
