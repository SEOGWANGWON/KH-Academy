package com.kh.mvc.circle.co;
import com.kh.mvc.circle.mo.PersonModel;
import com.kh.mvc.circle.vo.PersonView;
import com.kh.mvc.circle.co.PersonController;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		PersonModel model = new PersonModel("°íº´Âù",19);
		PersonView view = new PersonView();
		PersonController controller = new PersonController(model, view);
		
		
		controller.PersonInfoView();
		
		
		
		
	}
	
}
