package com.kh.hw.person.model.vo;

public class Person {
	protected String name;
	private int age; 
	private double height;
	private double weight;
	
	public Person() {
		
	}
	public Person(int age, double weight, double height) {
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "이름 : " +name +" 나이 : "+ age + " 몸무게 : " +weight + " 키 : " +height;
	}
	


}
