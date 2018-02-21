package com.iit.sanjula.tutorial1.ExtraQuestions;
/* A cash register totals up sales and computes change due**/
public class CashRegister {
    private double purchase;
    private double payment;
    private String receipt;
    private int salesCount;
    private int countItems;
    private double taxablePurchase;
    private double taxRate;

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
}
