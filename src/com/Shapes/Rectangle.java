package com.Shapes;

public class Rectangle extends Shape{
    private double width;


    public double getWidth() {
        return width;
    }

    public void setWidth(double width, double length) {
        this.width = width * length;
        System.out.println(this.getWidth());
    }

    @Override
    public void calculateArea() {
        System.out.println("The Area of the Rectangle is "+ this.getWidth());
    }
}
