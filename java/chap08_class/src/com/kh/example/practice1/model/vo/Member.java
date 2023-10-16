package com.kh.example.practice1.model.vo;

public class Member {
	String memberID;
	String memberPwd;
	String memberName;
	int age;
	char gender;
	String phone;
	String email;
	
	
	public Member(String memberID,String memberPwd,String memberName,int age,char gender,String phone,String email) {
		this.memberID = memberID;
		this.memberName = memberName;
		this.memberPwd = memberPwd;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}
	public void changeName(String name) {
		memberName = name;	
		System.out.println("새로운 이름! : "+ memberName);
		System.out.println("===============");
	}
	public void printName() {
		System.out.println(memberID);
		System.out.println(memberPwd);
		System.out.println(memberName);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(phone);
		System.out.println(email);
		System.out.println("================");
		
		
	}
	
	
}
