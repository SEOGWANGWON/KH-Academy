package com.kh.pracitce7.func;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		/*
		�޼ҵ� �� : public void practice7(){}
		����ڿ��� ���� ũ�⸦ �Է� �ް� �� ����ŭ�� �ݺ��� ���� ���� ũ�⵵ �޾�
		������ ���� �迭�� ���� �� �Ҵ��ϼ���.
		�׸��� �� �ε����� ��a������ �� �ε����� ������ŭ �ϳ��� �÷� �����ϰ� ����ϼ���.

		ex.
		���� ũ�� : 4
		0���� �� ũ�� : 2
		1���� �� ũ�� : 6
		2���� �� ũ�� : 3
		3���� �� ũ�� : 5
		a b
		c d e f g h
		i j k
		l m n o p
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ũ�� : ");
		int numRows = sc.nextInt();
		sc.nextLine(); // ���� ���� ����
		
		int[][] charArray = new int[numRows][];
		//�� ����ŭ�� �ݺ��� ����
		for(int i = 0; i < numRows)
			
			
			
		int numCols = sc.nextInt();
				
		charArray[i] = new int[numCols];
		
		int StartValue = i *numCols + 1;
		for (int j = 0; j < numCols; j++) {
			charArray[i][j] = StartValue++;
		}
		
		for(int i = 0; i<numRows; i++) {
			for(int j = 0; j<)
		}
			
		sc.close(); // �Ⱦ��� �޸� ���� ������ �鿩����
			

	}

}
