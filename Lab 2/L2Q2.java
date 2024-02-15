/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saada
 */
import java.util.Scanner;
public class L2Q2 {
    public static void main(String [] args)
    {
        double P,D,R,Y,M;
        System.out.print("The price of the car:");
        Scanner price = new Scanner(System.in);
        P = price.nextDouble();
        
        System.out.print("The down payment of the car:");
        Scanner downPay = new Scanner(System.in);
        D = downPay.nextDouble();
        
        System.out.print("The interest rate in percentage of the car:");
        Scanner interest = new Scanner(System.in);
        R = interest.nextDouble();
        
        System.out.print("The loan duration in a year:");
        Scanner duration = new Scanner(System.in);
        Y = duration.nextDouble();
        
        M = (P-D) * (1 + R*Y/100) / (Y *12);
        System.out.printf("The monthlY payment is: %.2f %n", M);
        
    }
    
}
