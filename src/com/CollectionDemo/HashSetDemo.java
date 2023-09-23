package com.CollectionDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {
//        HashSet hashSet = new HashSet<Integer>();
//        hashSet.add(321);
//        hashSet.add(31);
//        hashSet.add(121);
//        hashSet.add(21);
//        hashSet.add(1);

//        System.out.println("The size of your set is "+hashSet.size());
//
//        Iterator hs = hashSet.iterator();
//        while (hs.hasNext()){
//            System.out.println(hs.next());
//        }

        HashSet<Contacts> hashSet = new HashSet<>();
        Contacts contacts = new Contacts();
        contacts.setX(12L);
        hashSet.add(contacts);

        Iterator iterator = hashSet.iterator();

        while (iterator.hasNext()){
            Contacts sc = (Contacts) iterator.next();
            System.out.println(sc.getX());
        }
    }

}
