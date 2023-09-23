package com.InheritanceDemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Iphone ios = new Iphone();
        Andriod andi = new Andriod();

        // Calling the objects in the android class
        System.out.println("... Welcome to the Android Section ...");

        System.out.println("Enter the name of the device: ");
        String name = sc.nextLine();

        System.out.println("Enter the Memory size of the device: ");
        int ram = sc.nextInt();

        System.out.println("Enter the Storage size of the device: ");
        int size = sc.nextInt();

        andi.setName(name);
        andi.setRam(ram);
        andi.setSize(size);

        System.out.println("So, you want a " + andi.getName() + " with a ram of  " + andi.getRam() + "GB and an internal storage of " + andi.getSize() +"GB");
        System.out.println("Oya go to the store and use your own money to buy it");
        System.out.println("Good bye...");
    }

}
