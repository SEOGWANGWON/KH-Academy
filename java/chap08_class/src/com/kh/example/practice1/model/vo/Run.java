package com.kh.example.practice1.model.vo;

public class Run {

	public static void main(String[] args) {
		// String memberID,String memberPwd,String memberName
		// int age,char gender,String phone,String email
		Member member = new Member("kyungnan0901","1000�簳����","��泭",20,'��',"01010048282","kyungnan@naver.com");
		Member member1 = new Member("leesunsin","niceguy","�̼���",56,'��',"01058825353","leesunsin@naver.com");
		
		member.printName();
		member1.changeName("��öȣ");
		member1.printName();
		member.changeName("���ؽ�");
		member.printName();
	}

}


//  <br/>  ����� �޸��� �������
