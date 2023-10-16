package com.kh.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UserMamExam {
	
	public static void main(String[] args) {
		// HashMap ���� UserAge
		Map<String, Integer> UserAge = new HashMap<>();
		
		//������ �̸��� ����
		UserAge.put("����", 24);
		UserAge.put("������", 25);
		UserAge.put("��μ�", 28);
		UserAge.put("��¹�", 32);
		
		//Ư�� ���� �˻�
		String UserName = "������";
		
		if(UserAge.containsKey(UserName)) {
			int age = UserAge.get(UserName);
			System.out.println(UserName + "�� ���� " + age);
		}else {
			System.out.println(UserName + "�� ���̸� ã���� �����ϴ�.");
		}
		
		// ��� �л��� ���� ���
		
		System.out.println("��� ���� ���� : ");
		
		for(Map.Entry<String, Integer> entry : UserAge.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + " : " + age);
		}
		
		// ���� ���� ����
		String UserUpdate = "��¹�";
		int newAge = 17;
		UserAge.put(UserUpdate, newAge);
		System.out.println(UserAge + "�� �ִ� ���̸� " + newAge + "�� �����߽��ϴ�.");
		System.out.println(UserUpdate + "�� ���̸� " + newAge + "�� �����޽��ϴ�.");
		
		// Ż�� ���� ����
		String removeUser = "��μ�";
		UserAge.remove(removeUser);
		
		System.out.println(removeUser + "�� ���̸� �����߽��ϴ�.");
		
		// ���� ���� ���
		
		System.out.println("���� ���� ���� : ");
		
		for(Map.Entry<String, Integer> entry : UserAge.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + " : " + age);
		
	}
	}
}


