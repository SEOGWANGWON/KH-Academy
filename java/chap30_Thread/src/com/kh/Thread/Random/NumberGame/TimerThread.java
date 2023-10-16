package com.kh.Thread.Random.NumberGame;

public class TimerThread extends Thread {
    private int seconds;

    public TimerThread(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(seconds * 1000);
            System.out.println("타임 오버!");
            System.exit(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
