package com.kh.practice1.func;
import java.util.Scanner;

public class MyVariablePractice3 {
	public static void main(String[] args) {
		//Ű����� ����, ���� ���� ���� �Ǽ������� �Է� �޾� �簢���� ������ �ѷ��� ����Ͽ� ����ϼ���.
		//��� ���� ) ���� : ���� * ����
		//			�ѷ� : (���� + ����) * 2
		Scanner sc = new Scanner(System.in);
		
		double width, length, area, perimeter;
		
		System.out.print("�簢���� ���� ���̸� �����ÿ�.: ");
		width = sc.nextDouble();
		System.out.print("�簢���� ���� ���̸� �����ÿ�.: ");
		length = sc.nextDouble();
		
		area = width * length;
		perimeter =(width + length)* 2;
		System.out.println("�簢���� ���� : " + area);
		System.out.println("�簢���� �ѷ� : " + perimeter);
		
		
		
		
	}
	

}
