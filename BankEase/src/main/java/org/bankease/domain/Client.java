package org.bankease.domain;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private Address address;
    private List<BankAccount> bankAccounts = new ArrayList<>();

    public Client() {
    }

    public Client(String name, Address address, List<BankAccount> bankAccounts) {
        this.name = name;
        this.address = address;
        this.bankAccounts = bankAccounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<BankAccount> getAccounts() {
        return bankAccounts;
    }

    public void setAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public void addAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public void deleteAccount(BankAccount bankAccount) {
        bankAccounts.remove(bankAccount);
    }

    public double checkTotalBalance() {
        double totalBalance = 0;
        for (BankAccount bankAccount : bankAccounts) {
            totalBalance += bankAccount.getBalance();
        }
        return  totalBalance;
    }
}