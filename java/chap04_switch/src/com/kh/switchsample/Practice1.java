package com.kh.switchsample;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 �޼ҵ� �� : public void practice1(){}
			�Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������ ��OO�޴��Դϴ١���,
			���� ��ȣ�� ������ �����α׷��� ����˴ϴ�.���� ����ϼ��� 
		 ex.
			1. �Է�
			2. ����
			3. ��ȸ
			4. ����
			7. ����
			�޴� ��ȣ�� �Է��ϼ��� : 3
			��ȸ �޴��Դϴ�.
		 */
		int menu;
		
		System.out.println("1. ȣ���� 2. �߰���� 3.������ ");
		System.out.print("�׸޴��� �����ϼ���. : ");
		menu = sc.nextInt();
		switch (menu) {
			case 1:
				System.out.println("ȣ������ �����ϼ̽��ϴ�. ");
				break;
			case 2:
				System.out.println("�߰������ �����ϼ̽��ϴ�. ");
				break;
			case 3:
				System.out.println("�������� �����ϼ̽��ϴ�. ");
				break;
			default:
				System.out.println("���� �޴��Դϴ�. ");
				
				
		}
	}

}
