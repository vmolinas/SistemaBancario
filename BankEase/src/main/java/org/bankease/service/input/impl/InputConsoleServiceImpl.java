package org.bankease.service.input.impl;

import org.bankease.service.input.InputServiceInterface;

import java.util.Scanner;

public class InputConsoleServiceImpl implements InputServiceInterface {


    @Override
    public void createScanner() {
        System.out.println("Entrada por consola iniciada");
    }

    @Override
    public Scanner getScanner() {
        return null;
    }

    @Override
    public void closeScanner() {
        System.out.println("Entrada por consola terminada");
    }
}