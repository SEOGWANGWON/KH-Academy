package com.kh.example.practice6.model.vo;

import java.util.Scanner;

public class Snack {
	private String kind;
	private String name;
	private String flavor;
	private int numOF;
	private int price;

	
	public Snack() {
		
	}
	public Snack(String kind, String name, String flavor, int numOF, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOF = numOF;
		this.price = price;
	}
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getNumOF() {
		return numOF;
	}
	public void setNumOF(int numOF) {
		this.numOF = numOF;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void information() {
		System.out.println("종류 : " + kind);
		System.out.println("이름 : " + name);
		System.out.println("맛 : " + flavor);
		System.out.println("개수 : " + numOF);
		System.out.println("가격 : " + price);
		
	}
	public void menu() {
		System.out.println("메뉴를 골라주세요.");
		Scanner sc = new Scanner(System.in);
		
	}
	
	
}

