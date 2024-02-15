/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saada
 */
import java.util.Scanner;
public class L3Q1 {
    public static void main ( String [] args)
    {
        System.out.print("Enter an integer:");
        Scanner g = new Scanner(System.in);
        int num1 = g.nextInt();
        
        System.out.print("Enter an integer:");
        Scanner h = new Scanner(System.in);
        int num2 = h.nextInt();
        
        System.out.print("""
                     1. Addition = +
                     2. Substarction = -
                     3. Multiplication = *
                     4. Division = /
                     5. Remainder = %
                         """);
        System.out.print("Enter the operand:");
        Scanner k = new Scanner(System.in);
        char operator = k.next().charAt(0);
        
        float result1 = 0;
        int result = 0;
        
        switch (operator)
        {
            case '+':
                result = num1 + num2;
                System.out.print("The result of " +num1 + " + " + num2 + " is " + result);
                break;
                
            case '-':
                result = num1 - num2;
                System.out.print("The result of " +num1 + " - " + num2 + " is " + result);
                break;
                
            case '*':
                result = num1 * num2;
                System.out.print("The result of " +num1 + " x " + num2 + " is " + result);    
                break;
                
            case '/':
                if (num2 != 0) //make sure got bracket if more than 1 statement
                {
                    result1 = num1 / num2;
                    System.out.print("The result of " +num1 + " / " + num2 + " is " + result1);   
                }
                else 
                    System.out.print("Error: Division by zero.");
                break;
                
            case '%':
                if (num2 != 0) //make sure got bracket if more than 1 statement
                {
                    result1 = num1%num2;
                    System.out.print("The remainder of " +num1 + " % " + num2 + " is " + result1);   
                }
                else 
                    System.out.print("Error: Division by zero.");
                break;
                
            default:
                System.out.print("Invalid operator. Please us '+', '-', '*', '/' pr '%'.");
        }
            System.out.println(" ");
    }
}
