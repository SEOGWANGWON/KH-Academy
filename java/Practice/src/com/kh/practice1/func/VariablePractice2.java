package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public static void main(String[] args) {
		//Ű����� ���� �� ���� �Է� �޾� �� ���� ��, ��, ��, �������� ���� ����ϼ���.
		
				Scanner sc = new Scanner(System.in);
				
				int num1, num2;
				
				System.out.print("ù��° ������ �Է��Ͻÿ�.: ");
				num1 = sc.nextInt();
				System.out.print("�ι�° ������ �Է��Ͻÿ�.: ");
				num2 = sc.nextInt();
				
				System.out.println(num1 + num2);
				System.out.println(num1 - num2);
				System.out.println(num1 * num2);
				System.out.println(num1 / num2);
				System.out.println(num1 % num2);
	}

}
