package com.kh.operator;
 
public class Arithmetic {

	public static void main(String[] args) {
		// 1. 산술 연산자 : 더하기(+),빼기(-),곱하기(*),나누기 몫(/), 나누기 나머지(%)
		int num1 = 5;
		int num2 = 2;
		System.out.println("더하기 + : "+(num1 + num2)); // 안에 문자열이 있으면 
		System.out.println("빼기 - : "+(num1 - num2));	// 괄호가 있어야 숫자로 인식함.
		System.out.println("곱하기 * : "+(num1 * num2));
		System.out.println("나누기 몫 / : "+(num1 / num2));
		System.out.println("나누기 나머지 % + : "+(num1 % num2));
		
	}
}
