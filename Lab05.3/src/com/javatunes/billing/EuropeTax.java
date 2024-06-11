/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.billing;

/**
 * European orders are taxed as follows:
 * VAT is 17% of taxable amount.
 * Luxury tax is an additional 25% on amount over $100.
 * 
 *
 */
public class EuropeTax implements TaxCalculator{
    @Override
    public double taxAmount(double taxable) {
        double vatRate = 0.17;
        double luxuryTaxRate = 0.25;
        double luxuryTaxThreshold = 100.0;

        double vat = taxable * vatRate;
        double luxuryTax =0.0;

        if (taxable > luxuryTaxThreshold){
            luxuryTax = (taxable - luxuryTaxThreshold) * luxuryTaxRate;
        }

        return vat + luxuryTax;
    }
}