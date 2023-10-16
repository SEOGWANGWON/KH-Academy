package chap06_for;

import java.util.Scanner;

public class forStar {
	
/*
 다음과 같은 실행 예제를 구현하세요.
ex.
정수 입력 : 5
*****
*   *
*   *
*   *
*****
  
 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("정수를 입력하세요 ");
		int num = sc.nextInt();
		
		for(int i= 1; i <= num ; i++) {
			for(int j= 1; j <= num; j++) {
				if( i == 1 || j == 1 || i == num || j == num) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		
		

	}

}
