package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		//���� ���ڿ� ���� Ű����� �Է� �޾� ���ڿ��� �տ��� �� ���� ����ϼ���.
				//ex) ���ڿ��� �Է��ϼ��� : apple
				
				String language;
				Scanner sc = new Scanner(System.in);
				System.out.print("���ڿ��� �Է��ϼ���. : ");
				language = sc.next();
				
				// char impossible = .language.charAt()
				// ���ڸ��� ���� ���������ڰ� 1�ڰ� �Ѿ ����� �� �� ����
				// �ڸ� ��ġ ���ؼ� ����ϱ�
				
				
				char impossible = language.charAt(0);
				System.out.println("index 0�� ° �ڸ� : " +impossible);
				char impossible2 = language.charAt(1);
				System.out.println("index 1�� ° �ڸ� : " +impossible2);
				char impossible3 = language.charAt(2);
				System.out.println("index 2�� ° �ڸ� : " +impossible3);
				
				String c2 = language.substring(0,3);
				System.out.println("index 2��° �ڸ� : " + c2);
				// ���ڸ��� �ƴ϶� �ڸ��� �����ؼ� ����� �� ����
				// ���۸� ���ص� �ǰ� ���� �����ص� ��
				
				
	}

}
