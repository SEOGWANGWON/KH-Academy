package com.kh.iteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		ArrayList<Integer> anum = new ArrayList<>();
		
		//ArrayList ���� �� ��� �߰�
		//Iterator ����
		//Iterator�� ����Ͽ� ��� �ݺ�
		
		anum.add(123);
		anum.add(456);
		anum.add(789);
		anum.add(1004);
		
		Iterator<Integer> itr = anum.iterator(); 
		// Iterator�� �������̽� new�ʿ���� ��ü x
		
		while(itr.hasNext()) {
			int num = itr.next();
			System.out.println(num);
		}
		
		itr = anum.iterator();
		
		// ��� ���� �� ���
		
		System.out.println("��� ���� �� ���");
		while (itr.hasNext()) {
			int num = itr.next();
			
		}
	
	
	}

}
