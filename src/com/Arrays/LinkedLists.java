package com.Arrays;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {
        List list = new LinkedList<>();
        list.add("Timmy");
        list.add("Tim");
        list.add(13);
        list.add(15);
        list.add(177);

        list.add(1, 223);

        System.out.println("The size of my List is " + list.size());
        for (int i = 0; i < list.size(); i++){
            System.out.println("element " + i + " values " + list.get(i));
        }
    }
}