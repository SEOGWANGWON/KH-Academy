package com.kh.switchsample;
import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과일을 선택해주세요.");
		// int fruit = 3;
		
		int fruit = sc.nextInt();
		
		switch (fruit) {
			case 1:
				System.out.println("사과");
				break;
			case 2:
				System.out.println("포도");
				break;
			default:
				System.out.println("잘못된 선택입니다.");
		}
		
		//scanner 를 이용해서 과자를 선택하는 switch 를 하나 만들어주세요.
		
		System.out.println("쿠키를 선택하세요. ");
		
		int cookie = sc.nextInt();
		
		
		switch (cookie) {
			case 1:
				System.out.println("말차맛쿠키");
				break;
			case 2:
				System.out.println("딸기맛쿠키");
				break;
			case 3:
				System.out.println("내가만든쿠키");
				break;
			default:
				System.out.println("잘못 선택하셨습니다. 다시 선택 해주세요!.");
			
		
		
		}

		
		
		System.out.println("주문하실 번호를 선택해주세요.");
		System.out.print("1. 아메리카노 ");
		System.out.print("2. 흑당버블티 ");
		System.out.println("3. 말차밀크티 ");
		
		int choice = sc.nextInt();
		
		switch (choice) {
			case 1:
				System.out.println("아메리카노 주문하셨습니다.");
				break;
			case 2:
				System.out.println("흑당버블티 주문하셨습니다.");
				break;
			case 3:
				System.out.println("아인슈페너를 주문하셨습니다.");
				break;
			default:
				System.out.println("잘못된 선택입니다. 다시 주문해주세요.");
		}
	}

}
