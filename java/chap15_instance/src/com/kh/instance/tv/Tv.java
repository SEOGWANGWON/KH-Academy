package com.kh.instance.tv;
		   //��ü
public class Tv {
	// Tv ����
	// Tv �Ӽ�
	String color;  // ����      
	boolean power; // ���� ����
	int channel; // ä��
	// TV ���(�޼���)
	
	public void power() {
		power = !power; // ��������
	}
	public void channelUp() {
		++channel;
	}

	public void channelDown() {
		--channel;
	}
}
