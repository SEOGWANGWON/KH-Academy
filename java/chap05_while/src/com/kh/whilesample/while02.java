package com.kh.whilesample;

import java.util.Scanner;

public class while02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isChoice = false;
		
		while (!isChoice) { // !�� ����ϸ� ture�� ǥ��
			System.out.println("������ ������ �ּ���.");
			
			int month = sc.nextInt();
			
			switch(month) {
				case 12: case 1: case 2: //case 3���� �ϳ��� ���̸� ��� (||�� ���̿� ����������)
					System.out.println("�ܿ�");
					System.out.println("�ܿ��� ���.");
					System.out.println("�ܿ��� �����ϰ� �Ծ���Ѵ�.");
					isChoice = true; // �� ! �� ������� ���� �������� ����ǰ�,
									 // ������ ������ ����Ǳ� ������ true�� �ۼ����־�
									 // !�� ���� false�� ������ while���� �������ش�
					break; //break�� case������ �����ϰ��� �ϴ°� ����� �� �� ���� ����Ѵ�.
				case 3: case 4: case 5:
					System.out.println("��");
					isChoice = true;
					break;
				case 6: case 7: case 8:
					System.out.println("����");
					isChoice = true;
					break;
				case 9: case 10: case 11:
					System.out.println("����");
					isChoice = true;
					break;
				default:
					System.out.println("�߸��� �� �Դϴ�.");
				
			}
			
			
		}
		
		/*
		 ���̰����� �����ϴµ� 9�� �̻� Ƽ���� ������ �� �ֱ� ����
		 ���̸� �Է¹޾� ����(19~20) û�ҳ�(14~18) ���(10~13) �� �з�
		 while switch case ���� �̿��ؼ� ����ϱ�
		 �̿� ���̴� �ٽ� �Է��ϼ���. �����
		 */
		boolean fun = false;
		//
		
		while (!fun) {
			System.out.println("���̸� �Է����ּ���.");
			int age = sc.nextInt();
			switch (age) {
			
				case 19: case 20:
					System.out.println("�����Դϴ�.");
					fun = true;
					break;
				case 14: case 15: case 16: case 17: case 18:
					System.out.println("û�ҳ��Դϴ�.");
					fun = true;
					break;
				case 10: case 11: case 12: case 13:
					System.out.println("����Դϴ�.");
					fun = true;
					break;
				default:
					System.out.println("�ٽ� �Է��ϼ���.");
			}
		}
		/*
		 while�� true�� false�θ� �۵��ϱ⶧���� ������ �ֱ����ؼ� �Լ��� �ƴ��̻� boolean�� �־�����ϰ�
		 whilw(){
		 switch()
		 } switch�� break;�� ���������� while�� �ٱ���ȣ�� �ֱ⶧���� �޽��� ��������Ѵ�.
		 ������ ���ؼ� ������ �ְ� �׾ȿ� boolean�� �������ִ°�.
		 */
		
	}

}
