package com.peyman.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Create a savings account
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(12345, 1000);
        savingsAccount.addInterest(5);

        // Create a checking account
        CheckingAccount checkingAccount = new CheckingAccount(67890L, 2000);
        checkingAccount.deductMonthlyFee(50);

        // Print account details
        System.out.println("Savings Account "+savingsAccount.getAccountNumber()+" Balance: "+savingsAccount.getBalance());
        System.out.println("Checking Account "+checkingAccount.getAccountNumber()+" Balance: "+checkingAccount.getBalance());



        List<BankAccount<?>> accounts = new ArrayList<>();
        accounts.add(savingsAccount);
        accounts.add(checkingAccount);

        System.out.println("Total balance of all accounts: " + BankAccount.getTotalBalance(accounts));

    }


}
