package com.BankAccount;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    private String ownerName;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber)
    {this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }



    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit(double amount){
        double total;
        total = balance + amount;
        System.out.println("The amount of money deposited is " + amount);
        System.out.println("Your balance is " + total);
    }
    public void withdraw(double amount){
        double total;
        if (amount <= balance){
            total = this.getBalance() - amount;
            System.out.println("The amount of money deposited is " + amount);
            System.out.println("Your balance is " + total);
        }else {
            System.out.println("Insufficient balance werey, go and work...");
        }

    }

}
