package com.atdev;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currency;
    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }
    //Print payments schedule
    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for(double balance : calculator.getRemainingBalance()){
            System.out.println(currency.format(balance));
        }
    }
    //Print Mortgage
    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormated = currency.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("---------");
        System.out.println("Monthly Payments: "+ mortgageFormated);
    }
}
