package com.kh.practice2.func;

public class CastingPractice3 {

	public static void main(String[] args) {
		/*
	 	선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산(+, -, *, /)과 형변환을 이용하여
		주석에 적힌 값과 같은 값이 나오도록 코드를 작성하세요.
		 */
		int iNum1 = 10;
		int iNum2 = 4;
		 
		float fNum = 3.0f;
		 
		double dNum = 2.5;
		 
		char ch = 'A';
		 						//(int)dNum
		System.out.println(iNum1 - iNum2 - iNum2); // 2
		System.out.println(iNum1 % iNum2); // 2
		 
							//int를 (double)로 바꿔서 실수로 나오는 문제
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
		System.out.println(iNum5); // 3 정수와 실수를 나눠서 3인 정수로 출력 // 10 / 3 -> int로 변환하면 3
		System.out.println(fNum2);// 3.3333333
		System.out.println(dNum2); // 3.3333333333333335
		
		int ch1 = (int)ch;
		System.out.println( ch ); // 'A'
		System.out.println( ch1 ); // 65
		System.out.println( ch1 + iNum1 ); // 75
		System.out.println( (char)(ch1 +iNum1) ); // 'K
	
	

	}

}
