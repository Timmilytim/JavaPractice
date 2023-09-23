package com.InnerClassDemo;

public class InnerClassDemo {
    private int outerField;

    public class InnerClass{
        private int innerField;

        public void printMessage(){
            System.out.println("Inner class");
            System.out.println("Outer field value: " + outerField);
            System.out.println("Inner field value: " + innerField);
        }
    }

    //non static inner class
    public static void main(String[] args) {
        InnerClassDemo outerObj = new InnerClassDemo();
        InnerClassDemo.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.printMessage();
    }
}
