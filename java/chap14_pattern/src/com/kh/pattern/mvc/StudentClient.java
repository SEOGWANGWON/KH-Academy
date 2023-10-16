package com.kh.pattern.mvc;

import com.kh.pattern.mvc.Controller.StudentController;
import com.kh.pattern.mvc.Model.StudentModel;
import com.kh.pattern.mvc.View.StudentView;

public class StudentClient {
	/*
	  MVC 패턴을 사용해서 학생정보를 다루는 곳
	 */
	
	public static void main(String[] args) {
		// 모델 객체 생성 Model
		StudentModel model = new StudentModel("고길동",47);
		//  뷰 객체 생성 View
		StudentView view = new StudentView();
		// 컨트롤러 객체 생성 Controller(모델 뷰 설정)
		StudentController controller = new StudentController(model, view);
		//학생 정보를 업데이트해서 출력

		controller.updateView();
		//학생 정보 업데이트를 하자!
		
		controller.setStudentName("엄준식");
		controller.setStudentAge(28);
		//업데이트 된 학생 정보를 출력
		controller.updateView();
		
	}
}
