package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {

	public static void main(String[] args) {
		//�̸�, ����, ����, Ű�� ����ڿ��� �Է� �޾� ������ ���� ������ ��� ����ϼ���.
			Scanner sc = new Scanner(System.in);
			
			String name, sex;
			int age;
			double height;
			
			System.out.print("�̸��� �Է��� �ּ���. : ");
			name = sc.next();
			System.out.print("������ �Է��� �ּ���.(��/��) : ");
			sex = sc.next();
			System.out.print("���̸� �Է��� �ֽʽÿ�. : ");
			age = sc.nextInt();
			System.out.print("Ű�� �Է��ϼ���. : ");
			height = sc.nextDouble();
			
			
			System.out.println("�̸� : "+name);
			System.out.println("���� : "+sex);
			System.out.println("���� : "+age);
			System.out.println("Ű : " + height+ "cm");
			
	}

}
