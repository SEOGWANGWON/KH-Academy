package com.kh.example.practice1.model.vo;

public class Run {

	public static void main(String[] args) {
		// String memberID,String memberPwd,String memberName
		// int age,char gender,String phone,String email
		Member member = new Member("kyungnan0901","1000재개발자","김경난",20,'여',"01010048282","kyungnan@naver.com");
		Member member1 = new Member("leesunsin","niceguy","이순신",56,'남',"01058825353","leesunsin@naver.com");
		
		member.printName();
		member1.changeName("곽철호");
		member1.printName();
		member.changeName("엄준식");
		member.printName();
	}

}


//  <br/>  깃허브 메모장 엔터취급
