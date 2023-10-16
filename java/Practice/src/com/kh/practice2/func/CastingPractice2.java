package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		// 실수형(소수점)으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
				// 이 때 총점과 평균은 정수형으로 처리하세요
				
				double kr, eng, math;
				int total, average;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.print("국어 점수를 입력하세요. : ");
				kr = sc.nextDouble();
				System.out.println(kr);
				System.out.print("수학 점수를 입력하세요. : ");
				eng = sc.nextDouble();
				System.out.println(eng);
				System.out.print("영어 점수를 입력하세요. : ");
				math = sc.nextDouble();
				System.out.println(math);
				
				
				total = (int)(kr + eng + math);
				System.out.println("총점은 "+total+"입니다.");
				average = (total / 3);
				System.out.println("평균점수는 "+average+"입니다.");
				

	}

}
