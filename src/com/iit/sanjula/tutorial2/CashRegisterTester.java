package com.iit.sanjula.tutorial2;

public class CashRegisterTester {
    public static void  main(String[] args){
        CashRegister register = new CashRegister(8);

        register.recordPurchase(29.50);
        register.recordPurchase(9.25);
        register.recordPurchase(14.50);
        register.recordTaxablePurchase(5.25);
        register.recordTaxablePurchase(15.23);
//        register.receivePayment(150);

        String receipt = register.printReceipt();
        System.out.println("Prices of all purchased items are : ");
        System.out.println(receipt);
        System.out.println("Total Sales : $" + register.getSalesTotal());

        System.out.println("Sales Count : " + register.getSalesCount());

        double taxablePurchase = register.getTotalTax();
        System.out.println("Tax Total : $" + taxablePurchase);

        int count = register.getCountItems();
        System.out.println("Number of purchases : " + count);

//        double change = register.giveChange();
//
//        System.out.println("Change due : $" + change);

        Coin dollar = new Coin(1, "DOLLAR");
        Coin quarter = new Coin(0.25, "QUARTER");
        Coin dime = new Coin(0.1, "DIME");
        Coin nickel = new Coin(0.05, "NICKEL");
        Coin penny = new Coin(0.01, "PENNY");
        register.receivePayment(100, dollar);
        register.receivePayment(10, quarter);
        register.receivePayment(5, dime);
        register.receivePayment(1, nickel);
        register.receivePayment(0, penny);


        register.giveChange(dollar);

    }
}
