package com.MultiThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyCallable implements Callable<Integer>{
    public Integer call(){
        int result = 0;
        for(int i = 1; i <= 2; i++){
            result += 1;
        }
        return result;
    }
}

public class ThreadResultExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<Integer> callable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(callable);

        Thread thread = new Thread(futureTask);
        thread.start();

        int result = futureTask.get();
        System.out.println("Thread result: " +  result);
    }
}
