package com.kh.collection.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PracitceCollection {

	public static void main(String[] args) {
		
		PracitceCollection pc = new PracitceCollection();
		
		// pc.practiceList();
		// pc.practiceSet();
		// pc.practiceNumSet();
		pc.practiceMap();
		
		
		
		
		
	}
	public void practiceList() { // 문자열 구조일때 순소가 랜덤¿
		List<String> strList = new ArrayList<>();
		// String add 해보고 for문 출력
		
		strList.add("안녕?");
		strList.add(" 날 더 풀고싶니?");
		strList.add(" 그만 풀고 싶지 않니?");
		strList.add(" 허허 취직해야지~");
		
		System.out.print("리스트가 내게 하는말 : ");
		for(String ok : strList) {
			System.out.print(ok);
		}
	}
	
	public void practiceSet() {
		Set<String> strset = new HashSet<>();
		//String add 해보고 for문 출력 중복된 값 add 해야함
		
		strset.add("뭘봐");
		strset.add("너보지 뭘보겠어");
		strset.add("내가 누군지알아?");
		strset.add("너는 set이잖아");
		strset.add("이말 사실 두번했어");
		strset.add("이말 사실 두번했어");
		
		System.out.print("set과의 대화 :");
		for(String hi : strset) {
			System.out.println(hi);
		}
		
		
	}
	public void practiceNumSet() {
		Set<Integer> numset = new HashSet<>();
		
		numset.add(1);
		numset.add(2);
		numset.add(3);
		numset.add(4);
		numset.add(5);
		numset.add(6);
		numset.add(1);
		
		System.out.println("출력합니다 : ");
		
		for (int hi : numset) {
			System.out.println(hi);
		}
		
	}
	
	public void practiceMap() {
		// 키와 값을 이용해서 map put 한다음 향상된 포문으로 출력해보기
		Map<String, String> foodMap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		foodMap.put("짜장면", a);
		/*
		foodMap.put("해산물물회", 23000);
		foodMap.put("고든램지식 비프웰링턴", 87000);
		foodMap.put("육향가득 안심스테이크 샌드위치", 36000);
		foodMap.put("짭조름한 캐비어와 고소하고 부드러운 푸아그라를 이용한 산미가득 진미", 287000);
		*/
		for(String country : foodMap.keySet()) {
			String price = foodMap.get(country);
			System.out.println(country + " : " + price);
			
		}
		
	}

}
