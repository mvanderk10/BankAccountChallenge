package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount newAccount = new BankAccount();
        BankAccount billsAccount = new BankAccount(
                "2548745654",
                0.00,
                "Bill W",
                "bill@myemail.com",
                "565-888-8888");

        System.out.println(newAccount.getBalance());
        System.out.println(billsAccount.getCustName() + " " + billsAccount.getBalance());

        System.out.println("***********************");

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob",20000);
        System.out.println("Bob has a " + person2.getCreditLimit() + " credit limit.");

        VipPerson person3 = new VipPerson("Bill",10000,"bill@email.com");
        System.out.println(person3.getName());
    }
}
