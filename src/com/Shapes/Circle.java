package com.Shapes;

public class Circle extends Shape{
    private double radius;

    public void setRadius(double radius) {
        this.radius = 2 * 3.14 * radius;
    }
    public double getRadius() {
        return radius;
    }

    @Override
    public void calculateArea(){
        System.out.println("The Area of the circle is " + this.getRadius());
    }

}

