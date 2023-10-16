package com.kh.practice4.func;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
		//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		//단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.

		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		while(num > 10) {
			System.out.println("9이하의 숫자를 입력해주세요");
			num = sc.nextInt();
		}
			for (int i = 1; num <= 9; num++) {
				System.out.println("===="+num+"단====");
				for(i = 1; i <=9; i++) {
					System.out.println(num + " * " + i + " = " + num * i);
				}
				
			}
		}
		
		
	}


