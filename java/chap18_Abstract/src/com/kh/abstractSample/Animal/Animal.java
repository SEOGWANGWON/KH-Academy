package com.kh.abstractSample.Animal;

public abstract class Animal {
	// �ʵ� S name;
	
	private String name;
	
	// ������ 
	public Animal(String n) {
		
		this.name = n;
	}
	
	// �߻�޼��� �����Ҹ���� void makeSound;
	public abstract void makeSound();
		
	
	// �Ϲݸ޼��� �����̸� ��� void 
	public void AnimalName() {
		System.out.println("���� �̸� : " + name);
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
