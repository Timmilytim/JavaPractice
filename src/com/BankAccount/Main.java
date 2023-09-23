package com.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("05609775478",3000.00 , "Timmy Scorpion");

        ba.deposit(200);
        ba.withdraw(300);

    }
}
