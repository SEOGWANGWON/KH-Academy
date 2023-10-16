package com.kh.objExam;

import java.util.Scanner;
import java.util.StringTokenizer;  // 아주 유용한 친구

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		// pm.stExam2();
		// pm.stExam3();
		// pm.practice1();
		// pm.stExam5();
		// pm.stExam6();
		pm.stringtoMath();
		
	}
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		Object obj = new Object();
		Object obj2 = new Object();
		
		System.out.println("원하는 첫번째 숫자를 입력하세요.");
		obj = sc.nextInt();
		System.out.println("원하는 두번째 숫자를 입력하세요.");
		obj2 = sc.nextInt();
		
		boolean isEqual = obj.equals(obj2);
		System.out.println(obj + "와 " + obj2 + "는 같은가? " + isEqual);
		
		
	}
	public void STExam() {
		
	}
	public void stExam2() {
		String text = "apple,banana,grape,orange";
		StringTokenizer tokenizer = new StringTokenizer(text,",");
		
		while(tokenizer.hasMoreTokens()) {
			String fruit = tokenizer.nextToken();
			System.out.println(fruit);
		}
	}
	public void stExam3() {  // 유용한 친구
		// - 구분자를 사용해서 text 만들고 - 구분자로 끊어서 출력하기
		String text = "apple-banana-grape-orange";
		StringTokenizer tokenizer = new StringTokenizer(text,"-");
		
		while(tokenizer.hasMoreTokens()) {
			String fruit = tokenizer.nextToken();
			System.out.println(fruit);
		}
		
		
	}
	public void stExam4() {
		String text2 = "mother_father_grandmother_grandfather";
		StringTokenizer tkizer = new StringTokenizer(text2,"_");
		
		while(tkizer.hasMoreTokens()) {
			String family = tkizer.nextToken();
			System.out.println(family);
		}
		
	}
	public void stExam5() {
		// 특정 단어 제외하고 구분자로 분리
		String text = "This is a text. but not a real one.";
		StringTokenizer tokenizer = new StringTokenizer(text," .");
		
		while(tokenizer.hasMoreTokens()) {
			String word = tokenizer.nextToken();
			if(!word.equals("text")) {  // 특정 단어 제거
				System.out.println(word);
			}
		}
	}
	public void stExam6() {
		// 날짜 구분자로 분리
		String date = "2023-09-13";
		StringTokenizer tokenizer = new StringTokenizer(date,"-");
		int year = Integer.parseInt(tokenizer.nextToken());
		int month = Integer.parseInt(tokenizer.nextToken());
		int day = Integer.parseInt(tokenizer.nextToken());
		System.out.println("Year : " + year +"년 ");
		System.out.println("Month : " + month + "월 ");
		System.out.println("Day : " + day+"일 ");
	}
	public void stringtoMath() {
		String text = "The price is $.15.99";
		StringTokenizer tokenizer = new StringTokenizer(text, " $.");
		
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if(token.matches("\\d+(\\.\\d+)?")) {
				
				System.out.println("Number : " + token);
			}
			
		}
		
	}
		
		
}


