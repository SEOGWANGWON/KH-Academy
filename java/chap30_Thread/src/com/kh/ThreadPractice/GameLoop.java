package com.kh.ThreadPractice;
import java.io.IOException;
import java.util.Random;

public class GameLoop implements Runnable{
	protected static boolean isGameOver = false;
	@Override
	public void run() {
		while(!isGameOver) {
			// 게임 루프 내용
			int randomValue = new Random().nextInt(20);
			System.out.println("임의의 숫자 : " + randomValue);
			
			try {
				
					Thread.sleep(1000);
				
						
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Enter를 누르면 게임 종료");
		}
	}
	
}
	

	

		