package org.bankease.service.client.impl;

import org.bankease.domain.BankAccount;
import org.bankease.domain.Client;
import org.bankease.service.client.ClientService;
import org.bankease.service.input.impl.InputServiceImpl;

public class ClientServiceImpl implements ClientService {
    @Override
    public Client createClient(BankAccount bankAccount) {
        Client client = new Client();
        client.setName(InputServiceImpl.consoleInput("Nombre: "));
        /*client.setAddress();*/
        return null;
    }
}