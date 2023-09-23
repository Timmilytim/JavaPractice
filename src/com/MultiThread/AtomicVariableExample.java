package com.MultiThread;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariableExample {
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        //Lambda Expression
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementAndGet();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter value: " + counter);
    }
}
