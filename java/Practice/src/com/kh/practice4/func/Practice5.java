package com.kh.practice4.func;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		//1���� ����ڿ��� �Է� ���� �������� �������� ���� ����ϼ���.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���");
		int num = sc.nextInt();
		int num2 = 1;
		for(int i = 1; i <= num; i++ ) {
			num2 +=  i;
			System.out.println(num2);
			
		}
	}

}
