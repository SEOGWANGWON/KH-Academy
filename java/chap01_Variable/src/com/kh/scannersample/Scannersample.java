package com.kh.scannersample;

import java.util.Scanner;

//java.tuil.* �ε� ��
public class Scannersample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̸� �Է��� �ּ��� : ");
		int age = sc.nextInt(); //������ �޴� next
		System.out.println("�� ���̴� " + age + "�Դϴ�.");
		
		String name;
		int phoneNumber;
		
		
		System.out.println("����� �̸��� �Է��ϼ���. : ");
		name = sc.next();
		System.out.println("����� �ڵ��� ��ȣ�� �Է��ϼ���. : ");
		phoneNumber =sc.nextInt(); //-���� �ʱ�
		
		System.out.println("����� �̸��� " + name + "�Դϴ�.");
		System.out.println("����� �ڵ��� ��ȣ�� " + phoneNumber + "�Դϴ�.");
		
		//�� ��̿� ���� �����ϴ� ���İ� �� �ּ� 1�� ����ϱ�
		
		String hobby;
		String myFood;
		String myAdress;
		
		System.out.println(name+ "���� ��̰� �����ΰ���?. : ");
		hobby = sc.next(); // ������ ���� ����. �ٿ����°͸� ����.
		System.out.println("��̰� " + hobby + "�̽ñ���!.");
		
		System.out.println(name+"���� ���� �����ϴ� ������ �����ΰ���?. : ");
		myFood = sc.next();
		System.out.println(name+"���� "+ myFood + "�� �����Ͻô±���!.");
		
		System.out.println(name+"���� ���� ��� ��� ��Ű���?. : ");
		myAdress = sc.next();
		System.out.println(myAdress+"�̸� �� �հ����� ���˳׿�!.");
		
		
		// sc.nextLine(); ���� ġ�� �������� ��� 
		
		
	}

}
