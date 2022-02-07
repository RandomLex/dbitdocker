package com.dbit.dbitdocker.services;

public interface ICalculatorService {

    double calculate(double a, double b, String operation);

    String print(double a, double b, String operation, double result);
}
