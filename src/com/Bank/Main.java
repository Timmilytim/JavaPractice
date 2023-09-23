package com.Bank;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(123, "09026067000", "Timmy", "oluwapelumiodus@gmail.com", 300.0 );

//        bankAccount.deposit(300);
//        bankAccount.withdrawal(600);
//        System.out.println("Your account balance is " + bankAccount.getAccountBal());

        System.out.println("Account Balance: " + bankAccount.getAccountBal());
        System.out.println("Bank Account: " + bankAccount.getAccountNo());
        System.out.println("Customer Name: " + bankAccount.getCustomerName());
        System.out.println("Email: " + bankAccount.getEmail());
        System.out.println("Phone Number: " + bankAccount.getPhoneNum());
    }


}
