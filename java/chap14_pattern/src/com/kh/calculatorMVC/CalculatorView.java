package com.kh.calculatorMVC;

import java.util.Scanner;

public class CalculatorView {
	
	public int getUserInput() {
		System.out.println("���ڸ� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

		//���� ���
	public void displayResult(int result) {
		System.out.println("��� : " + result);
	}
}
