package com.kh.instance.cafe;

public class CafeMain {

	public static void main(String[] args) {
		Cafe client1 = new Cafe("��",3, true);
		Cafe client2 = new Cafe("�Ƹ޸�ī��",1, false);
		Cafe client3 = new Cafe("��ũƼ",5, true);
									  // ������ , ��������
		client1.makeRadde();
		client2.makeCoffee();
		client3.makeMilktea();
		// Americano �ν��Ͻ� 3�� ����� ����ϱ�
		
	}

}
