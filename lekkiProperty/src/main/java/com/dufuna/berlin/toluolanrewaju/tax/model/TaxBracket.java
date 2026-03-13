package com.dufuna.berlin.toluolanrewaju.tax.model;

public class TaxBracket {
    private double minIncomeBracket;
    private double maxIncomeBracket;
    private double taxRate;

    public TaxBracket(double minIncomeBracket, double maxIncomeBracket, double taxRate){
        this.minIncomeBracket = minIncomeBracket;
        this.maxIncomeBracket = maxIncomeBracket;
        this.taxRate = taxRate;
    }

    public double getMinIncomeBracket() {
        return minIncomeBracket;
    }

    public double getMaxIncomeBracket() {
        return maxIncomeBracket;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setMinIncomeBracket(double minIncomeBracket) {
        this.minIncomeBracket = minIncomeBracket;
    }

    public void setMaxIncomeBracket(double maxIncomeBracket) {
        this.maxIncomeBracket = maxIncomeBracket;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

}
