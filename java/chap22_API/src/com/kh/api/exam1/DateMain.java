package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*
 Date : 날짜와 시간 정보를 나타내는데 사용
 		java1.1 이후 권장되지 않음
 		java.time 패키지 LocalDate LocalTime LocalDateTime
 */
	
	public static void main(String[] args) {
		// import java.time.LocalDate;     // API
		LocalDate currentDate = LocalDate.now();
		System.out.println("현재 날짜 : " + currentDate);
		LocalDateTime LDTime = LocalDateTime.now();
		System.out.println(LDTime);
		LocalTime LTime = LocalTime.now();
		System.out.println(LTime);
		
		// 날짜 계산 
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7일 후 날짜 : " + futureDate);
		// minus plus 이용해서 각 2개씩 만들어보기 총 4개
		
		LocalDate yearday = today.plusYears(1);
		System.out.println(yearday);
		LocalDate yearday2 = today.plusWeeks(2);
		System.out.println(yearday2);
		System.out.println();
		
		LocalDate bygonesday = today.minusYears(10);
		System.out.println(bygonesday);
		LocalDate bygonesday2 = today.minusWeeks(3);
		System.out.println(bygonesday2);
		
		// 특정 날짜와 시간 생성하기
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		LocalDate date2 = LocalDate.of(2024, 2, 14);
		// date1.isBefore(date2)
		if(date1.isBefore(date2)) {
			// 출력 메소드
			System.out.println(date1 + "는 " + date2 + "의 과거입니다");
			System.out.println("자바융합과정 진행중");
		} else if(date1.isAfter(date2)) {
			// 출력 메소드
			System.out.println(date1 + "는 " + date2 + "의 미래입니다");
			System.out.println("이얏호우~ 자바 복습해야곗네.. 내가 살아남을수 있을까..");
		} else {
			// 출력 메소드
			System.out.println(date1 + "는 " + date2 + "같은 날짜입니다.");
			System.out.println("삭제해라 애송이");
		}
		
		
		
		
		
		
		
	}

}
