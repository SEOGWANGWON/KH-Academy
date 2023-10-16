package com.kh.abstractSample;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle("Red", 5.0);
		System.out.println("Circle Area : " + circle.calculateArea());
		System.out.println("Circle Color : " + circle.getColor());
		Rectangle Rt = new Rectangle("Blue" , 7.7 , 5.5);
		System.out.println("Rectangle Area : " + Rt.calculateArea());
		System.out.println("Rectangle Color : " + Rt.getColor());
		
		
		// Rectangle r = new Rectangle
		
	}

}
