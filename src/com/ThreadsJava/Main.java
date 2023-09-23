package com.ThreadsJava;

class MyThread extends Thread {
    public void run(){
        try{
            System.out.println("A");
            System.out.println("B");
            System.out.println("C");
            Thread.sleep(2000);
            System.out.println("D");
            System.out.println("E");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
class MyRunnable implements Runnable{
    public void run(){
        try{
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            Thread.sleep(2000);
            System.out.println("4");
            System.out.println("5");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        thread.setPriority(1);

        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();
        thread2.setPriority(10);
    }
}
