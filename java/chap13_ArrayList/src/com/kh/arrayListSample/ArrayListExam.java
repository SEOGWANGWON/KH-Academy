package com.kh.arrayListSample;

import java.util.ArrayList;
/*
  toDoSample.java
  ArrayList �̿��ؼ� ���� ����� 3
  �����ϰ� 2
  ����� 1
  ���δ� �����ϱ�
 */
/*
  ����߰� == add
  ��� ���� == set
  ��� ���� Ȯ�� == size
  ��� ���� Ȯ�� == get
  ��� ���� == remove
  ��� ���� == clear 
 */
public class ArrayListExam {

	public static void main(String[] args) {
		// �� ArrayList ����
		ArrayList<String> fruits = new ArrayList();
		
		System.out.println("fruits : " + fruits); // fruits : [] 
		
		
		// ��� �߰�
		fruits.add("aplle");
		System.out.println("��� �߰� : " + fruits);
		fruits.add("banana");
		System.out.println("�ٳ��� �߰� : " + fruits);
		fruits.add("kiwi");
		System.out.println("Ű�� �߰� : " + fruits);
		
		// ��� ���� Ȯ��
		int size = fruits.size();
		System.out.println("���� ����� ũ�� : " + size);
		
	
		String firstFruits = fruits.get(0);
		
		System.out.println("���ϸ���� ù��° ���� : " +firstFruits);
		
		String fruits3 =fruits.get(2); // ���� ����
		System.out.println("���ϸ���� ����° ���� : " + fruits3);
		
		
		// ��� �����Ұž�
		fruits.set(2, "������");
		
		System.out.println("����üũ : " + fruits3);
		System.out.println("����üũ all : " + fruits);
		
		// ��� ����
		fruits.remove(1);
		System.out.println("banana ����Ȯ�� : " + fruits);
		
		// ArrayList ��ȸ�ؼ� ������
		System.out.println("��� ���� ���");
		
	//  for (����� ������ Ÿ�� / (�츮�� ���� ������ ) : (����� ����ִ� ������) {
		for (	String			fruit 		: 		fruits)
		
		
		// ArrayList ����
		fruits.clear();
		System.out.println("��� ������ ������ ��  : " + fruits);
	}

}
