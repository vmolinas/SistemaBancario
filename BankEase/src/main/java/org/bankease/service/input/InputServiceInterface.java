package org.bankease.service.input;

import java.util.Scanner;

public interface InputServiceInterface {
    void createScanner();
    Scanner getScanner();
    void closeScanner();
}