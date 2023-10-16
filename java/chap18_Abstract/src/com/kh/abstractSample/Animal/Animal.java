package com.kh.abstractSample.Animal;

public abstract class Animal {
	// 필드 S name;
	
	private String name;
	
	// 생성자 
	public Animal(String n) {
		
		this.name = n;
	}
	
	// 추상메서드 동물소리출력 void makeSound;
	public abstract void makeSound();
		
	
	// 일반메서드 동물이름 출력 void 
	public void AnimalName() {
		System.out.println("동물 이름 : " + name);
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
