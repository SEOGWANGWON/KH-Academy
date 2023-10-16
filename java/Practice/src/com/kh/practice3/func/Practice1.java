package com.kh.practice3.func;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		/*메소드 명 : public void practice1(){}
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
		
		Scanner sc = new Scanner(System.in);
		System.out.println("번호만 입력바람 // 1.입력 2.수정 3.조회 4.삭제 7.종료");
		int choice = sc.nextInt();
		
		/** 1. if문 **/
		if (choice == 1) {
			System.out.println("입력");
		} else if (choice == 2) {
			System.out.println("수정");
		} else if (choice == 3 ) {
			System.out.println("조회");
		} else if (choice == 4 ) {
			System.out.println("삭제");
		} else if (choice == 7 ) { //else를 쓸 경우 조건을 넣지 못하기 때문에 else if를 써야함
			System.out.println("종료");
		}
			
		/** 2. switch문 **/
		
		switch(choice) {
			case 1:
				System.out.println("입력");
				break;
			case 2:
				System.out.println("수정");
				break;
			case 3:
				System.out.println("조회");
				break;
			case 4:
				System.out.println("삭제");
				break;
			case 7:
				System.out.println("종료");  // 조건이 7번을 실행하면 종료가 떠야하기떄문에 (컴퓨터같은)
				break;						// default가 아닌 case로 조건을 넣었다
			default :
				System.out.println("올바르지 않은 번호입니다.");
		}
		
		
		
		
		
		
	}

}
