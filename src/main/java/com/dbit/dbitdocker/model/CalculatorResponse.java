package com.dbit.dbitdocker.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CalculatorResponse {
    private double result;
    private String print;
}
