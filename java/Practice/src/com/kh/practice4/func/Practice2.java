package com.kh.practice4.func;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		/*
		�� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
		��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		ex.
		1�̻��� ���ڸ� �Է��ϼ��� : 4 1�̻��� ���ڸ� �Է��ϼ��� : 0
		1 2 3 4 1 �̻��� ���ڸ� �Է����ּ���.
		1�̻��� ���ڸ� �Է��ϼ��� : 8
		1 2 3 4 5 6 7 8 
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���.");
		int num = sc.nextInt();
		
		/*
		while (num < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
			num = sc.nextInt();
		 {
			for(int i = 1; i <= num; i++ ) {
				System.out.println(i);
			}
		}
	
		 */
		 boolean isTrue = true;  //������ �Ѱ�
		 
		 while (isTrue) {
			 if (num <= 1) {
		 
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
			} else {
				for(int i = 1; i <= num; i++ ) {
					
					System.out.println(i);
				}
			}
			
	}
	
	
	
	}
	
}