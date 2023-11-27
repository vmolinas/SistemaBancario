package org.bankease.service.client;

import org.bankease.domain.BankAccount;
import org.bankease.domain.Client;

public interface ClientService {
    Client createClient(BankAccount bankAccount);
}