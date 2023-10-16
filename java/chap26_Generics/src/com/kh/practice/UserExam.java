package com.kh.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UserExam {

	public static void main(String[] args) {
		// Map<String, Integer>
		// 		이름		나이
		// contains
		
		Map<String, Integer> userAges = new HashMap<>();
		
		userAges.put("고병찬", 17);
		userAges.put("나세희", 20);
		userAges.put("김승범", 22);
		userAges.put("김민수", 7);
		
		String userName = "김민수";
		
		if(userAges.containsKey(userName)) {
			int age = userAges.get(userName);
			System.out.println(userName + "의 나이 " + age);
		} else {
			System.out.println(userName + "의 나이를 찾을수 없습니다.");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
