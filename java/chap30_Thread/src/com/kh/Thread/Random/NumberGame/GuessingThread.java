package com.kh.Thread.Random.NumberGame;

public class GuessingThread extends Thread {
    private int targetNumber;
    private int guess;
    private boolean finished;

    public GuessingThread(int targetNumber) {
        this.targetNumber = targetNumber;
        this.finished = false;
    }

    @Override
    public void run() {
        while (!finished) {
            if (guess != 0) {
                if (guess < targetNumber) {
                    System.out.println("더 큰 숫자를 입력하세요.");
                } else if (guess > targetNumber) {
                    System.out.println("더 작은 숫자를 입력하세요.");
                } else {
                    System.out.println("정답입니다!");
                    finished = true;
                }
                guess = 0; // 다음 추측을 대기
            }
        }
    }

    public synchronized void guess(int number) {
        this.guess = number;
    }

    public boolean isFinished() {
        return finished;
    }
}