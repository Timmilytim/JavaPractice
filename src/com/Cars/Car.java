package com.Cars;

public class Car {
    private String model;

    private int year;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

 public void startEngine(){
     System.out.println(getModel() + " Engine Started...");
 }

}
