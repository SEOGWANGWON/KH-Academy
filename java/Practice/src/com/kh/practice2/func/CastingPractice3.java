package com.kh.practice2.func;

public class CastingPractice3 {

	public static void main(String[] args) {
		/*
	 	���� �� �ʱ�ȭ�� 5���� ������ ������ �˸��� ��Ģ����(+, -, *, /)�� ����ȯ�� �̿��Ͽ�
		�ּ��� ���� ���� ���� ���� �������� �ڵ带 �ۼ��ϼ���.
		 */
		int iNum1 = 10;
		int iNum2 = 4;
		 
		float fNum = 3.0f;
		 
		double dNum = 2.5;
		 
		char ch = 'A';
		 						//(int)dNum
		System.out.println(iNum1 - iNum2 - iNum2); // 2
		System.out.println(iNum1 % iNum2); // 2
		 
							//int�� (double)�� �ٲ㼭 �Ǽ��� ������ ����
		System.out.println(dNum * iNum2); // 10.0
							// (double)dNum
		System.out.println(dNum + dNum + dNum + dNum ); // 10.0
		
		float fNum3 = (float)dNum;
		System.out.println((float)(iNum1 / iNum2) ); // 2.5
		System.out.println(fNum3); // 2.5
		 
		int iNum3 = (int)fNum;
		
		float fNum2 = (iNum1 / fNum);
		double dNum2 = (double)fNum2;
		int iNum5 = (iNum3 * iNum3) / iNum3;  
		System.out.println(iNum3); // 3 float fNum = 3.0f -> 3
		System.out.println(iNum5); // 3 ������ �Ǽ��� ������ 3�� ������ ��� // 10 / 3 -> int�� ��ȯ�ϸ� 3
		System.out.println(fNum2);// 3.3333333
		System.out.println(dNum2); // 3.3333333333333335
		
		int ch1 = (int)ch;
		System.out.println( ch ); // 'A'
		System.out.println( ch1 ); // 65
		System.out.println( ch1 + iNum1 ); // 75
		System.out.println( (char)(ch1 +iNum1) ); // 'K
	
	

	}

}
