package com.kh.pattern.mvc.Model;

public class StudentModel {
	/*
	 1. 학생 정보 표현 
	 private 이름 나이
	 getter setter 만들기
	 
	 */
	private String name; // 학생 이름
	private int age; // 학생 나이
	
	public StudentModel(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
		
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
