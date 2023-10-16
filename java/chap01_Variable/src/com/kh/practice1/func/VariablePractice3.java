package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public static void main(String[] args) {
		//키보드로 가로, 세로 값을 실수형으로 입력 받아
		Scanner sc = new Scanner(System.in);
		System.out.print("가로의 길이는 ? ");
		
		double width, height;
		
		width = sc.nextDouble();
		System.out.print("세로의 길이는 ? ");
		height = sc.nextDouble();
		System.out.println("가로 : " + width + " 세로 : " + height);
		
		
		
	}

}
