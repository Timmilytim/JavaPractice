package com.InnerClassDemo;

public class LocalClassDemo {
    private int outerField;

    public void OuterMethod(){
        final int localVar = 10; // Local Variable

        // Local inner class
        class LocalClass{
            public void printMessage(){
                System.out.println("Inner class");
                System.out.println("Outer field value: " + outerField);
                System.out.println("Inner field value: " + localVar);
            }
        }

        LocalClass localObj = new LocalClass();
        localObj.printMessage();
    }

    public static void main(String[] args) {
        LocalClassDemo outerObj = new LocalClassDemo();
        outerObj.OuterMethod();
    }
}
