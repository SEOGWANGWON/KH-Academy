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
		
		student[0] = new Student("강건강",20,178.2,70.0,1,"정보시스템공학과");
		
		for(Student stdent : student) {
			System.out.println(stdent);
		}
		char ch;
		String name,dept;
		int age, salary,count=0;
		double height,weight;
		while(true) {
			System.out.print("1/6 이름:");
			name = sc.nextLine();
			
			System.out.print("2/6 나이:");
			age = sc.nextInt();
			
			System.out.print("3/6  키:");
			height = sc.nextDouble();
			
			System.out.print("4/6 몸무게");
			weight = sc.nextDouble();
			
			System.out.print("5/6 급여");
			salary = sc.nextInt();
			
			System.out.print("6/6 부서");
			dept = sc.nextLine();
			employee[count] = new Employee(name, age, height,weight,salary, dept);
			ch = sc.nextLine().toUpperCase().charAt(0);
			System.out.println("계속 입력하시겠습니까 ? (y/n) : ");
			if(ch == 'N') {
				break;
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.println(employee[i].toString());
		}
		
	}

}
