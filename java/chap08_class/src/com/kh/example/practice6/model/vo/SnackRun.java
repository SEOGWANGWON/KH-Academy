package com.kh.example.practice6.model.vo;

public class SnackRun extends Snack{

	public static void main(String[] args) {
		
		Snack sk = new Snack("��" ,"����ũ", "��纣��", 1, 15000);
		Snack sk2 = new Snack("��" ,"��������", "���", 1, 43000);
		
		sk.information();
		System.out.println("================");
		sk2.information();
		
	
		
		
	}

}
