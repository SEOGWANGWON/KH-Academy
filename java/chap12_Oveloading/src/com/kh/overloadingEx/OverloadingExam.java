package com.kh.overloadingEx;
/*
 	java ������ �������
 	OverSample.java �����
 	�����ε� 5�� ����� �޼��� 5�� ����ϱ�
 */

public class OverloadingExam extends OverSample{
	// ������ ����
	public int sum(int a, int b) {
				return a+b;
				
	}
	
	// �� ���� ������ ����
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public double sum(double a, double b) {
		return a+b;
	}
			
			
			
			
	public static void main(String[] agrs) {
		OverloadingExam obj = new OverloadingExam();
		OverSample obs = new OverSample();		
		
		
		//�޼��� ȣ��
		System.out.println("�� ������ �� : " + obj.sum(10,20));
		
		System.out.println("�� ������ �� : " + obj.sum(10, 20, 30));
		
		System.out.println("�� �Ǽ��� �� : " + obj.sum(10.5, 10.5));
		
		System.out.println(obs.Math(3,44));
		
		System.out.println(obs.Math(1, 2));
		
		
		
	}

}
