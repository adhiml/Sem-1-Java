/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

import java.util.Scanner;

public class L8Q2 {
    public static void main (String [] args) {
        
        BankAcc g = new BankAcc("Huhu","78787-5645", 520.50,87.0,89);
        g.display();
        
        System.out.println("");
    }
}


class BankAcc {
    private String name;
    private String IC;
    private double amount;
    private double deposits;
    private double withdrawls;
    
    BankAcc (String name, String IC, double amount, double deposits, double withdrawls) {
        
        this.name = name;
        this.IC = IC;
        this.amount = amount;
        this.deposits = deposits;
        this.withdrawls = withdrawls;
    }
    
    public void display () {
        System.out.println("Name: " + name);
        System.out.println("IC: " + IC);
        System.out.printf("Current Account Balance: %.2f", amount);
        System.out.println("");
        
        deposits(amount,deposits);
        withdrawls(amount, withdrawls);
    }
    
    public void deposits (double amount, double deposits) {
        
        System.out.println("\nDeposits amount: " + deposits);
        amount += deposits;
        System.out.println("Your deposits transactions is successful!");
        System.out.printf("Current Account Balance: %.2f",amount);
    }
    
    public void withdrawls (double amount, double withdrawls) {
        
        System.out.println("");
        if ( withdrawls > amount ) {
            System.out.println("\nWithdrawls amount: " + withdrawls);
            System.out.println("Account balance is not enough!");
        }
        else if (withdrawls <= amount && withdrawls != 0)
        {
            System.out.println("\nWithdrawls amount: " + withdrawls);
            amount -= withdrawls;
            System.out.println("Your withdrawls transactions is successful!");
            System.out.printf("Current Account Balance: %.2f",amount);
        }
    }
    
    
    
}