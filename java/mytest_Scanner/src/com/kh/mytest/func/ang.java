package com.kh.mytest.func;

import java.util.Scanner;

public class ang {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // �Է¹ޱ� ���� �޼ҵ�
		
		//  1. ����ڷκ��� �Է� ���� �ϳ��� ���� �Ҽ����� �Ǻ��ϴ� ���α׷��� �����ϼ���.
		//	2. ��, �Է��� 	���� 2���� ���� ��� ���߸� �Է��ϼ̽��ϴ�.���� ����ϼ���.
		  System.out.println("���ڸ� �Է��ϼ���."); // ��� �޼ҵ�
		  int num = sc.nextInt(); 
		
		  if ( num < 2) { // ���࿡ �Է��� ���� 2���� ���� ���
			  System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		  }else { 
			  for(int i = 2; i <= num; i++) {
					  if(i % num == 0 && i / num == 1) {
				System.out.println("�Ҽ��Դϴ�.");
					  }else {
						  System.out.println("�Ҽ��� �ƴմϴ�");
					  }
					  // ���࿡ �Է��� ���� 2���� Ŭ ���
			  }
		

	}

}
}