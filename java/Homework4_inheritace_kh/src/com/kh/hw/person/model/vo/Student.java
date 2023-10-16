package com.kh.hw.person.model.vo;

public class Student extends Person{
	
	private int grade;
	private String major;
	
	public Student() {
		
	}
	public Student(String name,int age, double weight, double height, int grade, String major) {
		super(age,weight,height);
		super.name = name;
		
		this.grade = grade;
		this.major = major;
		
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return super.toString() + " 학년 : " + grade + " 전공 : " + major;
	}
	
	
}
