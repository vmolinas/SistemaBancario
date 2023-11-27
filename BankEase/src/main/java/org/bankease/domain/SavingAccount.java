package org.bankease.domain;

//cuenta de ahorro

import java.util.UUID;

public class SavingAccount extends BankAccount{
    private double interestRate;

    public SavingAccount() {
    }

    public SavingAccount(UUID accountNumber, String owner, double balance, double interestRate) {
        super(accountNumber, owner, balance);
        this.interestRate = interestRate;
    }

    //Calcular intereses
    public void calculateAndAddInterest() {
        double interests = getBalance() * interestRate;
        deposit(interests);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}