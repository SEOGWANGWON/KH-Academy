package com.kh.variable;

public class Variable {
	public static void main(String[] args) {
		// 1. 변수의 이름은 영문자, 숫자, 언더스코어, 달러($)로 구성할 수 있다.
		
		//2. 변수의 이름은 숫자로 시작할 수 없다.
		
		//3. 변수 이름 사이에는 공백을 포함할 수 없다.
		
		//언어의 규칙으로 띄어쓰기는 무언가 새로 시작할 때 사용하기 때문에 사용하지 않는다.
		
		//4. 자바에서 미리 예약한 언어는 변수이름으로 사용하지 못한다.
		// ex) int int = 1;
		
		//실수형 (소수점이 있는 숫자 :float, double)
		/*
		float pie1 = 3.141332213123213f;  //float은 f나 대문자F를 작성해준다.
		double pie2 = 3.141332213123213;
		System.out.print("float : ");
		System.out.println(pie1);
		System.out.print("double : ");
		System.out.println(pie2);
		
		
		// byte : 이는 -128 ~ 127 까지 사용가능
		//byte bt = -129; // int로 변경하거나 값을 byte + byte 로 나눠서 넣어줘야한다.
		// 어차피 그래봤자 출력값은 int라 바꿔야 한다.
		
		byte bt = 127; // -129와 128 이상부터 출력이 되지 않는 것 확인.
		System.out.println(bt);
		//short = -32,768 ~ 32,767 까지 사용가능
		//short shrt = -32769; //-32769와 32768 이후 출력되지 않음
		short shrt= -32767;
		System.out.println(shrt);
		
		//int - -2,147,483,648 ~ 2,147,483,647 까지 가능
		int nt = -2147483648;
		System.out.println(nt);
		
		//long -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 
		long lng = 2000L; //뒤에 L, l을 붙여준다. (예의)
		System.out.println(lng);
		
		// char : 문자형 글자를 한문자만 포함할 수 있음
		//		  '';
		char chr1 = 'a';
		System.out.println(chr1);
		
		
		// String은 기본적인 자료형에 들어가지는 않으나 기본적으로 사용됨
		// 기본적인 자료형에 들어가지 않기 때문에 String으로 표현됨
		// String ""나 ''안에 글자를 작성할 것
		String name = "안녕하세요.";
		
		*/
		//4. 논리형
		//boolean 은 true와 false 를 표현한다.
		//사용방법 boolean bln = true; false;
		
		boolean bln = true;
		System.out.println(bln);
		boolean bln2 = false;
		System.out.println(bln2);
		
		
		System.out.println("안녕하세요. 저는 이순신입니다.");
		String name = "이순신";
		System.out.println("안녕하세요. 저는 " + name + "입니다.");
		//한번 타입을 선언한 변수는 재선언을 하지 않고 그대로 사용해도 된다.
		//한번 선언한 타입을 다른 타입으로 재선언 할 수 없다.
		//선언한 타입을 다른 타입으로 변경해서 선언할 수 없다.
		
		name = "고길동";
		
		System.out.println("안녕하세요. 저는 " + name + "입니다.");
		
		int age = 22;
		String baseball = "야구";
		System.out.print("안녕하세요. 저는 " + name + "입니다.");
		System.out.print("저의 나이는 " + age + "살 이고, ");
		System.out.println("취미는 " + baseball + "입니다.");
		
		char score = 'a';
		System.out.println("저의 성적은 " + score + "입니다.");
		
		
		
		
	}

}
