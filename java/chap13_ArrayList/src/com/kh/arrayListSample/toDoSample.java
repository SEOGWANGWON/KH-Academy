package com.kh.arrayListSample;
import java.util.ArrayList;


public class toDoSample {

	public static void main(String[] args) {
		/*
		  toDoSample.java
		  ArrayList �̿��ؼ� ���� ����� 3
		  �����ϰ� 2
		  ����� 1
		  ���δ� �����ϱ�
		 */
		/*
		ArrayList<String> name = new ArrayList();
		
		name.add("��泭");
		name.add("����");
		name.add("������");
		
		
		System.out.println(name);
		
		name.set(0, "���ؽ�");
		name.set(2, "�����");
		
		System.out.println(name);
		
		name.remove(1);
		
		System.out.println(name);
		
		name.clear();
		
		System.out.println(name);
		*/
		
		
		ArrayList<String> today = new ArrayList();
		
		today.add("��");
		today.add("�");
		today.add("��");
		today.add("�ڵ�");
		today.add("����");
		
		
		System.out.println(today);
		
		today.set(0, "������");
		today.set(2, "��Ʈ��Ī");
		
		System.out.println(today);
		
		today.remove(1);
		
		System.out.println(today);
		
		today.clear();
		
		System.out.println(today);
		for(String job : today) {
			System.out.println(job);
		}
		
		System.out.println();
		
		
	}

}
