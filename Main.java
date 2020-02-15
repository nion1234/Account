package com.company;

public class Main {

    public static void main(String[] args) {
        Account RakibsAccount = new Account("Rakib", "rahamanmdrakib@gmail.com","01797734728");
        System.out.println("customer Number is"+" "+ RakibsAccount.getNumber());
        System.out.println("Customer Name is"+" "+RakibsAccount.getCustomerName());
        System.out.println("Current balance is " + RakibsAccount.getBalance());
        System.out.println("Customer Email:" +" "+ RakibsAccount.getCustomerEmailAddress());
        RakibsAccount.withdrawal(1000);
        RakibsAccount.deposit(60000);

    }
}
