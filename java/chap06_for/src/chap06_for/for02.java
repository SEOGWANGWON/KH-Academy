package chap06_for;

import java.util.Scanner;

public class for02 {

	public static void main(String[] args) {
		// ������ �����
		
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int num1 = sc.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int num2 = sc.nextInt();
		
		int result = 0; //���� ���� 0���� �ݴϴ�.
		for (int i = 0; i < num2; i++) { // for ������ ����ؼ� i ������ 0���� num2 �̸����� �ݺ� 
										 // �� ������ �ι�° ������ num2 ��ŭ �ݺ�
			result += num1;
			System.out.println("�� = " +num1 + " * " + num2 + " = " + result);
			// result ������ num1 ���� ����
			// num2 ��ŭ num1�� ���ϴ� ȿ���� ��
		}
		System.out.println(num1 + " * " + num2 + " = " + result);
		// ���� ����� ��� �Է¹��� �� ���ڿ� ��� ���� ���ڿ��� �����ؼ� ���
		
		*/
		
		/* ������	
		for (int i = 1; i <= 2; i++) {
			for(int j = 1; j <= 20; j++) {
				boolean sniffling =  ((i % j) == 2);{
					System.out.println("¦��");
				};
				System.out.println(i % j +"¦��");
			}
		}
		*/ 
		
		
		for (int i = 2; i <= 9; i++) {
			for(int j = 1; j <=9; j++) {
			
			int total = i * j;
			
			System.out.println(i + " * " + j + " = " +total);
		}
		
		}
	}
}
		
		
