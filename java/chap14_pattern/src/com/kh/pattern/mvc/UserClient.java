package com.kh.pattern.mvc;

import com.kh.pattern.mvc.Controller.UserController;
import com.kh.pattern.mvc.Model.UserModel;
import com.kh.pattern.mvc.View.UserView;

public class UserClient {
	public static void main(String[] args) {
		/*
			//모델 객체 생성
		 * MVC 패턴을 사용해서 유저정보를 다루는 곳
		 * */
			UserModel user = new UserModel("홍길동",20);
			
			//뷰 객체 생성
			UserView view = new UserView();
			
			//컨트롤러 객체 생성 및                              모델 뷰 설정
			UserController controller = new UserController(user, view);
			
			//유저 정보를 업데이트해서 출력
			controller.updateView();
			
			//유저 정보 업데이트
			controller.setUserName("이순신");
			controller.setUserAge(30);
			
			//업데이트 된 유저 정보 출력
			controller.updateView();
			
		}
}
