package com.kh.hw.person.view;
import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();



public void mainMenu() {
	System.out.println("���Ͻô� ��ȣ�� �Է����ּ���.");
	System.out.print("1. �л��޴� " + "2. ��� �޴� " + " 9. ������");
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
		System.out.println("�����մϴ�.");
		break;
	}else {
		System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
		mainMenu();
		break;
	}
		
	}
	
		
}
	
public void studentMenu() {
	System.out.println("���Ͻô� ��ȣ�� �Է����ּ���.");
	System.out.print("1. �л� �߰� " + "2. �л� ���� " + " 9. ��������");
	System.out.println();
	int num = sc.nextInt();
	while(true) {
		if(num == 1) {
			// /*
			if(pc.personCount().length <= 3) {
				System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ "
						+ "�л� �߰� �޴��� ���̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
				studentMenu();
			}else if (pc.printStudent().length <= 3 && num == 1) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
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
		System.out.println("�������� ���ư��ϴ�.");
		
		
		mainMenu();
		break;
	}else {
		System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
		studentMenu();
		break;
		
	}
		
	}
	
		
}

public void employeeMenu() {
	System.out.println("���Ͻô� ��ȣ�� �Է����ּ���.");
	System.out.print("1. ��� �߰�  " + "2. ��� ���� " + " 9. ��������");
	System.out.println();
	int num = sc.nextInt();
	while(true) {
		if(num == 1) {
			/*
			if(pc.printEmployee().length <= 10) {
				System.out.println("����� ���� �� �ִ� ������ �� á�� ������"
						+ " ��� �߰� �޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
				
			}
			*/
			
			insertEmployee();
		break;
	}else if(num == 2) {
			printEmployee();
		break;
	}else if(num == 9) {
		System.out.println("�������� ���ư��ϴ�.");
		mainMenu();
		break;
	}else {
		System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
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