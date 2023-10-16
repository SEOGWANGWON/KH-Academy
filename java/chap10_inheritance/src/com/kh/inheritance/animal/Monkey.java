package com.kh.inheritance.animal;

public class Monkey extends Animal{
	public Monkey(String name) {
		super(name);
	}
	
	public void speak() { // Override
		System.out.println(getName() + "가 니실력에 잠이오냐 라고 말합니다");
	}

}
