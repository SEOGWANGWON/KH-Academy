package com.kh.inheritance.calculator;

import java.util.Scanner;

public class CalculatorRun extends Calculator{
						// 상속 
	public static void main(String[] args) {
		// Scanner 이용해서 코드 변경하기
		
		// 계산기
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 변경할 값을 입력하세요");
		int change1 = sc.nextInt();
		System.out.println("두번째 변경할 값을 입력하세요");
		int change2 = sc.nextInt();
		
		Calculator cal = new Calculator();
		int result1 = cal.add(change1,change2);
		int result2 = cal.substruct();
		int result3 = cal.multiply();
		int result4 = cal.divide();
	
		result1 = cal.add(change1,change2);
		result2 = cal.substruct();
		result3 = cal.multiply();
		result4 = cal.divide();
		
		System.out.println("add : " + result1);
		System.out.println("sub : " + result2);
		System.out.println("mul : " + result3);
		System.out.println("div : " + result4);
		
	}

}
