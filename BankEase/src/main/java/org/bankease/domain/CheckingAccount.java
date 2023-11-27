package org.bankease.domain;

//cuenta corriente

import java.util.UUID;

public class CheckingAccount extends BankAccount {

    private double overdraftLimit;

    public CheckingAccount() {
    }

    public CheckingAccount(UUID accountNumber, String owner, double balance, double overdraftLimit) {
        super(accountNumber, owner, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Manejar retiro de sobregiro
    public void handleWithdrawal(double amount) {
        if (amount > getBalance() + overdraftLimit) {
            System.out.println("Fondos insuficientes.");
        } else {
            withdraw(amount);
        }
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}