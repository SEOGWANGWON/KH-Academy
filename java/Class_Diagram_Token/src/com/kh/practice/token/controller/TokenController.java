package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
		
	}
	public String afterToken(String str) {
		StringTokenizer tkizer = new StringTokenizer(str);
		
		while(tkizer.hasMoreTokens()) {
		String token = tkizer.nextToken();
		str = token;
		}
		return str;
		
	}
	
	public String firstCap(String input) {
		
		input.toUpperCase();
		return input;
	}
	
	public int findChar(String input, char one) {
		return one;
		
	}
	

}
