package com.kh.Arraypractice.func;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		/*
		������ ~ ���ϡ����� �ʱ�ȭ�� ���ڿ� �迭�� ����� 0���� 6���� ���ڸ� �Է� �޾�
		�Է��� ���ڿ� ���� �ε����� �ִ� ������ ����ϰ�
		������ ���� ���ڸ� �Է� �� ���߸� �Է��ϼ̽��ϴ١��� ����ϼ���.
		ex.
		0 ~ 6 ���� ���� �Է� : 4 0 ~ 6 ���� ���� �Է� : 7
		 �߸� �Է��ϼ̽��ϴ�.
		*/
		
		
		Scanner sc = new Scanner(System.in);
		String[] day = {"��","ȭ","��","��","��","��","��"};
		
		System.out.println("���ڸ� �Է����ּ���");
		int num = sc.nextInt();
		
		if(num >= 0 && num <7) {
			System.out.println(day[num]);
			
		}else{
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		
		
		
		
		
		
		
		
	}
}


















/*
Scanner sc = new Scanner(System.in);

System.out.println("���ڸ� �Է��ϼ���.");
int num = sc.nextInt();

String[] day = {"��","ȭ","��","��","��","��","��"};

if (num > 6) {
	System.out.println("�߸� �Է��ϼ̽��ϴ�.");
} else {
	System.out.println(day[num]);
}
*/
