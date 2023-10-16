package com.kh.pattern.mvc.Controller;

import com.kh.pattern.mvc.Model.UserModel;
import com.kh.pattern.mvc.View.UserView;

public class UserController {
	/*
	 * 모델과 뷰를 연결하는 곳
	 * 사용자 입력을 처리하는 곳
	 */
	private UserModel usermodel;

	private UserView userview;
	
	public UserController(UserModel usermodel, UserView userview) {
		this.usermodel = usermodel;
		this.userview = userview;
	}

	public void setUserName(String name) {
		//this.usermodel = usermodel;
		usermodel.setName(name);
	}

	public void setUserAge(int Age) {
		usermodel.setAge(Age);
	}
	
	public String getUserName() {
		return usermodel.getName();
	}
	
	public int getUserAge() {
		return usermodel.getAge();
	}
	
	
	public void updateView() {
		//DB에 값 변경될 부분 추가
		userview.displayInfo(usermodel.getName(), usermodel.getAge());
	}

}
