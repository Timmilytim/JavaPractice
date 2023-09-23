package com.CollectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, Integer> toyInventory = new HashMap<>();
        toyInventory.put("Action Figure", 10);
        toyInventory.put("Puzzle", 5);
        toyInventory.put("Stuffed animal", 15);
        System.out.println("The size of my Map is " + toyInventory.size());

        for (Map.Entry<String, Integer> entry : toyInventory.entrySet()){
            String toyName = entry.getKey();
            int quantity = entry.getValue();
            System.out.println("Toy: " + toyName + ", Quantity: " + quantity);
        }

        Iterator<Map.Entry<String, Integer>> iterator = toyInventory.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            String toyName = entry.getKey();
            int quantity = entry.getValue();
            System.out.println("Toy: " + toyName + ", Quantity: " + quantity);
        }
    }
}
