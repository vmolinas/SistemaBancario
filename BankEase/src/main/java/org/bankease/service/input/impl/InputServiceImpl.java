package org.bankease.service.input.impl;

import org.bankease.service.validations.ValidationService;
import org.bankease.service.validations.impl.ValidationServiceImpl;

import java.util.Scanner;

public class InputServiceImpl {
    public static Scanner scanner;
    public static final ValidationService validate = new ValidationServiceImpl();
    public static String consoleInput(String console) {
        String input = "";
        boolean keepOn = false;
        do {
            System.out.println(console);
            input = scanner.nextLine();
            keepOn = validate.stringValidation(input);
        } while (keepOn);
        return input;
    }

    public static int consoleInput(int console){
        int input = 0;
        boolean keepOn = false;
        do {
            System.out.print(console);
            input = scanner.nextInt();
            keepOn = validate.intValidation(input);

        } while (keepOn);
        return input;
    }

    public static void createScanner() {
        if(scanner == null){
            scanner = new Scanner(System.in);
        }
    }

    public Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    public void closeScanner() {
        if(scanner != null){
            scanner.close();
        }
    }
}