package com.kh.objExam;

import java.text.SimpleDateFormat;

import java.util.Date;

public class Practice4 {

	public static void main(String[] args) {
		Practice4 pm = new Practice4();
		//pm.practice1();
		//pm.practice2();
		//pm.practice3();
		//pm.practice4();
		pm.practice5();
	}
	
	public void practice1() {    // �� �� �� yyy-MMM-dd
		Date crtDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MMM-dd");
		
		String forDate = sdf.format(crtDate);
		System.out.println("������ �� �� �� �� : " + forDate);
		
	}
	public void practice2() {   // �� �� �� HH:mm:ss
		Date crtDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		
		String fordate = sdf.format(crtDate);
		System.out.println("������ �� �� �� �� : " + fordate);
		
	}
	public void practice3() {	// �� �� MM-dd
		Date crtDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		
		String fordate = sdf.format(crtDate);
		System.out.println("�� �� : " + fordate);
	
	}
	public void practice4() {	// ����-�ð� yyyy-HH
		Date crtDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-HH");
		
		String fordate = sdf.format(crtDate);
		System.out.println("���� �ð� : " + fordate);
		
	}
	public void practice5() {	// ��¥-���� yyyy-HH
		Date crtDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("y-MM-d (E)");
		
		String fordate = sdf.format(crtDate);
		System.out.println("��¥ ���� : " + fordate);
		
	}
	

}
