package com.kh.abstractSample.Animal;

public class Cat extends Animal{
	private String sound;
	
	public Cat(String name, String sound) {
		super(name);
		this.sound = sound;
	}

	@Override
	public void makeSound() {
		System.out.println("���� �Ҹ� : " +sound);
		
	}

}
