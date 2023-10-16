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
		System.out.println("���� : " + kind);
		System.out.println("�̸� : " + name);
		System.out.println("�� : " + flavor);
		System.out.println("���� : " + numOF);
		System.out.println("���� : " + price);
		
	}
	public void menu() {
		System.out.println("�޴��� ����ּ���.");
		Scanner sc = new Scanner(System.in);
		
	}
	
	
}

