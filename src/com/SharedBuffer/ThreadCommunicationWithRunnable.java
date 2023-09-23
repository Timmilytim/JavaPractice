package com.SharedBuffer;

class SharedBuffer {
    private int[] buffer;
    private int count;
    private int size;

    public SharedBuffer(int size){
        this.size = size;
        this.buffer = new int[size];
    }

    public void produce(int item) throws InterruptedException {
        while (count == size){
            Thread.sleep(100);
        }
        buffer[count++] = item;
        System.out.println("Produced: " + item);
    }

    public int consume() throws InterruptedException{
        while (count == 0){
            Thread.sleep(10000);
        }
        int consumedItem = buffer[--count];
        System.out.println("Consumed" + consumedItem);
        return consumedItem;
    }
}

class Producer implements Runnable {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                buffer.produce(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                int consumedItem = buffer.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadCommunicationWithRunnable {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(3);
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();
    }
}

