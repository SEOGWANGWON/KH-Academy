package com.kh.example.pracitce3.model.vo;

public class Circle {
	// �ʵ�(�������)
	 private double Pl = 3.14;
	 private int radius = 1;
	  
	
	
	// ������        �Ű����� (�Ķ����)
	  // �⺻�����ڷ� ���ΰ� �ƹ��� �ʱ�ȭ�� �������� �ʴ´�.
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


	// ��� �޼ҵ�
	public void incrementRadius() {
		// radius++;
		System.out.println(radius);
	}
	public void getAreaOfCircle() {
		double area = Pl * radius * radius;
		System.out.println(area);
	}
	public void getSizeOfCircle() {
		System.out.println("���� ������ : " + radius);
		
		
	}
	
	{
		
		
	}
	
	
	
	
	
	
	
	
}
