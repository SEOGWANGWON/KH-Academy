package com.kh.example.practice4.model.vo;

public class Run {

	public static void main(String[] args) {
		// int grade,int classroom,String name,double height,char gender
		Student student = new Student(1,2,"고길동",171.2,'남');
		Student student1 = new Student(2,1,"엄복순",157.2,'여');
		Student student2 = new Student(3,3,"엄준식",178.4,'남');
		Student student8 = new Student();
		
		student8.setGender('남');
		
		student.information();
		student1.information();
		student2.information();
		
	}

}
