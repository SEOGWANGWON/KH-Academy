package com.kh.hw.person.model.vo;


public class Student extends Person{
	
	private int grade; 
	private String major; // Àü°ø

	public Student() {
		
	}
	public Student(String name, int age, double height, double weight, int grade, String major) {
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
	
	public String toString() {
		return major;
	}
	
	
}