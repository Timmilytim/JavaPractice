package com.Printables;

public class Email implements Printable {
    @Override
    public void print() {
        String email = "Timmyisahoe@gmail.com";
        System.out.println("Contact Timmy at " + email);
    }
}
