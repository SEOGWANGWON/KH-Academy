package com.kh.switchsample;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		/*
		Ű����� ������ �Է� ���� ������ ����̸鼭 ¦���� ���� ��¦���١��� ����ϰ�
		¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.
		����� �ƴϸ� ������� �Է����ּ���.���� ����ϼ���.
		ex)
			���ڸ� �� �� �Է��ϼ��� : -8
			����� �Է����ּ���.
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���.");
		int num = sc.nextInt();
		
		if (num % 2 == 0 && num >= 0) {
			System.out.println("¦��");
		} else if (num % 2 == 1){
			System.out.println("Ȧ��");
		} else {
			System.out.println("����� �Է����ּ���");
		}
				

	}

}
