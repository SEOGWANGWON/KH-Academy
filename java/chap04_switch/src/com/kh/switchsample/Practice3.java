package com.kh.switchsample;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		
		/*
		 	ex 1. 		ex 2.
			국어점수 : 88 		국어점수 : 88
			수학점수 : 50 		수학점수 : 50
			영어점수 : 40 		영어점수 : 45
			불합격입니다. 		국어 : 88
							수학 : 50
							영어 : 45
							합계 : 183
							평균 : 61.0
							축하합니다, 합격입니다
		 */
		Scanner sc = new Scanner(System.in);
			
		int korea, math, eng;
		
		System.out.print("국어 점수를 입력하세요. : ");
		korea = sc.nextInt();
		System.out.print("수학 점수를 입력하세요. : ");
		math = sc.nextInt();
		System.out.print("영어 점수를 입력하세요. : ");
		eng = sc.nextInt();
		
		int total = korea + math + eng;
		double average = total / 3;
		
		System.out.println("국어 : "+korea);
		System.out.println("수학 : "+math);
		System.out.println("영어 : "+eng);
		System.out.println("합계 : "+total);
		System.out.println("평균 : "+average);
		
		if ( average >= 60 ) {
			System.out.println("축하합니다, 합격입니다!.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		
			
	
	
	
	
	
	}

}
