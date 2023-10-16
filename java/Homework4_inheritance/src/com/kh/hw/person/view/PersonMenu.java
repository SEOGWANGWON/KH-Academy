package com.kh.hw.person.view;
import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();



public void mainMenu() {
	System.out.println("원하시는 번호를 입력해주세요.");
	System.out.print("1. 학생메뉴 " + "2. 사원 메뉴 " + " 9. 끝내기");
	System.out.println();
	int num = sc.nextInt();
	while(true) {
		if(num == 1) {
			studentMenu();
		break;
	}else if(num == 2) {
			employeeMenu();
		break;
	}else if(num == 9) {
		System.out.println("종료합니다.");
		break;
	}else {
		System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		mainMenu();
		break;
	}
		
	}
	
		
}
	
public void studentMenu() {
	System.out.println("원하시는 번호를 입력해주세요.");
	System.out.print("1. 학생 추가 " + "2. 학생 보기 " + " 9. 메인으로");
	System.out.println();
	int num = sc.nextInt();
	while(true) {
		if(num == 1) {
			// /*
			if(pc.personCount().length <= 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 "
						+ "학생 추가 메뉴는 더이상 활성화 되지 않습니다.");
				studentMenu();
			}else if (pc.printStudent().length <= 3 && num == 1) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				studentMenu();
			}
			else {
			
			insertStudent();
			}
			// */
			insertStudent();
		break;
	}else if(num == 2) {
			printStudent();
		break;
	}else if(num == 9) {
		System.out.println("메인으로 돌아갑니다.");
		
		
		mainMenu();
		break;
	}else {
		System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		studentMenu();
		break;
		
	}
		
	}
	
		
}

public void employeeMenu() {
	System.out.println("원하시는 번호를 입력해주세요.");
	System.out.print("1. 사원 추가  " + "2. 사원 보기 " + " 9. 메인으로");
	System.out.println();
	int num = sc.nextInt();
	while(true) {
		if(num == 1) {
			/*
			if(pc.printEmployee().length <= 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에"
						+ " 사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
				
			}
			*/
			
			insertEmployee();
		break;
	}else if(num == 2) {
			printEmployee();
		break;
	}else if(num == 9) {
		System.out.println("메인으로 돌아갑니다.");
		mainMenu();
		break;
	}else {
		System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		employeeMenu();
		break;
	}
		
	}
	
}

public void insertStudent() {
		
	
}

public void printStudent() {
	
	
}

public void insertEmployee() {
	
}

public void printEmployee() {
	
}



	


}