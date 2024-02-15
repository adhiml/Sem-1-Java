/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

import java.util.Scanner;

public class L8Q4 {
    public static void main (String [] args) {
        Fraction g = new Fraction ();
        
        g.input();
        g.display();
    }
    
}

class Fraction {
    
    private int numerator;
    private int denominator;
    
    Fraction () {
         // no need to intialize the variables here since we will use the input method
//        this.numerator = numerator;
//        this.denominator = denominator;
    }
    
    public void input () {
    
    Scanner g = new Scanner (System.in);
    
        System.out.print("Enter the numerator: ");
        this.numerator = g.nextInt();
        
        System.out.print("Enter the denominator: ");
        this.denominator = g.nextInt();
    }
    
    public int getNumerator () {
        return numerator;
    }
    
    public int getDenominator () {
        return denominator;
    }
    
    // setter method will initialize the user inputs
    
    public void setNumerator (int numerator) {
        this.numerator = numerator;
    }
    
    public void setDenominator (int denominator) {
        this.denominator = denominator;
    }
    
    public int gcd (int numerator, int denominator)
    {
        if (numerator == 0)
            return denominator;
        
        return gcd(denominator % numerator,numerator);
    }
    
    public void display () {
        
        int gcd = gcd(getNumerator(),getDenominator());
        
        // to display the reduced form of the fraction
        int reducedN = getNumerator() / gcd;
        int reducedD = getDenominator() / gcd;
        System.out.println("Fraction: " + reducedN + "/" + reducedD );
        System.out.println("GCD: " + gcd);
        
    }
}