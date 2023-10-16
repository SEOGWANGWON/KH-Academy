package com.kh.gettersetter;

public class GameRun {

	public static void main(String[] args) {
		// 플레이 생성자 만들기
		PlayerCharacter p1 = new PlayerCharacter();
		
		p1.displayInfo();
		
		p1.setName("김경난 ");
		p1.setHealth(100);
		p1.setAttackPower(20);
		
		p1.displayInfo();
		
		PlayerCharacter p2 = new PlayerCharacter();
		p2.setName("지각한사람 ");
		p2.setHealth(80);
		p2.setAttackPower(10);
		
		p2.displayInfo();
		
		System.out.println("attack!!! 후");
		
		p1.attack(p2);
		
		
		
		
				
	}

}
