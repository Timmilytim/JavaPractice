package com.Shapes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle cr = new Circle();
        Rectangle rec = new Rectangle();

        System.out.println("To get the area of a circle...");
        System.out.println("Enter the Radius: ");
            double radius = sc.nextDouble();
            cr.setRadius(radius);
        cr.calculateArea();

        System.out.println(" ");
        System.out.println("To get the length of a Rectangle...");
        System.out.println("Enter the length: ");
            double length = sc.nextDouble();
        System.out.println("Enter the Width: ");
            double width = sc.nextDouble();
            rec.setWidth(length, width);
            rec.calculateArea();

    }
}
