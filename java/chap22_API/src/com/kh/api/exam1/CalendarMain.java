package com.kh.api.exam1;

import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) {
		// Calendar 클랜스를 사용한 현재 날짜와 시간 가져오기
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(calendar.YEAR);
		int month = calendar.get(calendar.MONTH);
		int day = calendar.get(calendar.DAY_OF_MONTH);
		int hour = calendar.get(calendar.HOUR_OF_DAY);
		int minute = calendar.get(calendar.MINUTE);
		int second = calendar.get(calendar.SECOND);
		System.out.println("calendar 클래스를 사용한 현재 날짜와 시간");
		System.out.println(year+"년");
		System.out.println(month+"월");
		System.out.println(day+"일");
		System.out.println(hour+"시");
		System.out.println(minute+"분");
		System.out.println(second+"초");
		
		
	}

}
