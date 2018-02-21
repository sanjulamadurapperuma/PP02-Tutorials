package com.iit.sanjula.tutorial2;

/* A cash register totals up sales and computes change due**/
public class CashRegister {

    private double purchase;
    private double payment;
    private String receipt;
    private int salesCount;
    private int countItems;
    private double taxablePurchase;
    private double taxRate;

    public static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.1;
    public static final double NICKEL_VALUE = 0.05;

    /*
        Constructs a cash register with no money in it
    **/

    public CashRegister(double tax) {
        taxRate = tax;
        purchase = 0;
        payment = 0;
        countItems = 0;
        receipt = "";
        salesCount = 0;
    }

    /**
     Records the sale of an item
     @param amount the price of the item
     */

    public void recordPurchase(double amount){
        purchase = purchase + amount;
        receipt = receipt.concat("$" + amount + "\n");
        countItems++;
        salesCount++;
    }
    /**
     Processes a payment received from the customer.
     @param amount the amount of the payment
     */

    public void receivePayment(double amount){
        payment = payment + amount;
    }

    /** Computes the change due and resets the machine for the next customer.
     * @return the change due to the customer
     */

    public String printReceipt(){
        return receipt + "Total : $" + purchase;
    }

    public double getSalesTotal(){
        return purchase;
    }

    public int getSalesCount(){
        return salesCount;
    }

    public void reset(){
        purchase = 0;
        payment = 0;
        receipt = "";
        salesCount = 0;
        countItems = 0;
        taxablePurchase = 0;
    }

    public int getCountItems() {
        return countItems;
    }

    public void recordTaxablePurchase(double amount){
        taxablePurchase = taxablePurchase + amount;
    }

    public double getTotalTax(){
        return taxablePurchase * taxRate / 100;
    }

    public double giveChange(){
        double change = payment - purchase - taxablePurchase;
        purchase = 0;
        payment = 0;
        return change;
    }

    public void receivePayment(int coinCount, Coin coinType){
        payment += coinCount * coinType.getValue();
    }

//    public void giveChange(Coin coinType){
//        int dollars;
//        int quarters;
//        int dimes;
//        int nickels;
//        int pennies;
//
//        double changeDue = payment - purchase;
////        int change = (int) (changeDue / coinType.getValue());
//        int change = (int) (changeDue * 100);
//        dollars = (int) Math.floor(change / 100);
//        System.out.println("Dollars : " + dollars);
//        change = change % 100;
//
//        quarters = change / 25;
//        change = change % 25;
//
//        dimes = change / 10;
//        change = change % 10;
//
//        nickels = change / 5;
//        change = change % 5;
//
//        pennies = change;
//
//
//        System.out.println("Quarters : " + quarters);
//        System.out.println("Dimes : " + dimes);
//        System.out.println("Nickels : " + nickels);
//        System.out.println("Pennies : " + pennies);
//
//    }

    public void giveChange(Coin coinType){
        int hundredDollars;
        int fiftyDollars;
        int twentyDollars;
        int tenDollars;
        int fiveDollars;
        int oneDollar;
        int quarters;
        int dimes;
        int nickels;
        int pennies;

        double changeDue = payment - purchase;
//        int change = (int) (changeDue / coinType.getValue());
        int change = (int) (changeDue * 10000);
        hundredDollars = (int) Math.floor(change / 10000);
        change = change % 10000;

        fiftyDollars = (int) Math.floor(change / 5000);
        change = change % 5000;

        twentyDollars = (int) Math.floor(change / 2000);
        change = change % 2000;

        tenDollars = (int) Math.floor(change / 1000);
        change = change % 1000;

        fiveDollars = (int) Math.floor(change / 500);
        change = change % 500;

        oneDollar = (int) Math.floor(change / 100);

        change = change % 100;

        quarters = change / 25;
        change = change % 25;

        dimes = change / 10;
        change = change % 10;

        nickels = change / 5;
        change = change % 5;

        pennies = change;


        System.out.println("Hundred Dollar Bills : " + hundredDollars);
        System.out.println("Fifty Dollar Bills : " + fiftyDollars);
        System.out.println("Twenty Dollar Bills : " + twentyDollars);
        System.out.println("Ten Dollar Bills : " + tenDollars);
        System.out.println("Five Dollar Bills : " + fiveDollars);
        System.out.println("One Dollar Bills : " + oneDollar);
        System.out.println("Quarters : " + quarters);
        System.out.println("Dimes : " + dimes);
        System.out.println("Nickels : " + nickels);
        System.out.println("Pennies : " + pennies);
    }
}

