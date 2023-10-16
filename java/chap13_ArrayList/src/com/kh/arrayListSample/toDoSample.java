package com.kh.arrayListSample;
import java.util.ArrayList;


public class toDoSample {

	public static void main(String[] args) {
		/*
		  toDoSample.java
		  ArrayList 이용해서 할일 만들고 3
		  수정하고 2
		  지우고 1
		  전부다 삭제하기
		 */
		/*
		ArrayList<String> name = new ArrayList();
		
		name.add("김경난");
		name.add("고병찬");
		name.add("나세희");
		
		
		System.out.println(name);
		
		name.set(0, "엄준식");
		name.set(2, "손흥민");
		
		System.out.println(name);
		
		name.remove(1);
		
		System.out.println(name);
		
		name.clear();
		
		System.out.println(name);
		*/
		
		
		ArrayList<String> today = new ArrayList();
		
		today.add("밥");
		today.add("운동");
		today.add("잠");
		today.add("코딩");
		today.add("숙제");
		
		
		System.out.println(today);
		
		today.set(0, "샐러드");
		today.set(2, "스트레칭");
		
		System.out.println(today);
		
		today.remove(1);
		
		System.out.println(today);
		
		today.clear();
		
		System.out.println(today);
		for(String job : today) {
			System.out.println(job);
		}
		
		System.out.println();
		
		
	}

}
