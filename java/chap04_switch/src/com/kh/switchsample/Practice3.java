package com.kh.switchsample;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		
		/*
		 	ex 1. 		ex 2.
			�������� : 88 		�������� : 88
			�������� : 50 		�������� : 50
			�������� : 40 		�������� : 45
			���հ��Դϴ�. 		���� : 88
							���� : 50
							���� : 45
							�հ� : 183
							��� : 61.0
							�����մϴ�, �հ��Դϴ�
		 */
		Scanner sc = new Scanner(System.in);
			
		int korea, math, eng;
		
		System.out.print("���� ������ �Է��ϼ���. : ");
		korea = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ���. : ");
		math = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ���. : ");
		eng = sc.nextInt();
		
		int total = korea + math + eng;
		double average = total / 3;
		
		System.out.println("���� : "+korea);
		System.out.println("���� : "+math);
		System.out.println("���� : "+eng);
		System.out.println("�հ� : "+total);
		System.out.println("��� : "+average);
		
		if ( average >= 60 ) {
			System.out.println("�����մϴ�, �հ��Դϴ�!.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
		
		
			
	
	
	
	
	
	}

}
