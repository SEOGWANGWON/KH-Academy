package com.kh.class_Array;

public class StudentMain {

	public static void main(String[] args) {
		// Student ��ü�� �����ϴ� �迭 ����
		Student[] student = new Student[3];
		
		// �迭�� Student ��ü�� �߰�
		// [0] �ε��� 0��° �л����� �ε��� [2] �л����� �߰� �����ϱ�
		student[0] = new Student("ȫ�浿",17);
		student[1] = new Student("��浿",47);
		student[2] = new Student("������",57);
		
		// �� ���̸� ���ϰ� ������ length
		// 1 ��° �л��� �̸� student[0].name;
		// 2 ��° �л��� ���� student[0].age;
		
		System.out.println("�� �л� �� : " + student.length);
		System.out.println("ù���� �л��� �̸� : " + student[0].name);
		System.out.println("ù��° �л��� ���� : " + student[0].age);
		
		// �ι�° �л��� �̸��� ���� ���
		System.out.println("�ι�° �л��� �̸��� ���� : " + student[1].name + student[1].age);
		// ������ �л��� �̸��� ���� ���
		System.out.println("����° �л��� �̸��� ���� : " + student[2].name + student[2].age);
		// for���� �̿��ؼ� 1��° �л�~3��° �л����� ����ϱ�
		for(int i = 0; i<student.length ; i++) {
			System.out.println("�л��� �̸� : " +student[i].name);
			System.out.println("�л��� ���� : " + student[i].age);
		}
		
	}

}
