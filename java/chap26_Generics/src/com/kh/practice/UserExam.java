package com.kh.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UserExam {

	public static void main(String[] args) {
		// Map<String, Integer>
		// 		�̸�		����
		// contains
		
		Map<String, Integer> userAges = new HashMap<>();
		
		userAges.put("����", 17);
		userAges.put("������", 20);
		userAges.put("��¹�", 22);
		userAges.put("��μ�", 7);
		
		String userName = "��μ�";
		
		if(userAges.containsKey(userName)) {
			int age = userAges.get(userName);
			System.out.println(userName + "�� ���� " + age);
		} else {
			System.out.println(userName + "�� ���̸� ã���� �����ϴ�.");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
