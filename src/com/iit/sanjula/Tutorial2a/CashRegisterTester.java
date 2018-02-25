package com.iit.sanjula.Tutorial2a;

public class CashRegisterTester {
    public static void main(String[] args){
        final double DOLLAR_VALUE = 1.0;
        final double QUARTER_VALUE = 0.25;
        final double DIME_VALUE = 0.1;
        final double NICKEL_VALUE = 0.05;

        CashRegister register = new CashRegister();
        register.recordPurchase(28.92);
        register.recordPayment(26, new MonetaryUnit(DOLLAR_VALUE, "Dollar Bill"));
        register.recordPayment(3, new MonetaryUnit(QUARTER_VALUE, "Quarter"));
        register.recordPayment(20, new MonetaryUnit(DIME_VALUE, "Dime"));
        register.recordPayment(20, new MonetaryUnit(NICKEL_VALUE, "Nickel"));

        double change = register.giveChange();
        System.out.println("Change is " + change);


    }
}
