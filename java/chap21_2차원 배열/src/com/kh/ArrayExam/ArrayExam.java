package com.kh.ArrayExam;

import java.util.Scanner;

public class ArrayExam {
	public static void main(String[] agrs) {
		ArrayExam ae = new ArrayExam();
		ae.practice1();
	}
	public void practice1() {
		int value = 1;
		int[][] arr = new int[4][4];
		
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.println(arr[i][j]);
			}
					
		}
	}
	public void practice2() {
		int value = 16;
		int[][] arr = new int[4][4];
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.println(arr[i][j]);
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.printf("%2d " ,arr[i][j]);
				// printf("��� ����" , ����� ����);
				// ��� �� �ٹٲ� ���� ���� �ٹٲ��� �Ϸ��� ������ %n�� �־������
				// %b boolean �������� ��� 
				// %d ���� �������� ���
			}System.out.println();
		}
		
		
	}
	public void practice3() {
		int row = 0; // ��
		int col = 0; // ��
		char value = 'a';
		char[][] arr = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ũ�� : ");
		row = sc.nextInt();
		
		arr = new char[row][];
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println("���� ũ�� : " + i);
			col = sc.nextInt();
			
			arr[i] = new char[col];
		}
		
		for(int i =0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++)
				arr[i][j] = value++;
		}
		for(int i =0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = value++;
			System.out.println(arr[i][j]);
			}
		
		
		}
	}
	public void practice4() {
		
		String[] students = {"���ǰ�","������","�����","�����","���̹�", "�ں���",
				"�ۼ���","������", "������", "��õ��", "��ǳǥ", "ȫ����"};
		int count = 0;
		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];
		
		for(int i = 0; i < seat1.length; i++) {
			for(int j = 0; j < seat1[i].length; j++) {
				seat1[i][j] = students[count++];	
			}
			
		}
		for(int i = 0; i < seat2.length; i++) {
			for(int j = 0; j < seat2[i].length; j++) {
				seat2[i][j] = students[count++];
			}
		}
		System.out.println("======1�д�======");
		for(int i = 0; i < seat1.length; i++) {
			for(int j = 0; j < seat1[i].length; j++) {
				System.out.print(seat1[i][j] + " "); // Ʋ�Ǵ� ���� print���� ln �ٿ��� ������
	
	
			}
			System.out.println();
		}
		System.out.println("======2�д�======");
		for(int i = 0; i < seat2.length; i++) {
			for(int j = 0; j < seat2[i].length; j++) {
				System.out.print(seat2[i][j] + " ");  // Ʋ�Ǵ� ���� print���� ln �ٿ��� ������
			}
			System.out.println();
		}
	}
	
	

}

