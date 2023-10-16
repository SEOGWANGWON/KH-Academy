package com.kh.arraysample;
import java.util.Scanner;
public class Array03 {

	public static void main(String[] args) {
		/*
		 * 안녕하세요 -> 안녕하세
		 1. 문자열을 입력 받아 
		 2. 문자 하나하나 배열에 넣고
		 3. 문자열에 몇 개 들어가 있는지 개수와
		 4. 검색할 문자 scanner
		 5. 몇 번째 인덱스에 위치하는지
		 6. 인덱스 출력하기
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");//1. 문자열을 입력 받아
		String inputString = sc.next();
		
		//2. 문자 하나 하나 배열에 넣는다.
		//String 안에 있는 문자들을 배열로 담는다. 
		//char 값이라는 문자를 만들어서 만든 문자들을 배열에 넣는다.
		//String 안에 char배열로 만들어주는 녀석 => toCharArray
		// ex) String 안녕하세요 = {'안','녕','하','세','요'}
		char[] charArray = inputString.toCharArray();
		//inputString 에 적은 문자가 들어감
		
		//3. 문자열에 몇 개 들어가 있는지 개수체크
		int arrLength = charArray.length;
		System.out.println("문자열 개수 체크 : "+arrLength);
		
		//3-1 검색할 문자 scanner를 사용해서 문자검색하기
		System.out.println("한글자만 입력하세요.");
		char searchChar = sc.next().charAt(0);
		System.out.println("첫 글자 : " + searchChar);
		
		//4. 문자열에 어떤 값이 들어있는지 확인
		//System.out.println("charArray[0] : " + charArray[0]);
		for(int i = 0; i < arrLength; i++) {
			//나는 안이라는 글자가 몇 번째에 들어있는지 너무 궁금해
			//만약에 배열에 들어있는 글자와 검색한 글자가 똑같이 생겼다면!
			if(charArray[i] == searchChar) {
				System.out.println("charArray [ " + i + " ]");
			} else if (charArray[i] != searchChar ) {
				System.out.println("없는 치킨 입");
			}

		}
	}

}
