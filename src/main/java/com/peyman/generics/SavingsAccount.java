package com.peyman.generics;

// Create a SavingsAccount using the BankAccount class
public class SavingsAccount extends BankAccount<Integer> {
    public SavingsAccount(Integer accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void addInterest(double rate) {
        double interest = getBalance() * (rate / 100);
        deposit(interest);
    }
}