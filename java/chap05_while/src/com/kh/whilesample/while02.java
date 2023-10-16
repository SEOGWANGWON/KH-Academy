package com.kh.whilesample;

import java.util.Scanner;

public class while02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isChoice = false;
		
		while (!isChoice) { // !를 사용하며 ture로 표기
			System.out.println("계절을 선택해 주세요.");
			
			int month = sc.nextInt();
			
			switch(month) {
				case 12: case 1: case 2: //case 3개중 하나라도 참이면 출력 (||가 사이에 숨겨져있음)
					System.out.println("겨울");
					System.out.println("겨울은 춥다.");
					System.out.println("겨울은 따뜻하게 입어야한다.");
					isChoice = true; // 위 ! 가 있을경우 참은 거짓으로 변경되고,
									 // 거짓은 참으로 변경되기 때문에 true로 작성해주어
									 // !를 만나 false로 변경해 while문을 종료해준다
					break; //break는 case문에서 실행하고자 하는게 종료된 후 한 번만 사용한다.
				case 3: case 4: case 5:
					System.out.println("봄");
					isChoice = true;
					break;
				case 6: case 7: case 8:
					System.out.println("여름");
					isChoice = true;
					break;
				case 9: case 10: case 11:
					System.out.println("가을");
					isChoice = true;
					break;
				default:
					System.out.println("잘못된 월 입니다.");
				
			}
			
			
		}
		
		/*
		 놀이공원을 입장하는데 9살 이상만 티켓을 구매할 수 있기 때문
		 나이를 입력받아 성인(19~20) 청소년(14~18) 어린이(10~13) 로 분류
		 while switch case 문을 이용해서 출력하기
		 이외 나이는 다시 입력하세요. 만들기
		 */
		boolean fun = false;
		//
		
		while (!fun) {
			System.out.println("나이를 입력해주세요.");
			int age = sc.nextInt();
			switch (age) {
			
				case 19: case 20:
					System.out.println("성인입니다.");
					fun = true;
					break;
				case 14: case 15: case 16: case 17: case 18:
					System.out.println("청소년입니다.");
					fun = true;
					break;
				case 10: case 11: case 12: case 13:
					System.out.println("어린이입니다.");
					fun = true;
					break;
				default:
					System.out.println("다시 입력하세요.");
			}
		}
		/*
		 while은 true와 false로만 작동하기때문에 변수를 넣기위해선 함수가 아닌이상 boolean을 넣어줘야하고
		 whilw(){
		 switch()
		 } switch는 break;로 끌수있지만 while은 바깥괄호에 있기때문에 펄스로 끝내줘야한다.
		 끝내기 위해서 변수를 넣고 그안에 boolean을 대입해주는것.
		 */
		
	}

}
