package com.Vehicle;

public class Car extends Vehicle{

    private String licence;
    private int door;
    private String name;

    public Car(int tire, int engine, int steering){
        super(tire, engine, steering);
        this.licence = licence;
        this.door = door;
        this.name = name;
    }

    public String getLicence() {
        return licence;
    }

    public int getDoor() {
        return door;
    }

    public String getName() {
        return name;
    }

    public void steering(){
        System.out.println("You are steering your car...");
    }

    public void changingGear(int gears){
        switch (gears){
            case 1 -> System.out.println("You have changed to gear 1");
            case 2 -> System.out.println("You have changed to gear 2");
            case 3 -> System.out.println("You have changed to gear 3");
            case 4 -> System.out.println("You have changed to gear 4");
            default -> System.out.println("The number you inputted is wrong");
        }
    }



}

