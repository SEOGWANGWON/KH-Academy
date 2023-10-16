package com.kh.scannersample;

import java.util.Scanner;

//java.tuil.* 로도 씀
public class Scannersample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해 주세요 : ");
		int age = sc.nextInt(); //정수만 받는 next
		System.out.println("내 나이는 " + age + "입니다.");
		
		String name;
		int phoneNumber;
		
		
		System.out.println("당신의 이름을 입력하세요. : ");
		name = sc.next();
		System.out.println("당신의 핸드폰 번호를 입력하세요. : ");
		phoneNumber =sc.nextInt(); //-넣지 않기
		
		System.out.println("당신의 이름은 " + name + "입니다.");
		System.out.println("당신의 핸드폰 번호는 " + phoneNumber + "입니다.");
		
		//내 취미와 내가 좋아하는 음식과 내 주소 1개 출력하기
		
		String hobby;
		String myFood;
		String myAdress;
		
		System.out.println(name+ "씨의 취미가 무엇인가요?. : ");
		hobby = sc.next(); // 공백을 받지 않음. 붙여쓰는것만 가능.
		System.out.println("취미가 " + hobby + "이시군요!.");
		
		System.out.println(name+"씨가 제일 좋아하는 음식이 무엇인가요?. : ");
		myFood = sc.next();
		System.out.println(name+"씨는 "+ myFood + "를 좋아하시는군요!.");
		
		System.out.println(name+"씨는 지금 어디에 살고 계신가요?. : ");
		myAdress = sc.next();
		System.out.println(myAdress+"이면 꽤 먼곳에서 오셧네요!.");
		
		
		// sc.nextLine(); 엔터 치기 전까지를 출력 
		
		
	}

}
