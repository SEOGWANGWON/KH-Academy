package com.kh.Arraypractice.func;
import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		/*
		3�̻��� Ȧ�� �ڿ����� �Է� �޾� �迭�� �߰������� 1���� 1�� �����Ͽ� ������������ ���� �ְ�,
		�߰� ���ĺ��� �������� 1�� �����Ͽ� ������������ ���� �־� ����ϼ���.
		��, �Է��� ������ Ȧ���� �ƴϰų� 3 �̸��� ��� ���ٽ� �Է��ϼ��䡱�� ����ϰ�
		�ٽ� ������ �޵��� �ϼ���.
		ex.
		���� : 4
		�ٽ� �Է��ϼ���.
		���� : -6
		�ٽ� �Է��ϼ���.
		���� : 5
		1, 2, 3, 2, 1
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = sc.nextInt();
		int[] numArr = new int[num];
		int num2 = 0;
		
		if(!(num < 3 && num % 2 == 0) ) {
			for (int i = 0; i < num ; i++) {
				if( i < numArr.length / 2) {
					numArr[i] = ++num2;
				}else if(i > numArr.length / 2) {
					numArr[i] = --num2;
				}System.out.print(numArr[i]+",");
			}
		}else {
			System.out.println("�ٽ� �Է��ϼ���");
			num = sc.nextInt();
			
		}
		
		
		
		

	}

}
