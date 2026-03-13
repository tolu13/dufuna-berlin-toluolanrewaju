package com.dufuna.berlin.toluolanrewaju.tax.service;

import com.dufuna.berlin.toluolanrewaju.tax.model.TaxBracket;
import com.dufuna.berlin.toluolanrewaju.tax.repository.TaxBracketRepository;

import java.util.List;

public class TaxCalculatorService {
    private TaxBracketRepository repository;

    public TaxCalculatorService(TaxBracketRepository repository) {
        this.repository = repository;
    }

    public double CalculateTax(double income) {
        double tax = 0;
        List<TaxBracket> brackets = repository.findAll();

        for (TaxBracket bracket : brackets) {
            if (income > bracket.getMinIncomeBracket()) {
                double taxableAmount = Math.min(income, bracket.getMaxIncomeBracket()) - bracket.getMinIncomeBracket();
                tax += taxableAmount * bracket.getTaxRate();
            }
        }
        return tax;
    }
}
