package com.kh.example.practice2.model.vo;

public class Product { // 1. ��� ���� ���� 
	String pName;
	int price;
	String brand;
	
	
	//					������ (�޼��� �� �Ϻ�)
	public Product(String pName,int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
		
		
		
		
		
	
		
	
	} // 3. ���� ��� �޼ҵ� �����
	public void information() {
		System.out.println("��ǰ�� : " + pName);
		System.out.println("���� : " + price);
		System.out.println("�귣�� : " + brand);
	}

}
