package com.kh.example.practice2.model.vo;

public class ProductRun {
	
	public static void main(String[] agrs) {
		// Product ���� 3�� �ϰ�
		// ���� ��ǰ�� ���� �귣��� ����ϱ�
		
		Product Product = new Product("�ѽĺ���",6000,"����â��");
		Product Product1 = new Product("ũ��ġ�� ���̱�",4300,"�ѷ��긣");
		Product Product2 = new Product("��ũ������ ����",6800,"�Ե�����");
		
		Product.information();
		Product1.information();
		Product2.information();
	
		
		
		
	}

}
