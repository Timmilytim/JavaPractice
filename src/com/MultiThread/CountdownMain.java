package com.MultiThread;

public class CountdownMain{
    public static void main(String[] args) {
        Countdown countdown = new Countdown();
        CountdownThread t1 = new CountdownThread(countdown);
        t1.setName("Thread 1");
        CountdownThread t2 = new CountdownThread(countdown);
        t1.setName("Thread 2");
//        CountdownThread t3 = new CountdownThread(countdown);
//        t1.setName("Thread 3");

        t1.start();
        t2.start();
//        t3.start();
    }

}


class Countdown {
    private int i;
    public void startCountDown(){
        synchronized (this) {
            for(i = 10; i>0; i--){
                System.out.println(Thread.currentThread().getName() + ": i = " + i);
            }
        }


    }
}


class CountdownThread extends Thread{
    private Countdown countdown;
    public CountdownThread(Countdown countdown){
        this.countdown = countdown;
    }

    @Override
    public void run(){
        countdown.startCountDown();
    }
}