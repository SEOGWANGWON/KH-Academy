package com.kh.switchsample;
import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �������ּ���.");
		// int fruit = 3;
		
		int fruit = sc.nextInt();
		
		switch (fruit) {
			case 1:
				System.out.println("���");
				break;
			case 2:
				System.out.println("����");
				break;
			default:
				System.out.println("�߸��� �����Դϴ�.");
		}
		
		//scanner �� �̿��ؼ� ���ڸ� �����ϴ� switch �� �ϳ� ������ּ���.
		
		System.out.println("��Ű�� �����ϼ���. ");
		
		int cookie = sc.nextInt();
		
		
		switch (cookie) {
			case 1:
				System.out.println("��������Ű");
				break;
			case 2:
				System.out.println("�������Ű");
				break;
			case 3:
				System.out.println("����������Ű");
				break;
			default:
				System.out.println("�߸� �����ϼ̽��ϴ�. �ٽ� ���� ���ּ���!.");
			
		
		
		}

		
		
		System.out.println("�ֹ��Ͻ� ��ȣ�� �������ּ���.");
		System.out.print("1. �Ƹ޸�ī�� ");
		System.out.print("2. ������Ƽ ");
		System.out.println("3. ������ũƼ ");
		
		int choice = sc.nextInt();
		
		switch (choice) {
			case 1:
				System.out.println("�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.");
				break;
			case 2:
				System.out.println("������Ƽ �ֹ��ϼ̽��ϴ�.");
				break;
			case 3:
				System.out.println("���ν���ʸ� �ֹ��ϼ̽��ϴ�.");
				break;
			default:
				System.out.println("�߸��� �����Դϴ�. �ٽ� �ֹ����ּ���.");
		}
	}

}
