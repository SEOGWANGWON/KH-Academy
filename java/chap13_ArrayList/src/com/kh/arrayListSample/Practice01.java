package com.kh.arrayListSample;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;



public class Practice01 {

	public static void main(String[] args) {
		/*
			 3-1)ArrayList �̿��ؼ� ���ֳ����ĳ���
			���� 3ȸ 1,3,5 ->��, ����, �׸� ����
			���ϱ� 2ȸ ->��Ȳ, [���ο�],�Ķ�,[�����Ķ�]
			���� for�� �̿��ؼ� ���� ����ϱ�
			�� �� ��� �� �� ��
			
			3-2)���� for���� �̿��ؼ� ���� ����ϱ� (String �̿� ����)
			int[] numbers = {1,2,3,4,5}
			
			3-3) ����ڷκ��� 5���� ������ �Է¹޾Ƽ� �迭�� �����Ѵ���,
			���� for ���� ����ؼ� �迭�� ��� ��Ҹ� ���� ��� ���
		 */
		
		ArrayList<String> rainbow = new ArrayList();
		
		String[] rainbow2 = {"��","��","��"};
		
		
		rainbow.add("��");
		rainbow.add("��");
		rainbow.add("��");
		rainbow.add("��");
		rainbow.add("��");
		rainbow.add("��");
		rainbow.add("��");
		
		System.out.println(rainbow);
		
		rainbow.set(1, "��");
		rainbow.set(3, "����");
		rainbow.set(5, "�׸�");
		
		rainbow.add(2, "���ο�");
		rainbow.add(5, "�����Ķ�");
		System.out.println(rainbow);
		
		rainbow.set(2, "���ο�");
	
		rainbow.set(5, "�����");
		
		System.out.println(rainbow);
		
		rainbow.remove(1);
		// �������� ��������� ��� �غôµ� �ϳ��� �ۿ� ó���� �ȵǰ�
		// �����Ҷ����� �迭�� �ϳ��� �پ� ���ڸ� �ٽ� �����ؼ� �������
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(2);
		rainbow.remove(1);
		rainbow.remove(2);
		
		System.out.println(rainbow);
		
		
		
		
		for(String morerainbow : rainbow) { // lightVariable ���̸�ŭ laftVariable �� �ϳ��ϳ� �ݺ��ؼ� ���
			System.out.println(morerainbow);
		}
		
		int[] num = {97,99,93,95,89};
		
		for(int i : num) {
			System.out.println("num�� ����ִ� ���� : " + i);
		}
		
		Scanner sc = new Scanner(System.in);
		
		int[] number = new int [5];
		
		for(int i = 0; i < number.length; i++) {
			System.out.println("���ڸ� �Է��ϼ���.");
			int numIn = sc.nextInt();
			number[i] += numIn;
		}
		int total = 0;  // ���� for�� �ȿ��� ������ ���� �ϸ鼭 �ٷ� ���� ������ ������ ����
		for(int numall : number) {
			System.out.print(" " + numall);
			
			total += numall;
		}
		System.out.println();
		System.out.println(total);
		
		
		
		
		
		
	
		
	}

}
