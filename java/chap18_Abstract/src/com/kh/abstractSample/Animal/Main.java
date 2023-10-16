package com.kh.abstractSample.Animal;

public class Main {
	public static void main(String[] agrs) {
		Dog dog = new Dog("우리강아지 토토","왕왕");
		dog.AnimalName();
		dog.makeSound();
		
		Cat cat = new Cat("우리 고양이 행복이","뭬아옹");
		cat.AnimalName();
		cat.makeSound();
		// 1. cat만들기
		// Cat ct = new Cat("고양이");
		// 2. 객채베열로 Animal 정의해서 출력하기 다형성을 활용한 객체 다루기
		// Animal[] animal = new Animal[2]
		Animal[] animal = new Animal[2];
		
		animal[0] = new Dog("멍멍이","왈왈");
		animal[1] = new Cat("야옹이","야옹");
		
		// 소리 출력
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
