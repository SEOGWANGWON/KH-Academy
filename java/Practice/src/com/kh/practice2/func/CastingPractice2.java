package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		// �Ǽ���(�Ҽ���)���� ����, ����, ���� �� ������ ������ �Է� �޾� ������ ����� ����ϼ���.
				// �� �� ������ ����� ���������� ó���ϼ���
				
				double kr, eng, math;
				int total, average;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.print("���� ������ �Է��ϼ���. : ");
				kr = sc.nextDouble();
				System.out.println(kr);
				System.out.print("���� ������ �Է��ϼ���. : ");
				eng = sc.nextDouble();
				System.out.println(eng);
				System.out.print("���� ������ �Է��ϼ���. : ");
				math = sc.nextDouble();
				System.out.println(math);
				
				
				total = (int)(kr + eng + math);
				System.out.println("������ "+total+"�Դϴ�.");
				average = (total / 3);
				System.out.println("��������� "+average+"�Դϴ�.");
				

	}

}
