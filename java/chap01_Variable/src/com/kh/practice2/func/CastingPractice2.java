package com.kh.practice2.func;
import java.util.Scanner;

public class CastingPractice2 {
	public static void main(String[] args) {
		// �Ǽ���(�Ҽ���)���� ����, ����, ���� �� ������ ������ �Է� �޾� ������ ����� ����ϼ���.
		// �� �� ������ ����� ���������� ó���ϼ���
		
		int kr, eng, math;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��ϼ���. : ");
		kr = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ���. : ");
		eng = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ���. : ");
		math = sc.nextInt();
		
		int total;
		double average;
		
		total = (kr + eng + math);
		System.out.println("������ "+total+"�Դϴ�.");
		average = (total / 3);
		System.out.println("��������� "+average+"�Դϴ�.");
		
		
				
		
		
		
		
	
	
	
	
	}

}
