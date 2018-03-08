package com.iit.sanjula.Practice;

//  File: Bank2.java

//  Data file oriented version of the Bank class

//  The printList() method prints the list of accounts to a data file, as
//  well as to the screen

//  Note that, at line 48, no path is specified for the output file,
//  "BankAccounts.out."  Therefor, the file will be created in your
//  NetBeans project folder (not in the src folder or any other sub-folder)

//  Note: This class depends on the Align class to format output

import java.util.ArrayList ;
import java.io.PrintWriter ;
import java.io.IOException ;

/**
 This bank contains a collection of bank accounts.
 */
public class Bank
{
    private ArrayList<BankAccount> accounts ;  // a list of BankAccount objects

    /**
     Constructs a bank with no bank accounts.
     */
    public Bank()
    {
        accounts = new ArrayList<BankAccount>() ;
    }

    /**
     Adds an account to this bank.
     @param a the account to add
     */
    public void addAccount(BankAccount a)
    {
        accounts.add(a) ;		// calls "add" method of ArrayList class
    }

    /**
     * Print data for all accounts to the screen and to an output file
     */
    public void printList() throws IOException
    {
        // create output file in default folder
        PrintWriter toFile = new PrintWriter("BankAccounts.out");

        // print headings to screen
        System.out.printf("%15s%20s%n", "Account Number", "Account Balance");

        System.out.printf("%15s%20s%n", "==============", "===============");

        // print headings to file
        toFile.printf("%15s%20s%n", "Account Number", "Account Balance");

        toFile.printf("%15s%20s%n", "==============", "===============");

        // for each account in this bank
        for (int i = 0; i < accounts.size(); i++)
        {
            BankAccount current = accounts.get(i);	  // get next account

            // print account number and balamce to screen
            System.out.printf("%15s     $%14.2f%n", current.getAccountNumber(),
                    current.getBalance());

            // print account number and balamce to file
            toFile.printf("%15s     $%14.2f%n", current.getAccountNumber(),
                    current.getBalance());
        }

        toFile.close();	// always remember to close file!
    }

    /**
     Gets the sum of the balances of all accounts in this bank.
     @return the sum of the balances
     */
    public double getTotalBalance()
    {
        double total = 0;

        // for each account in this bank
        for ( int i = 0 ; i < accounts.size() ; i++ )
        {
            BankAccount current = accounts.get( i ) ;	// get the account
            total = total + current.getBalance() ;		// add its balance to accum
        }
        return total ;
    }

    /**
     Counts the number of bank accounts whose balance is at
     least a given value.
     @param atLeast the balance required to count an account
     @return the number of accounts having least the given balance
     */
    public int count(double atLeast)
    {
        int matches = 0 ;
        for ( int i = 0 ; i < accounts.size() ; i++ )
        {
            BankAccount current = accounts.get( i ) ;	// get the account
            if (current.getBalance() >= atLeast) 	    // found one...
                matches++ ;						        // ...increment counter
        }
        return matches ;
    }

    /**
     Linear search to find a bank account with a given account number.
     @param target the number to find
     @return the account with the given number, or null if there
     is no such account
     */
    public BankAccount find(String target)
    {
        for ( int i = 0 ; i < accounts.size() ; i++ )
        {
            BankAccount current = accounts.get( i ) ;		   // get the account
            String accountNum = current.getAccountNumber()	;  // get account number
            if ( accountNum.equals(target) )  				   // found a match
                return current ;
        }
        return null ; // No match in the entire array list
    }

    /**
     Gets the bank account with the largest balance.
     @return the account with the largest balance, or null if the
     bank has no accounts
     */
    public BankAccount getMaximum()
    {
        if (accounts.size() == 0) 		// if no accounts, return null
            return null;

        // assume first account is the largest
        BankAccount largestYet = accounts.get(0) ;

        // for all other accounts
        for ( int i = 1; i < accounts.size(); i++ )
        {
            BankAccount current = accounts.get(i) ;		// get next account
            // is current account > highest so far?
            if (current.getBalance() > largestYet.getBalance())
                largestYet = current ;
        }
        return largestYet ;
    }
}
