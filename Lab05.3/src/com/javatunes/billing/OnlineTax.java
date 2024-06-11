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
 * Online orders are tax-free!
 * 
 *
 */

public class OnlineTax implements TaxCalculator{
    @Override
    public double taxAmount(double amount) {
        return 0.0;
    }
}