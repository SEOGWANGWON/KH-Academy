package com.kh.variable;

public class VariableConversion {
	public static void main(String[] args) {
		//1. 자동형변환 (암시적 형변환, 묵시적 형변환)
		int intNum = 100;
		System.out.println(intNum); // 숫자 100을 의미
		long longNum = intNum;  //int를 long으로 자동형변환
		System.out.println(longNum);
		//long longNum = intNum = 100;
		
		float floatNum = 3.14f;
		double doubleNum = floatNum;  //float을 double로 자동형변환
		System.out.println(doubleNum);
		
		//int -> long 변경하는 형변환 2가지 만들기
		
		int intNum1 = 1004;
		long longNum1 = intNum1;
		System.out.println(longNum1);
		
		int intNum2 = 486;
		long longNum2 = intNum2;
		System.out.println(longNum2);
		
		
		//short -> int 변경하는 형변환 1가지 만들기
		
		short shortNum1 = 427;
		int intConversion = shortNum1;
		System.out.println(intConversion);
		
		
		
		//float -> double 변경하는 형변환 1가지 만들고 출력하기
		
		float floatNum7 = 3.14F;
		double doubleNum7 = floatNum7;
		System.out.println(doubleNum7);
		
		//2. 명시적 형변환 (강제 형변환)
		
		//long -> int
		long largeLong = 123456789012345L;
		System.out.println(largeLong);
		int largeint = (int) largeLong;
		System.out.println(largeint); //long을 int로 강제 형변환 할 경우 값이 
									  //범위안에 있지 않으면 일부데이터는 손실된다.
		
		double largeDouble1 = 12345.6789;
		int intPart = (int) largeDouble1;
		System.out.println(intPart); //실수를 int로 강제 형변환 할 때 (정수 부분만 유지된다.)
		
		//문자와 숫자 간의 형변환 2개 출력
		//Hint)문자는 char charBalue = 'Z' -> int로 변경
		
		int intNum13 = 65;
		char charBalue = (char)intNum13;
		System.out.println(charBalue);
		
		char charBalue1 = 'Z';
		int intBalue = (int)charBalue1;
		System.out.println(intBalue);
		
		
		//double -> int로 형변환 출력 1개
		double doubleNum11 = 3.14d;
		int intNum11 = (int)doubleNum11;
		System.out.println(intNum11);
		
		//int를 short로 형변환 1개 출력
		
		int intNum12 = 123456789;
		short shortNum12 = (short) intNum12;
		System.out.println(shortNum12);
		
	}
}
