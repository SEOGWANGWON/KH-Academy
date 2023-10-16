package com.kh.practice;
// ComparExam -> User Student Actor rename
// implement Compare
//

public class Student implements Comparable<Student>{
	private String name;
	private int grade;
	
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	@Override
	public int compareTo(Student otherStudent) {
		// 학년을 기준으로 비교
		return this.grade -otherStudent.grade;
	}
	
	@Override
	public String toString() {
		return "Student{이름 : "+name+", 학년 : "+grade+"}";
	}

}
