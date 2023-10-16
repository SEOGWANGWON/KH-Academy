package com.kh.gettersetter.goodExam;

// @Getter @Setter
public class GoodPlayer {
	private String name; // 캐릭터 이름
	private int health; // 체력
	private int attackPower; // 공격력
	
	
	
	// 검증하는 valid 
	public void VaildName() {  // 캐릭터이름에 공백이 없는지 검증!
		if(this.name == "") {
			this.name = "No name";
			// System.out.println("이름을 넣지 않았습니다.");
		}
	}
	
	public String getName() {  // 캐릭터이름을 반환!
		return name;
	}
	public void setName(String name) {  // 이름이 변경되면 저장될 set
		this.name = name;
	}
	public void VaildHealth() {
		if(this.health <= 0) {
			this.health = 0;
			System.out.println("체력이 남지 않았습니다.");
		}
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) { // 매개변수에 저장된 체력 저장
		this.health = health;
	}
	
		
		
	
	public int getAttackPower() {
		return attackPower;
	}
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	public void VaildAttackPower() {  // 무결성 검증
		if(this.attackPower <= 0) {
			this.attackPower = 0;
			System.out.println("파워가 모자랍니다.");
		}
	}
			
	
	// 출력 메소드 작성
	// void 반환하지않음 (retrun 과 함께 있을수 없음)
	public void display() {
		System.out.println("캐릭터 정보 : " + this.name);
		System.out.println("체력 정보 : " + this.health);
		System.out.println("공격력 : " + this.attackPower);
		
	}
	
	
	
	
	
	
	
	
}



