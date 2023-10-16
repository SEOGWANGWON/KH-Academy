package com.kh.genericsPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		// String Integer T 사용하여 출력
		// pm.practice1();
		pm.practice2();
		
		
	}
	
	public void practice1() {
		ArrayList<Integer> intList = new ArrayList<>();
		
		intList.add(3);
		intList.add(6);
		intList.add(9);
		
		ArrayList<String> strList = new ArrayList<>();
		
		strList.add("삼");
		strList.add("육");
		strList.add("구");
		
		grList(intList);
		grList(strList);

	
		
	}
	public static <T> void grList(ArrayList<T> list) {
		for (T game : list) {
			System.out.println(game);
		}
	}
	public void practice2() {
		ArrayList<Integer> intList= new ArrayList<>();
		
		intList.add(5882);
		intList.add(1253);
		intList.add(8253);
		
		girl(intList);
		
		ArrayList<String> strList = new ArrayList<>();
		
		strList.add("개졸려");
		strList.add("너무졸려");
		strList.add("내가지금 하고있는건가");
		
		girl(strList);
	
}
	public static <friends> void girl(ArrayList<friends> list) {
	for (friends fretty : list) {
		System.out.println(fretty);
	}
	}
}
		
		
		