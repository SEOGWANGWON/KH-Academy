package com.kh.ThreadPractice;
import java.io.IOException;
import java.util.Random;

public class GameLoop implements Runnable{
	protected static boolean isGameOver = false;
	@Override
	public void run() {
		while(!isGameOver) {
			// ���� ���� ����
			int randomValue = new Random().nextInt(20);
			System.out.println("������ ���� : " + randomValue);
			
			try {
				
					Thread.sleep(1000);
				
						
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Enter�� ������ ���� ����");
		}
	}
	
}
	

	

		