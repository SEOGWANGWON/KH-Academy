package com.kh.instance.cafe;
// 기본 아메리카노
public class Cafe {
	private String type; // 음료 종류
	private int size; // 아메리카노 사이즈
	private boolean hasSugar; // 설탕여부
	
	public Cafe(String type, int size, boolean hasSugar) {
		this.type = type;
		this.size = size;
		this.hasSugar = hasSugar;
	}
	
	public void makeCoffee() {
		System.out.println("아메리카노를 만듭니다.");
		System.out.println("크기 : " + size);
		// 만약에 설탕을 넣는다면
		if(hasSugar) {
			System.out.println("설탕을 추가합니다.");	
		}
		}
		
	public void makeRadde() {
		System.out.println("라떼를 만듭니다.");
		System.out.println("크기 :  " + size);
		if(hasSugar) {
			System.out.println("설탕을 추가합니다.");
		}
		
	}
	public void makeMilktea() {
		System.out.println("밀크티를 만듭니다.");
		System.out.println("크기 : " + size);
		if(hasSugar) {
			System.out.println("설탕을 추가합니다.");
			
		}
	}
		
	}




