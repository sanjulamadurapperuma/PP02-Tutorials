package com.iit.sanjula.tutorial1.ExtraQuestions;

public class CashRegisterTester {
    public static void  main(String[] args){
        CashRegister register = new CashRegister(8);

        register.recordPurchase(29.50);
        register.recordPurchase(9.25);
        register.recordPurchase(14.50);
        register.recordTaxablePurchase(5.25);
        register.recordTaxablePurchase(15.23);
        register.receivePayment(150);

        String receipt = register.printReceipt();
        System.out.println("Prices of all purchased items are : ");
        System.out.println(receipt);

        System.out.println("Total Sales : $" + register.getSalesTotal());

        System.out.println("Sales Count : " + register.getSalesCount());

        double taxablePurchase = register.getTotalTax();
        System.out.println("Tax Total : $" + taxablePurchase);

        int count = register.getCountItems();
        System.out.println("Number of purchases : " + count);

        double change = register.giveChange();

        System.out.println("Change due : $" + change);

    }
}
