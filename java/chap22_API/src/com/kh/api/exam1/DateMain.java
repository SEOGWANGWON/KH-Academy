package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*
 Date : ��¥�� �ð� ������ ��Ÿ���µ� ���
 		java1.1 ���� ������� ����
 		java.time ��Ű�� LocalDate LocalTime LocalDateTime
 */
	
	public static void main(String[] args) {
		// import java.time.LocalDate;     // API
		LocalDate currentDate = LocalDate.now();
		System.out.println("���� ��¥ : " + currentDate);
		LocalDateTime LDTime = LocalDateTime.now();
		System.out.println(LDTime);
		LocalTime LTime = LocalTime.now();
		System.out.println(LTime);
		
		// ��¥ ��� 
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7�� �� ��¥ : " + futureDate);
		// minus plus �̿��ؼ� �� 2���� ������ �� 4��
		
		LocalDate yearday = today.plusYears(1);
		System.out.println(yearday);
		LocalDate yearday2 = today.plusWeeks(2);
		System.out.println(yearday2);
		System.out.println();
		
		LocalDate bygonesday = today.minusYears(10);
		System.out.println(bygonesday);
		LocalDate bygonesday2 = today.minusWeeks(3);
		System.out.println(bygonesday2);
		
		// Ư�� ��¥�� �ð� �����ϱ�
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		LocalDate date2 = LocalDate.of(2024, 2, 14);
		// date1.isBefore(date2)
		if(date1.isBefore(date2)) {
			// ��� �޼ҵ�
			System.out.println(date1 + "�� " + date2 + "�� �����Դϴ�");
			System.out.println("�ڹ����հ��� ������");
		} else if(date1.isAfter(date2)) {
			// ��� �޼ҵ�
			System.out.println(date1 + "�� " + date2 + "�� �̷��Դϴ�");
			System.out.println("�̾�ȣ��~ �ڹ� �����ؾ߰��.. ���� ��Ƴ����� ������..");
		} else {
			// ��� �޼ҵ�
			System.out.println(date1 + "�� " + date2 + "���� ��¥�Դϴ�.");
			System.out.println("�����ض� �ּ���");
		}
		
		
		
		
		
		
		
	}

}
