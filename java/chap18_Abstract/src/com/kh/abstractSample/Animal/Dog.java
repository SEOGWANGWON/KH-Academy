package com.kh.abstractSample.Animal;

public class Dog extends Animal{
	// 생성자 super
	private String sound;
	
	public Dog(String name,String sound) {
		super(name);
		this.sound = sound;
	}
	
	
	// @Override
	@Override
	public void makeSound() {
		System.out.println("짖는 소리 : " +sound);
	}
	
}
