package com.MultiThread;

class Task2 implements Runnable {
    private String name;

    public Task2(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " - Step " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ConcurrentProcessingExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task2("Task 1"));
        Thread thread2 = new Thread(new Task2("Task 2"));

        thread1.start();
        thread2.start();
    }
}
