package com.kh.api.exam1;

public class ReplaceMain {

	public static void main(String[] args) {
		//replace1();
				ReplaceMain rm = new ReplaceMain();
				rm.replace2();
				//rm.replace3();
				//rm.replace4();
				//rm.replace5();
				//rm.replaceAll();
			}
			
			public void replace1() {
				String input = "Hello, world!";
				String reInput = input.replace(" ", "-");
				System.out.println(reInput);
				String input2 = reInput.replace("-", "");
				System.out.println("input2 : "+input2);
			}
			
			public void replace2() {
				String input = "Hello World!";
				//World를 Java로 교체
				String reInput = input.replace("World", "Java");
				System.out.println(reInput);
			}
			
			public void replace3() {   // 이 아래로 다푸는 문제
				String originName = "Hello world";
				
				// o로 적혀있는 문자열들 x로 변경하기
				String reInput = originName.replace("o", "x");
				System.out.println(reInput);
			}
			public void replace4(){
				String originString = "The quick brown fox jumps over the lazy dog";
				// fox -> cat
				String reInput = originString.replace("fox", "cat");
				System.out.println(reInput);
				
				
			}
			public void replace5() {
				String originString = "The quick brown fox jumps over the lazy dog";
				// 모든 공백 제거하기
				String reInput = originString.replace(" ", "");
				System.out.println(reInput);
				
			}
			
			public void replaceAll() {
				String originString = "Hello World";
				// replace 대신 replaceAll 을 이용해서 대소문자 구분없이 문자열 Java로 치환하기
				String reAllstr = originString.replaceAll("(?i)world", "java");
				System.out.println(reAllstr);
			}
		
		
	}


