package com.peyman.generics;

// Create a CheckingAccount using the BankAccount class
public class CheckingAccount extends BankAccount<Long> {
    public CheckingAccount(Long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void deductMonthlyFee(double fee) {
        withdraw(fee);
    }
}