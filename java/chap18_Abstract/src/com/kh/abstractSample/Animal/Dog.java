package com.kh.abstractSample.Animal;

public class Dog extends Animal{
	// 积己磊 super
	private String sound;
	
	public Dog(String name,String sound) {
		super(name);
		this.sound = sound;
	}
	
	
	// @Override
	@Override
	public void makeSound() {
		System.out.println("垄绰 家府 : " +sound);
	}
	
}
