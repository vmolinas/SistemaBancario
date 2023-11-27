package org.bankease.domain;

import java.util.List;

public class Bank {

    private List<Client> clients;

    public Bank() {
    }

    public Bank(List<Client> clients) {
        this.clients = clients;
    }

    //Alta cliente
    public void registerClient(Client client) {
        clients.add(client);
    }

    //Crear cuenta
    public void openAccount(Client client, BankAccount account) {
        client.addAccount(account);
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}