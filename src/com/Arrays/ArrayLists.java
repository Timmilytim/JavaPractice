package com.Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("Timmy");
        list.add("Tim");
        list.add(13);
        list.add(15);
        list.add(177);


//        System.out.println("The size of the array list is " + list.size());
//
//        for (int i = 0; i < list.size(); i++){
//            System.out.println("element " + i + " values " + list.get(i));
//        }
//
//        for (Object c : list){
//            System.out.println(c);
//        }
//
//        Iterator hs = List.of().listIterator();
//        while (hs.hasNext()){
//            System.out.println(hs.next());
//        }
//
//        list.set(1,"Timmy");
//        System.out.println("The size of my List is " + list.size());
//        for (int i = 0; i < list.size(); i++){
//            System.out.println("element " + i + " values " + list.get(i));
//        }

        list.add(1, 223);

        System.out.println("The size of my List is " + list.size());
        for (int i = 0; i < list.size(); i++){
            System.out.println("element " + i + " values " + list.get(i));
        }
    }
}
