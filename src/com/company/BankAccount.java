package com.company;


public class BankAccount {
    private String accountNum;
    private double balance;
    private String custName;
    private String email;
    private String phoneNum;

    //this is calling an empty constructor from a constructor
    public BankAccount(){

        //special use of the this keyword to call from another constructor
        this("54540",0.00,"default name","default email","default phone");
    }

    public BankAccount(String accountNum, double balance, String custName, String email, String phoneNum){
        this.accountNum = accountNum;
        this.balance = balance;
        this.custName = custName;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount < 0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
