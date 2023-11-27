package org.bankease.service.validations;

public interface ValidationService {
    Boolean stringValidation(String fact);
    Boolean dateValidation (String fact);
    Boolean intValidation(int fact);
}