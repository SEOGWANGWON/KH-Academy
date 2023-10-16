package com.kh.gettersetter;

public class PlayerCharacter {
	private String name; // 캐릭터 이름
	private int health; // 체력
	private int attackPower; // 공격력
	
	/*
	  getter
	  		데이터 복사본을 던져주기 때문에 운래 객체의 데이터는 손상시키지 않음
	  		원본데이터는 안전함
	  		
	 */
	
	
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getAttackPower() {
		return attackPower;
	}
	
	/*
	 setter
	 		외부에서 메소드를 통해 데이터에 접근을 하게 된다면
	 		메소드는 매개값(매개변수값)을 검증해서 유효한 값만 데이터로 저장할 수 있음
	 */
	
	public void setName(String name) {
		this.name = name;
	}
	public void setHealth(int health) {
		// 만약에 체력이 0이라면 죽이고 체력이 1이상 이면 살리자
		if(health >= 1) { // 체력이 0 이상일 경우
			this.health = health;
		} else { // 체력이 0 이하라면 체력을 표시할 가치도 없다.
			System.out.println("체력이 없습니다..");
		}
			
			
	}
	// 0 미만의 값을 넣어도 0이하의 값이 출력되지 않음
	public void setAttackPower(int attackPower) {
		// 만약에 파워가 0보다 클경우 
		if(attackPower >= 1) {
			this.attackPower = attackPower;	
		}else {
			this.attackPower = 0;
			System.out.println("power가 부적절합니다.");
		}
		
	}
	
	
	
	public void displayInfo() {
		System.out.println("캐릭터 정보 : " + name);
		System.out.println("체력 정보 : " + health);
		System.out.println("공격력 : " + attackPower);
	}
	
	// 캐릭터 공격하는 메서드
	public void attack(PlayerCharacter target) {
		System.out.println("[" + name + "]" + "공격 했습니다." + target.getName() + "for " + attackPower + " 데미지를 입었습니다!");
		

	}
	
	// 다른 캐릭터로부터 공격 받았을 때 메서드
	public void takeDamage(int damage) {
		System.out.println("공격 받았습니다." + damage);
	}
	
	
	
	
	
}
