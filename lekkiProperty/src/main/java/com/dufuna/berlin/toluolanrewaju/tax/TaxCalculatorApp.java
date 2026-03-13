package com.dufuna.berlin.toluolanrewaju.tax;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaxCalculatorApp {
    public static void main(String[] args) {
        SpringApplication.run(TaxCalculatorApp.class, args);
        System.out.println("Tax Calculator App is running...");
    }
}
