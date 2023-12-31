package com.kh.class_Array;

public class StudentMain {

	public static void main(String[] args) {
		// Student 객체를 저장하는 배열 생성
		Student[] student = new Student[3];
		
		// 배열에 Student 객체를 추가
		// [0] 인덱스 0번째 학생부터 인덱스 [2] 학생까지 추가 저장하기
		student[0] = new Student("홍길동",17);
		student[1] = new Student("고길동",47);
		student[2] = new Student("엄복동",57);
		
		// 총 길이를 구하고 싶으면 length
		// 1 번째 학생의 이름 student[0].name;
		// 2 번째 학생의 나이 student[0].age;
		
		System.out.println("총 학생 수 : " + student.length);
		System.out.println("첫번쨰 학생의 이름 : " + student[0].name);
		System.out.println("첫번째 학생의 나이 : " + student[0].age);
		
		// 두번째 학생의 이름과 나이 출력
		System.out.println("두번째 학생의 이름과 나이 : " + student[1].name + student[1].age);
		// 세번쨰 학생의 이름과 나이 출력
		System.out.println("세번째 학생의 이름과 나이 : " + student[2].name + student[2].age);
		// for문을 이용해서 1번째 학생~3번째 학생까지 출력하기
		for(int i = 0; i<student.length ; i++) {
			System.out.println("학생의 이름 : " +student[i].name);
			System.out.println("학생의 나이 : " + student[i].age);
		}
		
	}

}
