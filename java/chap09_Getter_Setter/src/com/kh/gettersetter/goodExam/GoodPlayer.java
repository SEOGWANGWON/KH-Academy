package com.kh.gettersetter.goodExam;

// @Getter @Setter
public class GoodPlayer {
	private String name; // ĳ���� �̸�
	private int health; // ü��
	private int attackPower; // ���ݷ�
	
	
	
	// �����ϴ� valid 
	public void VaildName() {  // ĳ�����̸��� ������ ������ ����!
		if(this.name == "") {
			this.name = "No name";
			// System.out.println("�̸��� ���� �ʾҽ��ϴ�.");
		}
	}
	
	public String getName() {  // ĳ�����̸��� ��ȯ!
		return name;
	}
	public void setName(String name) {  // �̸��� ����Ǹ� ����� set
		this.name = name;
	}
	public void VaildHealth() {
		if(this.health <= 0) {
			this.health = 0;
			System.out.println("ü���� ���� �ʾҽ��ϴ�.");
		}
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) { // �Ű������� ����� ü�� ����
		this.health = health;
	}
	
		
		
	
	public int getAttackPower() {
		return attackPower;
	}
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	public void VaildAttackPower() {  // ���Ἲ ����
		if(this.attackPower <= 0) {
			this.attackPower = 0;
			System.out.println("�Ŀ��� ���ڶ��ϴ�.");
		}
	}
			
	
	// ��� �޼ҵ� �ۼ�
	// void ��ȯ�������� (retrun �� �Բ� ������ ����)
	public void display() {
		System.out.println("ĳ���� ���� : " + this.name);
		System.out.println("ü�� ���� : " + this.health);
		System.out.println("���ݷ� : " + this.attackPower);
		
	}
	
	
	
	
	
	
	
	
}



