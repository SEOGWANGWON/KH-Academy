package com.kh.pracitce7.func;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		/*
		메소드 명 : public void practice7(){}
		사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
		문자형 가변 배열을 선언 및 할당하세요.
		그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.

		ex.
		행의 크기 : 4
		0행의 열 크기 : 2
		1행의 열 크기 : 6
		2행의 열 크기 : 3
		3행의 열 크기 : 5
		a b
		c d e f g h
		i j k
		l m n o p
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("행의 크기 : ");
		int numRows = sc.nextInt();
		sc.nextLine(); // 개행 문자 제거
		
		int[][] charArray = new int[numRows][];
		//그 수만큼의 반복을 통해
		for(int i = 0; i < numRows)
			
			
			
		int numCols = sc.nextInt();
				
		charArray[i] = new int[numCols];
		
		int StartValue = i *numCols + 1;
		for (int j = 0; j < numCols; j++) {
			charArray[i][j] = StartValue++;
		}
		
		for(int i = 0; i<numRows; i++) {
			for(int j = 0; j<)
		}
			
		sc.close(); // 안쓰면 메모리 누수 습관들 들여야함
			

	}

}
