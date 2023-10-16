package com.kh.practice.run;

public class Run {

	public static void main(String[] args) {
		Run r = new Run();
		r.practice1();
		r.practice2();
		r.practice3();
		
	}
	
	public void practice1(){
		/*
		3�� 3��¥�� ���ڿ� �迭�� ���� �� �Ҵ��ϰ�
		�ε��� 0�� 0������ 2�� 2������ ���ʴ�� �����Ͽ� ��(0, 0)���� ���� �������� ���� �� ����ϼ���.

		ex.
		(0, 0)(0, 1)(0, 2)
		(1, 0)(1, 1)(1, 2)
		(2, 0)(2, 1)(2, 2)
		*/
		
		int[][] str = new int[3][3];
		
		
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < str[i].length; j++) {
				System.out.print("("+i+", "+j+")");
			}
			
			System.out.println();
		}
		
		
		
	}
	
	public void practice2() {
		/*
			4�� 4��¥�� ������ �迭�� ���� �� �Ҵ��ϰ�
			1) 1 ~ 16���� ���� ���ʴ�� �����ϼ���.
			2) ����� ������ ���ʴ�� ����ϼ���.
			
			ex.
			1 2 3 4
			5 6 7 8
			9 10 11 12
			13 14 15 16
		 */
		int[][] num = new int[4][4];
		
		int a = 1;
		
		for(int i = 0; i<num.length; i++) {
			for(int j = 0; j<num[i].length; j++) {
				System.out.print(a++ +" ");
			}
			System.out.println();
		}
		
		
	}

	public void practice3() {
		/*
			4�� 4��¥�� ������ �迭�� ���� �� �Ҵ��ϰ�
			1) 16 ~ 1�� ���� ���� �Ųٷ� �����ϼ���.
			2) ����� ������ ���ʴ�� ����ϼ���.
			
			ex.
			16 15 14 13
			12 11 10 9
			8 7 6 5
			4 3 2 1
		 */
		
		int[][] num = new int[4][4];
		int a = 16;
		
		
		for(int i = 0; i<num.length; i++) {
			for(int j = 0; j<num[i].length; j++) {
				System.out.print(a-- +" ");
			}
			System.out.println();
		}
		
	}
	
	public void practice4() {
		/*
		 * 4�� 4�� 2���� �迭�� �����Ͽ� 0�� 0������ 2�� 2�������� 1~10������ ������ ���� �� ���� ��
			�Ʒ��� ����ó�� ó���ϼ���.
			
			ex.
			6 6 1 13
			4 10 8 22
			8 6 5 19
			18 22 14 108
		 */
		
		
	}

}


