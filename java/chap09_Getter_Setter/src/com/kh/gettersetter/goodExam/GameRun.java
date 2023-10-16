package com.kh.gettersetter.goodExam;

public class GameRun {

	public static void main(String[] args) {
		GoodPlayer p1 = new GoodPlayer();
		
		p1.display();
		
		p1.setName("김경난 ");
		p1.setHealth(-10);
		p1.VaildHealth();
		p1.setAttackPower(-10);
		p1.VaildAttackPower();
		
		p1.display();
		
		
		
		
		GoodPlayer p2 = new GoodPlayer();
		p2.setName("지각한사람 ");
		p2.setHealth(80);
		p2.setAttackPower(10);
		
		 p2.display();
		
		System.out.println("attack!!! 후");
		
		p2.display();
		
		
		
	}

}
