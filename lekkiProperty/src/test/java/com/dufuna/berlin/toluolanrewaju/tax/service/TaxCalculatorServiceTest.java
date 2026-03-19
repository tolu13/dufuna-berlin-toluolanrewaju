package com.dufuna.berlin.toluolanrewaju.tax.service;

import com.dufuna.berlin.toluolanrewaju.tax.model.TaxBracket;
import com.dufuna.berlin.toluolanrewaju.tax.repository.TaxBracketImpl;
import com.dufuna.berlin.toluolanrewaju.tax.repository.TaxBracketRepository;
import com.dufuna.berlin.toluolanrewaju.tax.service.TaxCalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorServiceTest {

    private TaxCalculatorService service;
    private TaxBracketRepository repository;

    @BeforeEach
    void setup() {
        // 1️⃣ Create repository (pre-load brackets, like your CommandLineRunner)
        repository = new TaxBracketImpl();
        repository.save(new TaxBracket(0, 30000, 0.05));
        repository.save(new TaxBracket(30000, 100000, 0.1));
        repository.save(new TaxBracket(100000, 250000, 0.15));
        repository.save(new TaxBracket(250000, Double.MAX_VALUE, 0.2));

        // 2️⃣ Create service with repository
        service = new TaxCalculatorService(repository);
    }

    @Test
    void testCalculateTax_LowIncome() {
        double income = 20000;
        double tax = service.calculateTax(income);
        // Only first bracket applies: 20,000 * 0.05 = 1,000
        assertEquals(1000.0, tax);
    }

    @Test
    void testCalculateTax_MediumIncome() {
        double income = 120000;
        double tax = service.calculateTax(income);
        /*
           Brackets:
           0-30,000 => 30,000 * 0.05 = 1,500
           30,000-100,000 => 70,000 * 0.1 = 7,000
           100,000-120,000 => 20,000 * 0.15 = 3,000
           Total = 11,500
        */
        assertEquals(11500.0, tax);
    }

    @Test
    void testCalculateTax_HighIncome() {
        double income = 300000;
        double tax = service.calculateTax(income);
        /*
           Brackets:
           0-30,000 => 1,500
           30,000-100,000 => 7,000
           100,000-250,000 => 22,500
           250,000-300,000 => 50,000 * 0.2 = 10,000
           Total = 41,000
        */
        assertEquals(41000.0, tax);
    }
}
