package com.kh.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 pm = new PracticeMain2();
		
		//pm.practice1();
		//pm.practice2();
		//pm.practice3();
		//pm.practice4();
		//pm.practice5();
		
		
		
	}
	public void practice1() {
		// ���ڿ� �� ���̱� ��� append
		StringBuffer sb = new StringBuffer();
		
		sb.append("���� "); // ������ ������
		sb.append("������ ������ ");
		sb.append("�߰����� �԰���..");
		System.out.println(sb.toString());
		
		
	}
	public void practice2() {  // ������ reverse
		// ���ڿ� ������ reverse
		String str = "���� ������ ������";
		StringBuffer sb = new StringBuffer();
		
		sb.append(str);
		sb.reverse();
		System.out.println(sb.toString());
		
		
		
	}
	public void practice3() { // ���ڿ� ���� insert
		String str = "���� ������ ������";
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		
		sb.insert(10, "?");
		System.out.println(sb.toString()); 
		
	}
	public void practice4() {  // ���ڿ� ��ü replace
		String str = "���� ������ ������";
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		
		sb.replace(3, 6, "��ħ��");
		System.out.println(sb.toString());
		
		
	}
	public void practice5() { // ���ڿ� ���� delete
		String str = "���� ������ ������";
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		
		sb.delete(2, 5);
		System.out.println(sb.toString());
		
		
	}
	

}
