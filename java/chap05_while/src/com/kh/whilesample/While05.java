package com.kh.whilesample;

import java.util.Scanner;

public class While05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5������ ������ �Է����ּ���.");
		
		int sum = 0; // sum�� 0�� ����
		int num = sc.nextInt(); // ���� � ���� �������� ��
		
		
		while (sum <= 10) {
			sum += num;
			num = num +1;
			System.out.println("num :" + sum);
			System.out.println("sum :" + num);
			
			
			
		}

	
	
	
	
	
	
	
	
	
	
	}

}
