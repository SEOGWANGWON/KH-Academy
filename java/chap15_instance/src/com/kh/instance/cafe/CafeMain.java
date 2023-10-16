package com.kh.instance.cafe;

public class CafeMain {

	public static void main(String[] args) {
		Cafe client1 = new Cafe("라떼",3, true);
		Cafe client2 = new Cafe("아메리카노",1, false);
		Cafe client3 = new Cafe("밀크티",5, true);
									  // 사이즈 , 설탕여부
		client1.makeRadde();
		client2.makeCoffee();
		client3.makeMilktea();
		// Americano 인스턴스 3개 만들고 출력하기
		
	}

}
