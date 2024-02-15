/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;
import java.util.Random;

public class L5Q3 {
    public static void main(String [] args)
    {
        Scanner g = new Scanner(System.in);
        Random k = new Random();
        
        int totalHours = 0;
        int [] hours = new int[7];
        
        System.out.print("Enter a number of employee:");
        int employee = g.nextInt();
        
        for (int i = 1; i <= employee; i++)
        {
            System.out.println("Employee " + i);
            System.out.print("Hours work per day are: ");
            for (int r = 0; r < 7; r++)
            {
                hours [r] = k.nextInt( (8-1)+1);
                totalHours += hours [r];
                System.out.print(hours[i] + " ");
            }
             System.out.print("\nTotal hours work in a week is: " + totalHours);
            System.out.println("\n");
        }
        
    }
}
