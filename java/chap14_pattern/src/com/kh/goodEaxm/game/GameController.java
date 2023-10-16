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
		// ÃÖÃÊ ¸Ş¼¼Áö º¸¿©ÁÖ´Â°Å Ãâ·ÂÇÏ°í
		view.displayMessage();
		// ½ºÄ³³Ê ÀÔ·ÂÇØ¼­ ÀÔ·Â°ª È£Ãâ
		Scanner sc = new Scanner(System.in);
		
		
		
		//¸¸¾à¿¡  ÄÄÇ»ÅÍ°¡ »ı°¢ÇÑ ¼ıÀÚ¸¦ ¸Â­ŸÀ» ¶§ ºÒ·¯¿Ã view
		while(true) {
			// ¼ıÀÚ ÃßÃøÇÏ´Â °ªÀ» ÀÔ·ÂÇÏÀÚ
			view.displayGuessPromt();
			int guess = sc.nextInt();
		if(model.inCorrectGuess(guess)){
			view.displayCorrectGuess();
			view.displayAttempts(model.getAttempts());
			break;
		}else {
			// ÄÄÇ»ÅÍ°¡ »ı°¢ÇÑ ¼ıÀÚ¿Í ³»°¡ ÀÔ·ÂÇÑ ¼ıÀÚ°¡ Æ²·ÈÀ» ¶§ view
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

