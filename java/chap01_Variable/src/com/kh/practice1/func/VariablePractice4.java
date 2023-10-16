package com.kh.practice1.func;
import java.util.Scanner;

public class VariablePractice4 {
	public static void main(String[] args) {
		//영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
		//ex) 문자열을 입력하세요 : apple
		
		String language;
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요. : ");
		language = sc.next();
		char impossible = language.charAt(0);
		System.out.println(impossible);
		char impossible2 = language.charAt(1);
		System.out.println(impossible2);
		char impossible3 = language.charAt(2);
		System.out.println(impossible3);
		
	
	
	
	
	}

	private static char[] language(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
