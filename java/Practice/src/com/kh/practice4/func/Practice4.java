package com.kh.practice4.func;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		/*
		    �� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
			��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���");
		int num = sc.nextInt();
		
		while(num <1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
			num = sc.nextInt();
		}
		for(int i = 1; i <= num; num--) {
			System.out.println(num);
		}
	}

}
