package com.iit.sanjula.Tutorial2a;

public class CashRegister {
    private double purchase;
    private double payment;

    /* Creating a cash register with no money in it */
    public CashRegister(){
        purchase = 0;
        payment = 0;
    }

    public void recordPurchase(double amount){
        double total = purchase + amount;
        purchase = total;
    }

    public void recordPayment(int unitCount, MonetaryUnit unitType){
        payment = payment + unitCount * unitType.getValue();
    }

    public double giveChange(){
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }

}
