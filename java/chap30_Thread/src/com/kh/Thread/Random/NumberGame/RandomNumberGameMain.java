package com.kh.Thread.Random.NumberGame;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGameMain {
    public static void main(String[] args) {
        // 랜덤 숫자 생성
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1; // 1에서 100 사이의 숫자 생성

        // 게임 스레드 시작
        GuessingThread guessingThread = new GuessingThread(targetNumber);
        guessingThread.start();

        // 타이머 스레드 시작 (10초 제한)
        TimerThread timerThread = new TimerThread(10);
        timerThread.start();
        
        // 사용자 입력 받기
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("숫자를 입력하세요: ");
            int guess = scanner.nextInt();
            if (guessingThread.isFinished()) {
                System.out.println("게임이 종료되었습니다.");
                break;
            }
            guessingThread.guess(guess);
        }
    }
}