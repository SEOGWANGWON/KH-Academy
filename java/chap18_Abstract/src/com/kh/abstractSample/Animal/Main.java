package com.kh.abstractSample.Animal;

public class Main {
	public static void main(String[] agrs) {
		Dog dog = new Dog("�츮������ ����","�տ�");
		dog.AnimalName();
		dog.makeSound();
		
		Cat cat = new Cat("�츮 ����� �ູ��","���ƿ�");
		cat.AnimalName();
		cat.makeSound();
		// 1. cat�����
		// Cat ct = new Cat("�����");
		// 2. ��ä������ Animal �����ؼ� ����ϱ� �������� Ȱ���� ��ü �ٷ��
		// Animal[] animal = new Animal[2]
		Animal[] animal = new Animal[2];
		
		animal[0] = new Dog("�۸���","�п�");
		animal[1] = new Cat("�߿���","�߿�");
		
		// �Ҹ� ���
		for(Animal a : animal)
			a.AnimalName();
	        a.makeSound;
			System.out.println();
		
		
		
		/*
		animal[0] = dog;
		animal[1] = cat;
		
		System.out.println(animal[0].getName());
		*/
	}

}
