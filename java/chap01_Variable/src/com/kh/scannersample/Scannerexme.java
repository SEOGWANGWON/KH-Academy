package com.kh.scannersample;
import java.util.Scanner;

public class Scannerexme {
	public static void main(String[] args) {
		// ���� �� ���� �Է¹޾�, �� ���� ��, ��, ��,������ �� ��� ������ ���
		/*
		int inum1 = 30;
		int inum2 = 3;
		
		System.out.println(inum1 - inum2);
		*/
		
		Scanner sc = new Scanner(System.in);
		int inum4, inum5;
		System.out.println("������ �Է��ϼ���. : ");
		inum4 = sc.nextInt();
		System.out.println("�� �ٸ� ������ �Է��ϼ���. : ");
		inum5 = sc.nextInt();
		System.out.println(inum4 - inum5);
		
		
	}
}
