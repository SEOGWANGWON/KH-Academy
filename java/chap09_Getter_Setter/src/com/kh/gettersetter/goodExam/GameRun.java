package com.kh.gettersetter.goodExam;

public class GameRun {

	public static void main(String[] args) {
		GoodPlayer p1 = new GoodPlayer();
		
		p1.display();
		
		p1.setName("��泭 ");
		p1.setHealth(-10);
		p1.VaildHealth();
		p1.setAttackPower(-10);
		p1.VaildAttackPower();
		
		p1.display();
		
		
		
		
		GoodPlayer p2 = new GoodPlayer();
		p2.setName("�����ѻ�� ");
		p2.setHealth(80);
		p2.setAttackPower(10);
		
		 p2.display();
		
		System.out.println("attack!!! ��");
		
		p2.display();
		
		
		
	}

}
