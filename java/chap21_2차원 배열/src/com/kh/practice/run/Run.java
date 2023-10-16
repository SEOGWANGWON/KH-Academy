package com.kh.practice.run;

public class Run {

	public static void main(String[] args) {
		Run r = new Run();
		r.practice1();
		r.practice2();
		r.practice3();
		
	}
	
	public void practice1(){
		/*
		3행 3열짜리 문자열 배열을 선언 및 할당하고
		인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.

		ex.
		(0, 0)(0, 1)(0, 2)
		(1, 0)(1, 1)(1, 2)
		(2, 0)(2, 1)(2, 2)
		*/
		
		int[][] str = new int[3][3];
		
		
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < str[i].length; j++) {
				System.out.print("("+i+", "+j+")");
			}
			
			System.out.println();
		}
		
		
		
	}
	
	public void practice2() {
		/*
			4행 4열짜리 정수형 배열을 선언 및 할당하고
			1) 1 ~ 16까지 값을 차례대로 저장하세요.
			2) 저장된 값들을 차례대로 출력하세요.
			
			ex.
			1 2 3 4
			5 6 7 8
			9 10 11 12
			13 14 15 16
		 */
		int[][] num = new int[4][4];
		
		int a = 1;
		
		for(int i = 0; i<num.length; i++) {
			for(int j = 0; j<num[i].length; j++) {
				System.out.print(a++ +" ");
			}
			System.out.println();
		}
		
		
	}

	public void practice3() {
		/*
			4행 4열짜리 정수형 배열을 선언 및 할당하고
			1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
			2) 저장된 값들을 차례대로 출력하세요.
			
			ex.
			16 15 14 13
			12 11 10 9
			8 7 6 5
			4 3 2 1
		 */
		
		int[][] num = new int[4][4];
		int a = 16;
		
		
		for(int i = 0; i<num.length; i++) {
			for(int j = 0; j<num[i].length; j++) {
				System.out.print(a-- +" ");
			}
			System.out.println();
		}
		
	}
	
	public void practice4() {
		/*
		 * 4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
			아래의 내용처럼 처리하세요.
			
			ex.
			6 6 1 13
			4 10 8 22
			8 6 5 19
			18 22 14 108
		 */
		
		
	}

}


