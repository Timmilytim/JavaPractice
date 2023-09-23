package com.ConversionDemo;

public class Main {

    public static void main(String[] args) {
        // Widening conversion
        int intNum = 34;
        double doubleNum = intNum;
        System.out.println(doubleNum);

        // Narrowing conversion
        double doubleNum2 = 59.0;
        int intNum2 = (int) doubleNum2;
        System.out.println(intNum2);

        //boxing
        int value1 = 34; //primitive data type
        Integer myInteger = Integer.valueOf(value1);
        System.out.println(myInteger);

        //unboxing
        Integer myInteger2 = 11; // Non primitive data type
        int value2 = myInteger2.intValue();
        System.out.println(value2);
    }

}
