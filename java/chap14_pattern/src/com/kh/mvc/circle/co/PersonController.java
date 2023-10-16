package com.kh.mvc.circle.co;
import com.kh.mvc.circle.mo.PersonModel;
import com.kh.mvc.circle.vo.PersonView;

public class PersonController {
	private PersonModel personmodel;
	private PersonView personview;



public PersonController(PersonModel personmodel, PersonView personview) {
	this.personmodel = personmodel;
	this.personview = personview;
}

public void PersonInfoView() {
	String userName = personmodel.getname();
	personmodel.setname(userName);
	int userAge = personmodel.getage();
	personmodel.setage(userAge);
	personview.PersonInfo(userName,userAge);
}

}