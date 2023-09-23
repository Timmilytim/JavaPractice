package com.InnerClassDemo;

abstract class Shape{
    public abstract void draw();
}

public class AnonymousDemo {
    public static void main(String[] args) {
        Shape shape = new Shape() {
            @Override
            public void draw() {
                System.out.println("Drawing a shape");
            }
        };
        shape.draw();
    }
}
