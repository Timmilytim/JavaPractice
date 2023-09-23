package com.MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Task implements Runnable{
    private int taskId;
    public Task(int taskId) {
        this.taskId = taskId;
    }

    public void run(){
        System.out.println("Task " + taskId + "executed by Thread: " + Thread.currentThread().getId());
    }
}
public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++){
            Runnable task = new Task(i);
            executor.shutdown();
        }
    }
}
