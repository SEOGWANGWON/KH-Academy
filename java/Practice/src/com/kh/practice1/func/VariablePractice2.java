package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public static void main(String[] args) {
		//키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
		
				Scanner sc = new Scanner(System.in);
				
				int num1, num2;
				
				System.out.print("첫번째 정수를 입력하시오.: ");
				num1 = sc.nextInt();
				System.out.print("두번째 정수를 입력하시오.: ");
				num2 = sc.nextInt();
				
				System.out.println(num1 + num2);
				System.out.println(num1 - num2);
				System.out.println(num1 * num2);
				System.out.println(num1 / num2);
				System.out.println(num1 % num2);
	}

}
