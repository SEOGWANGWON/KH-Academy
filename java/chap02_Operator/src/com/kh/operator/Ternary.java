package com.kh.operator;

public class Ternary {

	public static void main(String[] args) {
		// 6.���� ������(Ternary)
		/*
		 
		 ���� = ���� ? ���� : ����
		 ������ ���ϰ� �� ���� �� �� �ϳ��� ��ȯ�մϴ�.
		 ���� ? ��1 : ��2 ���·� ���	
		 ���� ? ��1(=ture) : ��2(=false)
		 �� 1�� ������ ���� �� ���
		 �� 2�� ������ ������ �� ���
		 int age = 20;
		 String status = (age >= 20) ? "����" : "�̼�����";
		 System.out.println(status);
		 
		 
		 
		 
		 */
		//ex) ���̰� 20�̻��� �����ΰ� �̼������ΰ�
		/*
		int age = 20;
		String status = (age >= 20) ? "����" : "�̼�����";
		System.out.println(status);
		
		int score = 85;
		String result = (score >= 60) ? "�հ�" : "���հ�";
		System.out.println("������ : " + result);
		
		int number = -5;
		String sign = (-5 > 0) ? "true" : "false";
		System.out.println("sigh : " +sign);
		
		
		int temperature = 25;
		String weather = (temperature > 21) ? "������ ����" : "�ҽ��� ����";
		System.out.println("���� ���´� : "+weather);
		*/
		// ���� 7�� ���� ¦������ Ȧ������ ��� 1��
		
		int num1 = 7;
		String num2 = (7 == 2) ? "¦��" : "Ȧ��";
		System.out.println(num2);
		
		/*
		 int value = 7;
		 String evenorOdd = (value % 2 == 0) ? "¦��" : "Ȧ��";
		 System.out.println("¦�� �Ǵ� Ȧ�� : " + evenorOdd);
		 */
		
		int number2 = -5;
		String sign2 = (number2 > 0) ? "���" : (number2 < 0) ? "����" : "0";
		System.out.println("������ ��ȣ: "+sign2);
		
		
		
	}

}
