package com.kh.gettersetter;

public class GameRun {

	public static void main(String[] args) {
		// �÷��� ������ �����
		PlayerCharacter p1 = new PlayerCharacter();
		
		p1.displayInfo();
		
		p1.setName("��泭 ");
		p1.setHealth(100);
		p1.setAttackPower(20);
		
		p1.displayInfo();
		
		PlayerCharacter p2 = new PlayerCharacter();
		p2.setName("�����ѻ�� ");
		p2.setHealth(80);
		p2.setAttackPower(10);
		
		p2.displayInfo();
		
		System.out.println("attack!!! ��");
		
		p1.attack(p2);
		
		
		
		
				
	}

}
