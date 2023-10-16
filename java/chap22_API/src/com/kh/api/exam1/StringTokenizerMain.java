package com.kh.api.exam1;

import java.util.StringTokenizer;

public class StringTokenizerMain {
	/*
	 StringTokenizer 클래스 : 문자열을 분리하는데 사용이다옹
	 						 주어진 구분(기본:공백)를 기본으로 문자열을 토큰으로 분리
	 */
	

	public static void main(String[] args) {
		String text = "apple orange banana";
		StringTokenizer tokenizer= new StringTokenizer(text);
		
		// hasMoreTokens
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
		
		
	}

}
