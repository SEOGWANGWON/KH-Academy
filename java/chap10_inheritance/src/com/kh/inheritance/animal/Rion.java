package com.kh.inheritance.animal;

public class Rion extends Animal{

	public Rion(String name) {
		super(name);
		
	}
	
	public void eat() {
		System.out.println(getName() + "가 공중제비를 돕니다.");
	}
	

}
