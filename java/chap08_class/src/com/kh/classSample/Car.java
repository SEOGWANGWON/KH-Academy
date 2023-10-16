package com.kh.classSample;

public class Car {
	// 1. ���� ��Ʈ �������
	String brand;		// �귣��
	String model;		// ��
	int speed;			// �ӵ�
	boolean engineOn;	// ���� ����
/* =============================================================================
   ������� �ؿ��� ��� �޼���� 
  
 */
	
	// 2. �����ڴ� �޼����� �Ѱ��� ����
	// ���� �� �� �ʼ��� ���� �Ķ���ʹ� �귣��� �� 
	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
		this.speed = 0;
		this.engineOn = true;
		
	}
	
	// ���� ���� �޼���
	public void startEngine() { 
		// ���࿡ ������ true ���� �õ�
		if(engineOn) {
			System.out.println("������ �õ��մϴ�."); // ��� �޼ҵ� �ۼ�
		} else { // ������ false �̹� ������ �����ִ�.
			System.out.println("�̹� ������ ���� �ֽ��ϴ�.");
		}
		
			
		
	}
		// ���� �޼���
		public void acclerate(int amount) {
			if (engineOn) { // ������ true�� ���� �ӵ��� �󸶴�.
				System.out.println("�ӵ� ���Դϴ�.");
			} else { // ������ false�� ������ ���� �־� �ӵ��� �� �� ����.
				System.out.println("�ӵ��� �� �� ����.");
			}
			
		}
		
}

