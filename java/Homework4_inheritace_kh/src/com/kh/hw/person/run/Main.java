package com.kh.hw.person.run;

import java.util.Scanner;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Person;
import com.kh.hw.person.model.vo.Student;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] student  = new Student[3];
		Employee[] employee = new Employee[10];
		
		student[0] = new Student("���ǰ�",20,178.2,70.0,1,"�����ý��۰��а�");
		
		for(Student stdent : student) {
			System.out.println(stdent);
		}
		char ch;
		String name,dept;
		int age, salary,count=0;
		double height,weight;
		while(true) {
			System.out.print("1/6 �̸�:");
			name = sc.nextLine();
			
			System.out.print("2/6 ����:");
			age = sc.nextInt();
			
			System.out.print("3/6  Ű:");
			height = sc.nextDouble();
			
			System.out.print("4/6 ������");
			weight = sc.nextDouble();
			
			System.out.print("5/6 �޿�");
			salary = sc.nextInt();
			
			System.out.print("6/6 �μ�");
			dept = sc.nextLine();
			employee[count] = new Employee(name, age, height,weight,salary, dept);
			ch = sc.nextLine().toUpperCase().charAt(0);
			System.out.println("��� �Է��Ͻðڽ��ϱ� ? (y/n) : ");
			if(ch == 'N') {
				break;
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.println(employee[i].toString());
		}
		
	}

}
