package com.kh.example.practice2.model.vo;

public class Product { // 1. 멤버 변수 생성 
	String pName;
	int price;
	String brand;
	
	
	//					생성자 (메서드 중 일부)
	public Product(String pName,int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
		
		
		
		
		
	
		
	
	} // 3. 정보 출력 메소드 만들기
	public void information() {
		System.out.println("상품명 : " + pName);
		System.out.println("가격 : " + price);
		System.out.println("브랜드 : " + brand);
	}

}
