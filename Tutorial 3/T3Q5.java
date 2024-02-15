/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saada
 */
import java.util.Scanner;
public class T3Q5 {
    public static void main (String [] args)
    {
//Write the java statements that determine whether the Leap year. A Leap year is 
//divisible by 4 but not by 100. However, a Leap year is also divisible by 400
        
        int year;
        System.out.print("Please enter the year (eg 2023):");
        Scanner g = new Scanner(System.in);
        year = g.nextInt();
        
        if ( (year%4 == 0 && year%100 != 0 ) || year%400 == 0) // can also use boolean
            System.out.print("The year " + year +" is a leap year.\n");
        else
            System.out.print("The year " + year +" is not a leap year.\n");
    }
    
}
