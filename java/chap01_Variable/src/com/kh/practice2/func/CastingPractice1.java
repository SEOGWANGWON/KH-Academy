package com.kh.practice2.func;
import java.util.Scanner;

public class CastingPractice1 {
	public static void main(String[] args) {
		//키보드로 문자 하나를 입력 받아 그 문자의 숫자를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나를 입력하시오. : ");
		
		char cr2;
		
		cr2 = sc.next().charAt(0);
		System.out.println(cr2);
		
		int cr1 = (int)cr2;
		System.out.println(cr1);
		
		
		
		
		
		
	}

}
