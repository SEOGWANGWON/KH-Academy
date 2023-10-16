package com.kh.Arraypractice.func;

public class Practice10 {

	public static void main(String[] args) {
		/*
		주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
		단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
		ex.
		주민등록번호(-포함) : 123456-1234567
		123456-1******

		 */
		
		// 1. 주민번호 만들기
		String jumin = "123456-1234567";
				
				
		// 2. 성별자리 이후 별표 만드는거 만들기
		String makestar = "*";
		
		// 주민등록번호 성별자리 이후부터 *로 가리고 출력
		// to char Array를 사용해서 String -> char Array 로 변경
		char[] juminStar = jumin.toCharArray();
		//length juminStar 녀석의 최종자리
		// {'1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1',}
		for(int a = 8; a < juminStar.length; a++) { //주민번호 9잘비ㅜ터 끝자리까지 *표 처리 해버리기
			juminStar[a] = '*';
			// juminStar 이녀석이 9자리로 시작하면 얘를 *로 바꿔
		}
		System.out.println(juminStar);
		
		

	}

}
