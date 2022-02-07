package com.dbit.dbitdocker.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CalculatorService implements ICalculatorService {

    public static final String SPACE = " ";

    @Override
    public double calculate(double a, double b, String operation) {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                log.error("Operation '{}' is not defined", operation);
                throw new IllegalArgumentException("Operation '" + operation + "' is not defined");
        }
    }

    @Override
    public String print(double a, double b, String operation, double result) {
        return a + SPACE + operation + SPACE + b + " = " + result;
    }
}
