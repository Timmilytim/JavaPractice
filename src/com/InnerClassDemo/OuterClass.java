package com.InnerClassDemo;

import jdk.dynalink.beans.StaticClass;

public class OuterClass {
    private static int outerField;

    public static class StaticClass{
        private int innerField;

        public void printMessage(){
            System.out.println("Inner class");
            System.out.println("Outer field value: " + outerField);
            System.out.println("Inner field value: " + innerField);
        }
    }

    public static void main(String[] args) {
        StaticClass staticClass = new StaticClass();
        staticClass.printMessage();
    }
}
