package com.kh.Arraypractice.func;

public class Practice10 {

	public static void main(String[] args) {
		/*
		�ֹε�Ϲ�ȣ �����ڸ� ���ĺ��� *�� ������ ����ϼ���.
		��, ���� �迭 ���� ���� ���� �迭 ���纻���� �����ϼ���.
		ex.
		�ֹε�Ϲ�ȣ(-����) : 123456-1234567
		123456-1******

		 */
		
		// 1. �ֹι�ȣ �����
		String jumin = "123456-1234567";
				
				
		// 2. �����ڸ� ���� ��ǥ ����°� �����
		String makestar = "*";
		
		// �ֹε�Ϲ�ȣ �����ڸ� ���ĺ��� *�� ������ ���
		// to char Array�� ����ؼ� String -> char Array �� ����
		char[] juminStar = jumin.toCharArray();
		//length juminStar �༮�� �����ڸ�
		// {'1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1',}
		for(int a = 8; a < juminStar.length; a++) { //�ֹι�ȣ 9�ߺ���� ���ڸ����� *ǥ ó�� �ع�����
			juminStar[a] = '*';
			// juminStar �̳༮�� 9�ڸ��� �����ϸ� �긦 *�� �ٲ�
		}
		System.out.println(juminStar);
		
		

	}

}
