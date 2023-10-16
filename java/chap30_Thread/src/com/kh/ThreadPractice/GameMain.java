package com.kh.ThreadPractice;

import java.io.IOException;
import java.util.Random;
import chap30_ThreadMain.SimpleGame;


public class GameMain extends GameLoop{
	
	public static void main(String[] agrs) {
		
		// 게임 루프 스레드 시작
		Thread gameThread = new Thread(new GameLoop());
		gameThread.start();
		
		try {
			System.in.read();
			isGameOver = true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("게임 종료");
		
	}

}


