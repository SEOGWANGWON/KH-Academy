package com.kh.arrayListSample;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;



public class Practice01 {

	public static void main(String[] args) {
		/*
			 3-1)ArrayList 이용해서 빨주노초파남보
			수정 3회 1,3,5 ->블랙, 브라운, 그린 수정
			더하기 2회 ->주황, [옐로우],파랑,[연한파랑]
			향상된 for문 이용해서 색상 출력하기
			최 후 출력 빨 파 보
			
			3-2)향상된 for문을 이용해서 숫자 출력하기 (String 이용 금지)
			int[] numbers = {1,2,3,4,5}
			
			3-3) 사용자로부터 5개의 정수를 입력받아서 배열에 저장한다음,
			향상된 for 문을 사용해서 배열의 모든 요소를 더한 결과 출력
		 */
		
		ArrayList<String> rainbow = new ArrayList();
		
		String[] rainbow2 = {"빨","파","보"};
		
		
		rainbow.add("빨");
		rainbow.add("주");
		rainbow.add("노");
		rainbow.add("초");
		rainbow.add("파");
		rainbow.add("남");
		rainbow.add("보");
		
		System.out.println(rainbow);
		
		rainbow.set(1, "블랙");
		rainbow.set(3, "브라움");
		rainbow.set(5, "그린");
		
		rainbow.add(2, "옐로우");
		rainbow.add(5, "연한파랑");
		System.out.println(rainbow);
		
		rainbow.set(2, "옐로우");
	
		rainbow.set(5, "연녹색");
		
		System.out.println(rainbow);
		
		rainbow.remove(1);
		// 여러개를 다적어봐서 출력 해봤는데 하나씩 밖에 처리가 안되고
		// 제거할때마다 배열이 하나씩 줄어 숫자를 다시 생각해서 적어야함
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(2);
		rainbow.remove(1);
		rainbow.remove(2);
		
		System.out.println(rainbow);
		
		
		
		
		for(String morerainbow : rainbow) { // lightVariable 길이만큼 laftVariable 이 하나하나 반복해서 출력
			System.out.println(morerainbow);
		}
		
		int[] num = {97,99,93,95,89};
		
		for(int i : num) {
			System.out.println("num에 들어있는 숫자 : " + i);
		}
		
		Scanner sc = new Scanner(System.in);
		
		int[] number = new int [5];
		
		for(int i = 0; i < number.length; i++) {
			System.out.println("숫자를 입력하세요.");
			int numIn = sc.nextInt();
			number[i] += numIn;
		}
		int total = 0;  // 향상된 for문 안에서 변수를 생성 하면서 바로 값을 넣으면 에러가 생김
		for(int numall : number) {
			System.out.print(" " + numall);
			
			total += numall;
		}
		System.out.println();
		System.out.println(total);
		
		
		
		
		
		
	
		
	}

}
