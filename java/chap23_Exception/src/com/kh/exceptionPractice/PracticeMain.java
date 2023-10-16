package com.kh.exceptionPractice;

public class PracticeMain {

	public static void main(String[] args) {
		
		PracticeMain pm = new PracticeMain();
		
		//pm.ArithException();
		//pm.NPException();
		//pm.NFException();
		pm.ExceptionExam();
		
	}
	public void ArithException() {
		// int dividend / divisor 나누었을 때 예외처리
		int dividend = 100;
		int divisor = 0;
		
		try {
			int result = dividend / divisor;
			System.out.println(result);
		}catch(ArithmeticException a) {
			System.out.println("나눌 수 없는 숫자입니다.");
			System.out.println("아 되겠냐고~" + a.getMessage());
		}
	}
	
	public void NPException() {   // NullPoint
		String text = "Hello World";
		String subText = null;
		
		try {
			// indexOf subText 에 있는 null 값을 포함한 문자열 검색
			int length = text.indexOf(subText);
			System.out.println("문자열 길이 " + length);
		} catch(NullPointerException np) {
			System.out.println("입력 오류! : " + np.getMessage());
			
		}
		
		
	}
	
	public void NFException() {   // NumFormat
		try {
		String text = "123.45";
		int number = Integer.parseInt(text);
		System.out.println(number);
		} catch(NumberFormatException nf) {
			System.out.println("입력 오류! : " + nf.getMessage());
			
		}
		
		
	}
	
	public void ExceptionExam() {
		
		try {
		int[] numbers = {1,2,3,4,5};
		int index = 7; // 인덱스 넘버
		int result = numbers[index]; // 배열 요소에 접근
		System.out.println("Result : " + result);
		} catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("배열 인덱스 범위를 벗어나 예외가 발생!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(a.getMessage());
		} catch(Exception a) {
			// 다른 예외를 처리할 수 있는 예외 처리
			System.out.println("배열 인덱스 범위를 벗어난 예외가 아닌 일반적인 다른 예외 발생!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		} finally {
			// 항상 실행되는 블록
			System.out.println("Finally 등장!");
		}
		System.out.println("프로그램이 종료 되었습니다.");
		
		
		}
}


