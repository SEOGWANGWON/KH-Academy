package com.kh.example.practice4.model.vo;

public class Student { // ��� ���� ����
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;

	//  ������ (�޼ҵ� �� �Ϻ�)
	public Student(int grade,int classroom,String name,double height,char gender) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;
	
	}
	public Student() {
		
	}
	// ��� �޼ҵ�
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void information() {
		System.out.println("�г�	  : " + grade);
		System.out.println("�� ��ȣ	  : " + classroom);
		System.out.println("�̸�	  : " + name);
		System.out.println("Ű 	  : " + height);
		System.out.println("���� 	  : " + gender);
		System.out.println("================");
		
	
		
	}
	{
	}
}
