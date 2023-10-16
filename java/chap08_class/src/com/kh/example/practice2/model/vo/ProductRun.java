package com.kh.example.practice2.model.vo;

public class ProductRun {
	
	public static void main(String[] agrs) {
		// Product 생성 3개 하고
		// 각각 상품명 가격 브랜드명 출력하기
		
		Product Product = new Product("한식뷔페",6000,"맥주창고");
		Product Product1 = new Product("크림치즈 베이글",4300,"뚜레쥬르");
		Product Product2 = new Product("핫크리스피 버거",6800,"롯데리아");
		
		Product.information();
		Product1.information();
		Product2.information();
	
		
		
		
	}

}
