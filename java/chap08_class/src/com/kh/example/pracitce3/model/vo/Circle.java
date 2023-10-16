package com.kh.example.pracitce3.model.vo;

public class Circle {
	// 필드(멤버변수)
	 private double Pl = 3.14;
	 private int radius = 1;
	  
	
	
	// 생성자        매개변수 (파라미터)
	  // 기본생성자로 냅두고 아무런 초기화도 진행하지 않는다.
	public Circle() {
		
		
		
		
	}
	
	
	public double getPl() {
		return Pl;
	}
	public int getRadius() {
		return radius;

	}
	public void setPl(double pl) {
		Pl = pl;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}


	// 출력 메소드
	public void incrementRadius() {
		// radius++;
		System.out.println(radius);
	}
	public void getAreaOfCircle() {
		double area = Pl * radius * radius;
		System.out.println(area);
	}
	public void getSizeOfCircle() {
		System.out.println("원의 반지름 : " + radius);
		
		
	}
	
	{
		
		
	}
	
	
	
	
	
	
	
	
}
