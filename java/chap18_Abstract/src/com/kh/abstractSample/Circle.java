package com.kh.abstractSample;
// 추상 클래스를 상속받는 구체적인 클래스 정의 (하위 클래스)
public class Circle extends Shape{
	private double radius;
	
	
	//생성자
	public Circle(String color, double radius) {
		super(color); // 부모 클래스의 생성자 호출
		this.radius = radius;
	}
	
	
	// 추상 메서드를 구현
	
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	
}
