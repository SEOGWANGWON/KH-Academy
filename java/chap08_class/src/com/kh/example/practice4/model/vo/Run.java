package com.kh.example.practice4.model.vo;

public class Run {

	public static void main(String[] args) {
		// int grade,int classroom,String name,double height,char gender
		Student student = new Student(1,2,"��浿",171.2,'��');
		Student student1 = new Student(2,1,"������",157.2,'��');
		Student student2 = new Student(3,3,"���ؽ�",178.4,'��');
		Student student8 = new Student();
		
		student8.setGender('��');
		
		student.information();
		student1.information();
		student2.information();
		
	}

}
