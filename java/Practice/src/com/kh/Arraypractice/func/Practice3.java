package com.kh.Arraypractice.func;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		/*
		����ڿ��� �Է� ���� ���� ������ŭ �迭 ũ�⸦ �Ҵ��ϰ�
		1���� �Է� ���� ������ �迭�� �ʱ�ȭ�� �� ����ϼ���.
		ex.
		���� ���� : 5
		1 2 3 4 5 
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���");
		int[] user = new int[sc.nextInt()];
		
		for(int i = 0; i < user.length; i++) {
			user[i] += i+1;
			System.out.print(user[i]+" ");
		}
		
		
		
		
		
		}
		

	}























/*
Scanner sc = new Scanner(System.in);
System.out.println("���ڸ� �Է��ϼ���");

int num = sc.nextInt();

int[] ray = new int[num];

for(int i = 0; i < num ; i++) {
	ray[i] = i + 1;			
	System.out.println("���� ���� : " + ray[i]);
*/
