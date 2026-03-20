package com.dufuna.berlin.toluolanrewaju.tax.controller;

import com.dufuna.berlin.toluolanrewaju.tax.service.TaxCalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxController {
    private final TaxCalculatorService service;

    public TaxController(TaxCalculatorService service){
        this.service = service;
    }

    @GetMapping("/tax")
    public  double calculateTax(@RequestParam double income){
        return service.calculateTax(income);
    }
}
