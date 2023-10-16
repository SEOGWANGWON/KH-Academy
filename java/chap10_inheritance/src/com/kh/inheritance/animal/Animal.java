package com.kh.inheritance.animal;

public class Animal { // 동물 클래스 정의
	private String name;
	private int age;
	
	
	public Animal(String name) {
		this.name = name;
		
	}
	
	public void setName() {
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void info() {
		System.out.println("이름 " + name);
	}
	
	// Override // Animal에 적혀있는 eat을 고양이 안에서만 다시 정의를 내린다.
	
	public void eat() {
		System.out.println(name + "가 먹이를 먹습니다.");
	}
	public void sleep() {
		System.out.println(name + "가 잠을 잡니다.");
	}
	public void speak() {
		System.out.println(name + "가 말을합니다");
	}
	
	
	
}
