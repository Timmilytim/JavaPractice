package com.MultiThread;

class Car implements Runnable{
    private String name;

    public Car(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i<3; i++){
            System.out.println(name + " is moving "
            + Thread.currentThread().getPriority());
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(name + " has finished");
    }
}
public class CarThead {

    public static void main(String[] args) {
        Thread car = new Thread(new Car("Ferrari"));
        Thread car2 = new Thread(new Car("Bugatti"));
        Thread car3 = new Thread(new Car("Tesla"));

        car.start();
        car2.start();
        car3.start();

    }

}
