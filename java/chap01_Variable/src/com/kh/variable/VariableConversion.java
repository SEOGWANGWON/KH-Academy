package com.kh.variable;

public class VariableConversion {
	public static void main(String[] args) {
		//1. �ڵ�����ȯ (�Ͻ��� ����ȯ, ������ ����ȯ)
		int intNum = 100;
		System.out.println(intNum); // ���� 100�� �ǹ�
		long longNum = intNum;  //int�� long���� �ڵ�����ȯ
		System.out.println(longNum);
		//long longNum = intNum = 100;
		
		float floatNum = 3.14f;
		double doubleNum = floatNum;  //float�� double�� �ڵ�����ȯ
		System.out.println(doubleNum);
		
		//int -> long �����ϴ� ����ȯ 2���� �����
		
		int intNum1 = 1004;
		long longNum1 = intNum1;
		System.out.println(longNum1);
		
		int intNum2 = 486;
		long longNum2 = intNum2;
		System.out.println(longNum2);
		
		
		//short -> int �����ϴ� ����ȯ 1���� �����
		
		short shortNum1 = 427;
		int intConversion = shortNum1;
		System.out.println(intConversion);
		
		
		
		//float -> double �����ϴ� ����ȯ 1���� ����� ����ϱ�
		
		float floatNum7 = 3.14F;
		double doubleNum7 = floatNum7;
		System.out.println(doubleNum7);
		
		//2. ����� ����ȯ (���� ����ȯ)
		
		//long -> int
		long largeLong = 123456789012345L;
		System.out.println(largeLong);
		int largeint = (int) largeLong;
		System.out.println(largeint); //long�� int�� ���� ����ȯ �� ��� ���� 
									  //�����ȿ� ���� ������ �Ϻε����ʹ� �սǵȴ�.
		
		double largeDouble1 = 12345.6789;
		int intPart = (int) largeDouble1;
		System.out.println(intPart); //�Ǽ��� int�� ���� ����ȯ �� �� (���� �κи� �����ȴ�.)
		
		//���ڿ� ���� ���� ����ȯ 2�� ���
		//Hint)���ڴ� char charBalue = 'Z' -> int�� ����
		
		int intNum13 = 65;
		char charBalue = (char)intNum13;
		System.out.println(charBalue);
		
		char charBalue1 = 'Z';
		int intBalue = (int)charBalue1;
		System.out.println(intBalue);
		
		
		//double -> int�� ����ȯ ��� 1��
		double doubleNum11 = 3.14d;
		int intNum11 = (int)doubleNum11;
		System.out.println(intNum11);
		
		//int�� short�� ����ȯ 1�� ���
		
		int intNum12 = 123456789;
		short shortNum12 = (short) intNum12;
		System.out.println(shortNum12);
		
	}
}
