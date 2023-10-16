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
				
				// char impossible = .language.charAt()
				// 한자리씩 보기 때문에글자가 1자가 넘어가 출력을 할 수 없음
				// 자리 위치 정해서 출력하기
				
				
				char impossible = language.charAt(0);
				System.out.println("index 0번 째 자리 : " +impossible);
				char impossible2 = language.charAt(1);
				System.out.println("index 1번 째 자리 : " +impossible2);
				char impossible3 = language.charAt(2);
				System.out.println("index 2번 째 자리 : " +impossible3);
				
				String c2 = language.substring(0,3);
				System.out.println("index 2번째 자리 : " + c2);
				// 한자리가 아니라 자리를 지정해서 출력할 수 있음
				// 시작만 정해도 되고 끝을 지정해도 됨
				
				
	}

}
