package com.Generics;

import java.util.ArrayList;

public class PracticeLV1 {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        items.add(6);

        array(items);

    }
    public static void array(ArrayList<Integer> n){
        for (int i : n){
            System.out.println( i * 2);
        }
    }
}
