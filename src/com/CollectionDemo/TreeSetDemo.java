package com.CollectionDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(321);
        treeSet.add(31);
        treeSet.add(121);
        treeSet.add(21);
        treeSet.add(1);

        System.out.println("The size of your set is "+treeSet.size());

        Iterator<Integer> hs = treeSet.iterator();
        while (hs.hasNext()){
            System.out.println(hs.next());
        }
    }
}
