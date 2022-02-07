package com.dbit.dbitdocker.controllers;

import com.dbit.dbitdocker.model.CalculatorRequest;
import com.dbit.dbitdocker.model.CalculatorResponse;
import com.dbit.dbitdocker.services.ICalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalculatorController {
    private final ICalculatorService service;

    @PostMapping("/calculate")
    public ResponseEntity<CalculatorResponse> action(@RequestBody CalculatorRequest req) {
        double a = req.getA();
        double b = req.getB();
        String operation = req.getOperation();
        double result = service.calculate(a, b, operation);
        return ResponseEntity.ok(CalculatorResponse.builder()
                        .result(result)
                        .print(service.print(a, b, operation, result))
                .build());
    }
}
