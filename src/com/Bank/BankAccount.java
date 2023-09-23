package com.Bank;

public class BankAccount {

    private int accountNo;
    private String phoneNum;
    private String customerName;
    private String email;
    private double accountBal;

    public BankAccount(int accountNo, String phoneNum, String customerName, String email, double accountBal) {
        this.accountBal = accountBal;
        this.accountNo = accountNo;
        this.phoneNum = phoneNum;
        this.email = email;
        this.customerName = customerName;
    }


    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAccountBal() {
        return accountBal;
    }

    public void setAccountBal(double accountBal) {
        this.accountBal = accountBal;
    }

    public void deposit(double amount){
        this.accountBal += amount;
        System.out.println("Your balance has been updated");
        System.out.println("Your new balance is " + this.accountBal);
    }

    public void withdrawal(int amount){
        if(this.accountBal == 0 || this.accountBal < amount){
            System.out.println("Insufficient Funds");
        }
        else {
            this.accountBal -= amount;
            System.out.println("Withdrawal of "+ amount +" was successful..");
            System.out.println("New account balance is"+ this.accountBal);
        }
    }
}
