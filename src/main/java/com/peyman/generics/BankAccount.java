package com.peyman.generics;

import java.util.List;

// Define a generic BankAccount class
class BankAccount<T extends Number> {
    private T accountNumber;
    private double balance;

    public BankAccount(T accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public T getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static double getTotalBalance(List<? extends BankAccount<?>> accounts) {
        double total = 0;
        for (BankAccount<?> account : accounts) {
            total += account.getBalance();
        }
        return total;
    }
}
