package com.Printables;

public class Document implements Printable {
    @Override
    public void print() {
        String document = "Timmy is a changed man ";
        System.out.println("Contact Timmy at " + document);
    }
}
