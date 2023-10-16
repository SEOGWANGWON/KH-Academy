package com.kh.example.practice6.model.vo;

public class SnackRun extends Snack{

	public static void main(String[] args) {
		
		Snack sk = new Snack("빵" ,"케이크", "블루베리", 1, 15000);
		Snack sk2 = new Snack("빵" ,"애플파이", "사과", 1, 43000);
		
		sk.information();
		System.out.println("================");
		sk2.information();
		
	
		
		
	}

}
