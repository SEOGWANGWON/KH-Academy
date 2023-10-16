package com.kh.example.practice2.model.vo;

public class Product2 {
	private String pName;
	private int price;
	private String brand;
	
	public Product2(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
		
		
	}
	
	
	public void information() {
		System.out.println("상품 이름 : " + pName);
		System.out.println("상품 가격 : " + price);
		System.out.println("브랜드 이름: " + brand);
		System.out.println("===================");
	
	}

}
