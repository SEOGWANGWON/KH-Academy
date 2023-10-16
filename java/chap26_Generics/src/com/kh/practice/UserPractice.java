package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserPractice {

	public static void main(String[] args) {
		// HashMap 생성 UserAge
		//유저의 이름과 나이
		//특정 유저 검색
		// 모든 학생과 성적 출력
		// 유저 나이 수정
		// 탈퇴 유저 제거
		// 최종 유저 출력
		
		Map<Integer, String> isList = new HashMap<>();
		
		isList.put(1004, "천사");
		isList.put(58, "오빠");
		isList.put(1253, "이리오삼");
		
		int seach = 1253;
		
		if(isList.containsKey(seach)) {
			String naming = isList.get(seach);
			System.out.println(seach + "의 뜻은 " + naming + "입니다.");
		}else {
			System.out.println(seach + "의 뜻을 찾을수 없습니다.");
		}
		
		
		
	}

}
