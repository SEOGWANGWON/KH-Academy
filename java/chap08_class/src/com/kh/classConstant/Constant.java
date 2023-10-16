package com.kh.classConstant;

public class Constant {

	public static void main(String[] args) {
		// 상수 사용
		final int a = 1;	// 더 이상 a의 값을 바꾸지 못하게 잠궈둠
		final int b = 1;
		System.out.println("a의 값 : " + a);
		System.out.println("b의 값 : " + b);
		
		// a = 2;  a를 상수 1로 정해놨기 떄문에 2로 값을 변경하려고 하면 에러가남.
 		System.out.println("a의 값 : " + a);
		
		
		
		
		
		
	}

}
