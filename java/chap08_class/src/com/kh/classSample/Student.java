package com.kh.classSample;

public class Student {
	// 1. ������� (�л��� �Ӽ�)
	String name;
	int age;
	String grade;
	
	/*********** ������ / �����ڴ� �޼��� �� �Ϻ�************/
	public Student(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		
		
		
	}
	// �л� ���� ��� �޼���
	public void displayInfo() {
		System.out.println("�л� �̸� : " + name);
		System.out.println("��   �� : " + age);
		System.out.println("��   �� : " + grade);
		
	}
	
}
/*
 *  package com.kh.classSample;
 *  public class family
 *  
 *  String name;
 *  int age;
 *  String sex;
 *  
 *  public Family(String name,int age, String sex)
 *  	this.name = name;
 *  	this.age = age;
 *  	this.sex = sex;
 *  
 *  
 *  
 */
