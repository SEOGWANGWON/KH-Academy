package com.kh.calculatorMVC;

import java.util.Scanner;

public class CalculatorView {
	
	public int getUserInput() {
		System.out.println("숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

		//계산된 결과
	public void displayResult(int result) {
		System.out.println("결과 : " + result);
	}
}
