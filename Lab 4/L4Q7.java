/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
public class L4Q7 {
    public static void main(String[] args)
    {
        Scanner g = new Scanner(System.in);
        int month = 0;
        double Principal = 0,Interest = 0, unpaidBalance = 0,totalInterest = 0;
        System.out.print("Enter principal amount:");
        double principalAmount = g.nextFloat();
        
        System.out.print("Enter interest in %:");
        double InterestRate = g.nextFloat();
        
        System.out.print("Enter total number of month(s):");
        int monthTotal = g.nextInt();
        
        double monthlyRate = InterestRate/(12 * 100);
        double monthlyPayment = (principalAmount * monthlyRate)/(1 - Math.pow(1 + monthlyRate,-monthTotal));
        
//        Principal = (double) (1-(InterestRate/100))*monthlyPayment;
//        
//        Interest = (double) (InterestRate/100)*monthlyPayment;
//        
//        unpaidBalance = (double) monthlyPayment - Principal;
//        
//        totalInterest += (double) Interest;
        
        System.out.println("Month \t Monthly Payment \t Principal \t Interest \t Unpaid Balance \t Total Interest");
        
        for (month = 1; month <= monthTotal; month++)
        {
            Principal = monthlyPayment * Math.pow(1 + monthlyRate,-(1 + monthTotal-month));
            Interest = monthlyPayment - Principal;
            unpaidBalance = principalAmount - Principal;
            totalInterest += (double) Interest;

            System.out.print(month);
            System.out.printf(" \t %.2f",monthlyPayment);
            System.out.printf(" \t\t %.2f",Principal);
            System.out.printf(" \t %.2f",Interest);
            System.out.printf(" \t\t %.2f",unpaidBalance);
            System.out.printf(" \t\t %.2f",totalInterest);
            System.out.println();
        }
    }
}

