package com.kh.practice4.func;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		// ����ڷκ��� �Է� ���� ������ ���� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = sc.nextInt();
		
		System.out.println("====" + num + "�� ====");
		for(int i = 1; i <= 9; i++ ) {
			System.out.println(num +" * "+ i+" = "+ num * i);
		}
		
		
	
	
	
	}

}
