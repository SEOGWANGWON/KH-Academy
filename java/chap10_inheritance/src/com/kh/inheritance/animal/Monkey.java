package com.kh.inheritance.animal;

public class Monkey extends Animal{
	public Monkey(String name) {
		super(name);
	}
	
	public void speak() { // Override
		System.out.println(getName() + "�� �ϽǷ¿� ���̿��� ��� ���մϴ�");
	}

}
