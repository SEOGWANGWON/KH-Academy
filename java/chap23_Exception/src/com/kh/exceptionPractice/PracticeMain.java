package com.kh.exceptionPractice;

public class PracticeMain {

	public static void main(String[] args) {
		
		PracticeMain pm = new PracticeMain();
		
		//pm.ArithException();
		//pm.NPException();
		//pm.NFException();
		pm.ExceptionExam();
		
	}
	public void ArithException() {
		// int dividend / divisor �������� �� ����ó��
		int dividend = 100;
		int divisor = 0;
		
		try {
			int result = dividend / divisor;
			System.out.println(result);
		}catch(ArithmeticException a) {
			System.out.println("���� �� ���� �����Դϴ�.");
			System.out.println("�� �ǰڳİ�~" + a.getMessage());
		}
	}
	
	public void NPException() {   // NullPoint
		String text = "Hello World";
		String subText = null;
		
		try {
			// indexOf subText �� �ִ� null ���� ������ ���ڿ� �˻�
			int length = text.indexOf(subText);
			System.out.println("���ڿ� ���� " + length);
		} catch(NullPointerException np) {
			System.out.println("�Է� ����! : " + np.getMessage());
			
		}
		
		
	}
	
	public void NFException() {   // NumFormat
		try {
		String text = "123.45";
		int number = Integer.parseInt(text);
		System.out.println(number);
		} catch(NumberFormatException nf) {
			System.out.println("�Է� ����! : " + nf.getMessage());
			
		}
		
		
	}
	
	public void ExceptionExam() {
		
		try {
		int[] numbers = {1,2,3,4,5};
		int index = 7; // �ε��� �ѹ�
		int result = numbers[index]; // �迭 ��ҿ� ����
		System.out.println("Result : " + result);
		} catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("�迭 �ε��� ������ ��� ���ܰ� �߻�!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(a.getMessage());
		} catch(Exception a) {
			// �ٸ� ���ܸ� ó���� �� �ִ� ���� ó��
			System.out.println("�迭 �ε��� ������ ��� ���ܰ� �ƴ� �Ϲ����� �ٸ� ���� �߻�!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		} finally {
			// �׻� ����Ǵ� ���
			System.out.println("Finally ����!");
		}
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
		
		
		}
}


