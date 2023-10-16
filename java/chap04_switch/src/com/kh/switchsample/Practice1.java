package com.kh.switchsample;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 메소드 명 : public void practice1(){}
			아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
			종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요 
		 ex.
			1. 입력
			2. 수정
			3. 조회
			4. 삭제
			7. 종료
			메뉴 번호를 입력하세요 : 3
			조회 메뉴입니다.
		 */
		int menu;
		
		System.out.println("1. 호박죽 2. 닭고기죽 3.단팥죽 ");
		System.out.print("죽메뉴를 선택하세요. : ");
		menu = sc.nextInt();
		switch (menu) {
			case 1:
				System.out.println("호박죽을 선택하셨습니다. ");
				break;
			case 2:
				System.out.println("닭고기죽을 선택하셨습니다. ");
				break;
			case 3:
				System.out.println("단팥죽을 선택하셨습니다. ");
				break;
			default:
				System.out.println("없는 메뉴입니다. ");
				
				
		}
	}

}
