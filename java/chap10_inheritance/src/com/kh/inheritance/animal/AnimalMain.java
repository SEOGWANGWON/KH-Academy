package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Dog myDog = new Dog("����");
		myDog.info();
		myDog.speak();
		
		
		Cat mycat = new Cat("��߹�");
		mycat.run();
		mycat.eat();
		
		Monkey MK = new Monkey("��ŰŰ");
		MK.speak();
		MK.eat();
		
		Rion Rn = new Rion("����");
		Rn.eat();
		Rn.speak();
		
		
		
		
	}

}
