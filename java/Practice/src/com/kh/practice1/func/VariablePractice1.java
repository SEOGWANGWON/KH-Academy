package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {

	public static void main(String[] args) {
		//이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
			Scanner sc = new Scanner(System.in);
			
			String name, sex;
			int age;
			double height;
			
			System.out.print("이름을 입력해 주세요. : ");
			name = sc.next();
			System.out.print("성별을 입력해 주세요.(남/여) : ");
			sex = sc.next();
			System.out.print("나이를 입력해 주십시요. : ");
			age = sc.nextInt();
			System.out.print("키를 입력하세요. : ");
			height = sc.nextDouble();
			
			
			System.out.println("이름 : "+name);
			System.out.println("성별 : "+sex);
			System.out.println("나이 : "+age);
			System.out.println("키 : " + height+ "cm");
			
	}

}
