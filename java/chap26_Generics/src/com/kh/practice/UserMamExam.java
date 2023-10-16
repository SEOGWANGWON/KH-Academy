package com.kh.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UserMamExam {
	
	public static void main(String[] args) {
		// HashMap 생성 UserAge
		Map<String, Integer> UserAge = new HashMap<>();
		
		//유저의 이름과 나이
		UserAge.put("고병찬", 24);
		UserAge.put("나세희", 25);
		UserAge.put("김민수", 28);
		UserAge.put("김승범", 32);
		
		//특정 유저 검색
		String UserName = "나세희";
		
		if(UserAge.containsKey(UserName)) {
			int age = UserAge.get(UserName);
			System.out.println(UserName + "의 나이 " + age);
		}else {
			System.out.println(UserName + "의 나이를 찾을수 없습니다.");
		}
		
		// 모든 학생과 성적 출력
		
		System.out.println("모든 유저 나이 : ");
		
		for(Map.Entry<String, Integer> entry : UserAge.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + " : " + age);
		}
		
		// 유저 나이 수정
		String UserUpdate = "김승범";
		int newAge = 17;
		UserAge.put(UserUpdate, newAge);
		System.out.println(UserAge + "에 있던 나이를 " + newAge + "로 수정했습니다.");
		System.out.println(UserUpdate + "의 나이를 " + newAge + "로 수정햇습니다.");
		
		// 탈퇴 유저 제거
		String removeUser = "김민수";
		UserAge.remove(removeUser);
		
		System.out.println(removeUser + "의 나이를 삭제했습니다.");
		
		// 최종 유저 출력
		
		System.out.println("최종 유저 나이 : ");
		
		for(Map.Entry<String, Integer> entry : UserAge.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + " : " + age);
		
	}
	}
}


