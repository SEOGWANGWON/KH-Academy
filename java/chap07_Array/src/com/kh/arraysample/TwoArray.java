package com.kh.arraysample;

public class TwoArray {

	public static void main(String[] args) {
		// ���� ���ڿ� �迭 ����� �ʱ�ȭ
		String[][] fruits = {
				{"Apple", "Banana", "Cherry"},
				{"Grapes", "Orenge", "Strawberry"},
				// {"Kiwi", "Mango", "pineApple"}
		};
		
		for( int i = 0; i < fruits.length; i++) { // ������ �迭length ������ ��
			for(int a = 0; a < fruits.length; a++) { // �ప�� �����̶� 2��2�������� ���
				System.out.print(fruits[i][a] + " ");
			}
		System.out.println(); // ���������� �̵��� �� �ְ� enter�� ���
		}
		
	}

}
