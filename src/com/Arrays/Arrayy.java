package com.Arrays;

public class Arrayy {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        printArray(array);
    }
    public static void printArray(int[] array){
        for(int i =0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
