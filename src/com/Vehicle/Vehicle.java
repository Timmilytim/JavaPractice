package com.Vehicle;

public class Vehicle {

    private int tire;
    private int engine;
    private int steering;

    public Vehicle(int tire, int engine, int steering){
        this.tire = tire;
        this.engine = engine;
        this.steering = steering;
    }



    public int getTire() {
        return tire;
    }

    public int getEngine() {
        return engine;
    }
    public int getSteering() {
        return steering;
    }

}
