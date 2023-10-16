package com.kh.practice1.func;
import java.util.Scanner;

public class MyVariablePractice3 {
	public static void main(String[] args) {
		//키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
		//계산 공식 ) 면적 : 가로 * 세로
		//			둘레 : (가로 + 세로) * 2
		Scanner sc = new Scanner(System.in);
		
		double width, length, area, perimeter;
		
		System.out.print("사각형의 가로 길이를 넣으시오.: ");
		width = sc.nextDouble();
		System.out.print("사각형의 세로 길이를 넣으시오.: ");
		length = sc.nextDouble();
		
		area = width * length;
		perimeter =(width + length)* 2;
		System.out.println("사각형의 면적 : " + area);
		System.out.println("사각형의 둘레 : " + perimeter);
		
		
		
		
	}
	

}
