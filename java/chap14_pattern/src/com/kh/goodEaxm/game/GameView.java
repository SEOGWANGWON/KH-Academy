package com.kh.goodEaxm.game;

public class GameView {
	private String StartMsg = "숫자 맞추기 게임을 시작합니다.";
	private String StartGame = "1에서 100 사이의 숫자를 맞춰보세요!";
	private String GameThing = "추측한 숫자를 입력하세요.";
	private String TrueNum = "숫자를 맞췄습니다!";
	private String FalseNum = "틀렸습니다. 다시 시도하세요.";
	private String TryCount = "시도횟수 : ";
	private String GameOver = "게임종료!";
	
	public void displayMessage() {
		System.out.println(StartMsg);
		System.out.println(StartGame);
		
		
	}
	// 숫자를 추측하는 값 입력하고 // 맞췃는지 틀렸는지적는거랑 // 시도횟수 // 게임종료
	// 1. 숫자 추측하는 값 입력하기
	
	public void displayGuessPromt() {
		System.out.println(GameThing);
		
	}
	
	public void displayCorrectGuess() {
		System.out.println(TrueNum);
	}
	
	public void displayInCorrectGuess() {
		System.out.println(FalseNum);
	}
	
	public void displayAttempts(int attempts) {
		System.out.println(TryCount + attempts);
	}
	
	public void displayGameOver() {
		System.out.println(GameOver);
		
	}
	
}
