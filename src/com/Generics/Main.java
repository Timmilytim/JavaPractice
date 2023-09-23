package com.Generics;

public class Main {
    public static void main(String[] args) {
//        MyGenericClass myIntegerObject = new MyGenericClass(12);
//        MyGenericClass myDoubleClass = new MyGenericClass(12.2);
//        MyGenericClass myStringObject = new MyGenericClass("Timmy");
//        MyGenericClass myCharacterObject = new MyGenericClass("@");
//
//        System.out.println(myCharacterObject.getT());
//        System.out.println(myDoubleClass.getT());
//        System.out.println(myIntegerObject.getT());
//        System.out.println(myStringObject.getT());

        Integer[] arr1 = {1,2,3,4,5};
        Double[] arr2 = {1.1,2.2,3.3,4.4,5.5};
        Character[] arr3 = {'1','2','3','4','5'};
        String[] arr4 = {"1","2","3","4","5"};

        printArray(arr2);

        System.out.println(returnArray(arr1));

    }
    public static <T> void printArray(T[] t){
        for (T x: t) {
            System.out.println(x);
        }
    }

    public static <T> T returnArray(T[] t) {
        return t[1];
    }

}
