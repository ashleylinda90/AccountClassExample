package com.keyin.account;

public class Account {
    private int balance;

    public int getBalance() {
        return balance;
    }
    public int credit(int amountToCredit) {
        balance += amountToCredit;
        return balance;
    }

    public Object debit(int amountToDebit) throws AccountBalanceException {
        if (0 > (balance - amountToDebit)) {
            throw new AccountBalanceException("Amount to debit causes negative balance! Transaction denied.");
        }

        balance -= amountToDebit;
        return balance;
    }
}
