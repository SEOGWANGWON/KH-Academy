package com.kh.goodEaxm.game;

import java.util.Scanner;

public class GameController {
	//       String
	private GameModel model;
	private GameView view;
	
	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}
	
	public void runGame() {
		// ���� �޼��� �����ִ°� ����ϰ�
		view.displayMessage();
		// ��ĳ�� �Է��ؼ� �Է°� ȣ��
		Scanner sc = new Scanner(System.in);
		
		
		
		//���࿡  ��ǻ�Ͱ� ������ ���ڸ� �­��� �� �ҷ��� view
		while(true) {
			// ���� �����ϴ� ���� �Է�����
			view.displayGuessPromt();
			int guess = sc.nextInt();
		if(model.inCorrectGuess(guess)){
			view.displayCorrectGuess();
			view.displayAttempts(model.getAttempts());
			break;
		}else {
			// ��ǻ�Ͱ� ������ ���ڿ� ���� �Է��� ���ڰ� Ʋ���� �� view
			view.displayInCorrectGuess();
			view.displayAttempts(model.getAttempts());
			
			
			}
		}
		view.displayGameOver();
	}
	
	public static void main(String[] agrs) {
		GameModel m = new GameModel();
		GameView v = new GameView();
		GameController c = new GameController(m,v);
		
		c.runGame();
		
		
		
	}
	
	
}

