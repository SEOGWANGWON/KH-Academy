package com.kh.practice4.func;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
		//����ڷκ��� �Է� ���� ������ �ܺ��� 9�ܱ��� ����ϼ���.
		//��, 9�� �ʰ��ϴ� ���ڰ� ������ ��9 ������ ���ڸ� �Է����ּ��䡱�� ����ϼ���.

		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = sc.nextInt();
		
		while(num > 10) {
			System.out.println("9������ ���ڸ� �Է����ּ���");
			num = sc.nextInt();
		}
			for (int i = 1; num <= 9; num++) {
				System.out.println("===="+num+"��====");
				for(i = 1; i <=9; i++) {
					System.out.println(num + " * " + i + " = " + num * i);
				}
				
			}
		}
		
		
	}


