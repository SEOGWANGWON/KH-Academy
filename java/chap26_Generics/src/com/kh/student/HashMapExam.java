package com.kh.student;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {

	public static void main(String[] args) {
		// HashMap ����
		Map<String, Integer> studentGrades = new HashMap<>();
		
		// �л��� ������ �߰��ϰڽ��ϴ�.
		studentGrades.put("KH", 95);
		studentGrades.put("Park", 80);
		studentGrades.put("David", 77);
		studentGrades.put("Bob", 92);
		
		// Ư�� �л��� ���� �˻�
		// containsKey : �ʿ��� key(Ű) value(��) ���� �ִ��� Ȯ��
		String studentName = "Bob";
		// ���࿡ �л��� �߿��� Bob �ִٸ� ������ ������
		if (studentGrades.containsKey(studentName)) {
			
			// String ss = studentGrades.get(studentName);
		
			int grade= studentGrades.get(studentName);
			System.out.println(studentName + "�� ���� : " + grade);
		}else {
			System.out.println(studentName + "{�� ������ ã�� �� �����ϴ�.");
		}
		System.out.println(studentGrades.containsValue(77)); // true false
		
		System.out.println(studentGrades.containsKey("David"));
		
		
		
		/*
		// ��� �л��� ���� ���
		System.out.println("��ü �л� ���� : ");
		
		for(Map.entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
			
		}
		*/
		
		/*
		Map.entry(�������̽��� �Բ� ���Ǵ� �������̽�, null)
		getKey() 	: ��ü�� Ű�� ��ȯ
		getValue()	: ��ü�� ���� ��ȯ
		*/
		//��� �л��� ������ ���
		for(Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
		
		// �л� ���� ����
		String studentUpdate = "Bob";
		int newGrade = 98;
		studentGrades.put(studentUpdate, newGrade);
		System.out.println(studentGrades + "�� ������ " + newGrade + "�� �����߽��ϴ�.");
		System.out.println(studentUpdate + "�� ������ " + newGrade + "�� �����߽��ϴ�.");
		
		
		// �л� ����
		String removeStudent = "David";
		studentGrades.remove(removeStudent);
		
		System.out.println(removeStudent + "�� ������ �����߽��ϴ�.");
	
		// ���� �л� ���� ���
		System.out.println("���� �л� ���� : ");
		for(Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
		
				
	}
	

}
