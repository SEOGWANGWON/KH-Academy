package com.kh.iteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		ArrayList<Integer> anum = new ArrayList<>();
		
		//ArrayList 생성 및 요소 추가
		//Iterator 생성
		//Iterator를 사용하여 요소 반복
		
		anum.add(123);
		anum.add(456);
		anum.add(789);
		anum.add(1004);
		
		Iterator<Integer> itr = anum.iterator(); 
		// Iterator는 인터페이스 new필요없음 객체 x
		
		while(itr.hasNext()) {
			int num = itr.next();
			System.out.println(num);
		}
		
		itr = anum.iterator();
		
		// 요소 삭제 후 출력
		
		System.out.println("요소 삭제 후 출력");
		while (itr.hasNext()) {
			int num = itr.next();
			
		}
	
	
	}

}
