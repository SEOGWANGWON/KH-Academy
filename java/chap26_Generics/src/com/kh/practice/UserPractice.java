package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserPractice {

	public static void main(String[] args) {
		// HashMap ���� UserAge
		//������ �̸��� ����
		//Ư�� ���� �˻�
		// ��� �л��� ���� ���
		// ���� ���� ����
		// Ż�� ���� ����
		// ���� ���� ���
		
		Map<Integer, String> isList = new HashMap<>();
		
		isList.put(1004, "õ��");
		isList.put(58, "����");
		isList.put(1253, "�̸�����");
		
		int seach = 1253;
		
		if(isList.containsKey(seach)) {
			String naming = isList.get(seach);
			System.out.println(seach + "�� ���� " + naming + "�Դϴ�.");
		}else {
			System.out.println(seach + "�� ���� ã���� �����ϴ�.");
		}
		
		
		
	}

}
