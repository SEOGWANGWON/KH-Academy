package com.kh.instance.cafe;
// �⺻ �Ƹ޸�ī��
public class Cafe {
	private String type; // ���� ����
	private int size; // �Ƹ޸�ī�� ������
	private boolean hasSugar; // ��������
	
	public Cafe(String type, int size, boolean hasSugar) {
		this.type = type;
		this.size = size;
		this.hasSugar = hasSugar;
	}
	
	public void makeCoffee() {
		System.out.println("�Ƹ޸�ī�븦 ����ϴ�.");
		System.out.println("ũ�� : " + size);
		// ���࿡ ������ �ִ´ٸ�
		if(hasSugar) {
			System.out.println("������ �߰��մϴ�.");	
		}
		}
		
	public void makeRadde() {
		System.out.println("�󶼸� ����ϴ�.");
		System.out.println("ũ�� :  " + size);
		if(hasSugar) {
			System.out.println("������ �߰��մϴ�.");
		}
		
	}
	public void makeMilktea() {
		System.out.println("��ũƼ�� ����ϴ�.");
		System.out.println("ũ�� : " + size);
		if(hasSugar) {
			System.out.println("������ �߰��մϴ�.");
			
		}
	}
		
	}




