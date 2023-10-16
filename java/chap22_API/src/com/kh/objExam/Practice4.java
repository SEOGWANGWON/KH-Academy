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
	
	public void practice1() {    // 년 월 일 yyy-MMM-dd
		Date crtDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MMM-dd");
		
		String forDate = sdf.format(crtDate);
		System.out.println("포멧팅 된 년 월 일 : " + forDate);
		
	}
	public void practice2() {   // 시 분 초 HH:mm:ss
		Date crtDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		
		String fordate = sdf.format(crtDate);
		System.out.println("포멧팅 된 시 분 초 : " + fordate);
		
	}
	public void practice3() {	// 월 일 MM-dd
		Date crtDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		
		String fordate = sdf.format(crtDate);
		System.out.println("월 일 : " + fordate);
	
	}
	public void practice4() {	// 연도-시간 yyyy-HH
		Date crtDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-HH");
		
		String fordate = sdf.format(crtDate);
		System.out.println("연도 시간 : " + fordate);
		
	}
	public void practice5() {	// 날짜-요일 yyyy-HH
		Date crtDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("y-MM-d (E)");
		
		String fordate = sdf.format(crtDate);
		System.out.println("날짜 요일 : " + fordate);
		
	}
	

}
