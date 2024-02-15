/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;

/**
 *
 * @author saada
 */
import java.util.Scanner;
public class L2Q1 {

    public static void main(String[] args) 
    {
        double Fahrenheit, Celsius;
        System.out.print("Please enter a temperature in Fahrenheit:");
        Scanner temp = new Scanner(System.in);
        Fahrenheit = temp.nextDouble();
        
        Celsius = (Fahrenheit-32) / 1.8;
        System.out.print("The temperature is ");
        System.out.printf("%.2f",Celsius);
        System.out.println(" ");
        
        System.out.printf("The value in Celsius is: %.2f Celsius%n", Celsius);
    }
    
}
