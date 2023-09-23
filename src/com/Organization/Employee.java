package com.Organization;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void displayInfo(){
        System.out.println("My Name is " + this.age);
        System.out.println("I am " + this.age + " years old");
        System.out.println("I earn $" + this.salary + " per month");
    }


}
