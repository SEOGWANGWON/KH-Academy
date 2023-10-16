package com.kh.Arraypractice.func;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		/*
		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		ex.
		양의 정수 : 5
		1 2 3 4 5 
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		int[] user = new int[sc.nextInt()];
		
		for(int i = 0; i < user.length; i++) {
			user[i] += i+1;
			System.out.print(user[i]+" ");
		}
		
		
		
		
		
		}
		

	}























/*
Scanner sc = new Scanner(System.in);
System.out.println("숫자를 입력하세요");

int num = sc.nextInt();

int[] ray = new int[num];

for(int i = 0; i < num ; i++) {
	ray[i] = i + 1;			
	System.out.println("양의 정수 : " + ray[i]);
*/
