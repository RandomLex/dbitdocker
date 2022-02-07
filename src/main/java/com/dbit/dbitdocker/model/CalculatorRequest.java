package com.dbit.dbitdocker.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CalculatorRequest {
    private double a;
    private double b;
    private String operation;
}
