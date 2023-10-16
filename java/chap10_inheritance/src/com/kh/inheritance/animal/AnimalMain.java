package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Dog myDog = new Dog("토토");
		myDog.info();
		myDog.speak();
		
		
		Cat mycat = new Cat("고야미");
		mycat.run();
		mycat.eat();
		
		Monkey MK = new Monkey("몽키키");
		MK.speak();
		MK.eat();
		
		Rion Rn = new Rion("어흥");
		Rn.eat();
		Rn.speak();
		
		
		
		
	}

}
