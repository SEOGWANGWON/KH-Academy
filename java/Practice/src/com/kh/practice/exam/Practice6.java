package com.kh.practice.exam;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		
		/*
		 1�̻��� ���ڸ� �Է��ϼ���
		 
		 ����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���
		 ��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
		 ���� 1 �̸��� ���ڰ� �Էµƴٸ� "1 �̻��� ���ڸ� �Է����ּ���"�� ����ϼ���
		 */
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���");
		int num = sc.nextInt();
		
		
		if(num < 1) { // ���� 1 �̸��� ���ڰ� �Է��� �ǰų� �Է��� ���� 
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}else {
			for (int i = 1; i <= num; i++) {
				System.out.println(i);
			}
			//3. ���� false �����
			
		}*/
		
		Practice6 p = new Practice6(10);
		System.out.println(p.arr);
		
}

	private int[] arr;
	
	
	
	public Practice6(int size) {
		arr = new int[size];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		size = scanner.nextInt();
		for(int i = 0; i<arr.length; i++) {
			arr[i] += i;
			System.out.println(arr[i]);
			
		}
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
