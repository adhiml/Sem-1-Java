/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saada
 */

import java.util.Scanner;
public class L3Q5 {
    public static void main (String [] args)
    {
        System.out.print("""
                         y=(af-ec)/(ad-bc)
                         x = (ed-bf)/(ad-bc) 
                         """);
        
        
        System.out.print("\nEnter a:");
        Scanner g = new Scanner(System.in);
        float a = g.nextFloat();
        
        System.out.print("Enter b:");
        float b = g.nextFloat();
        
        System.out.print("Enter c:");
        float c = g.nextFloat();
        
        System.out.print("Enter d:");
        float d = g.nextFloat();
        
        System.out.print("Enter e:");
        float e = g.nextFloat();
        
        System.out.print("Enter f:");
        float f = g.nextFloat();
        
        float x = ((e*d)-(b*f))/((a*d)-(b*c));
        float y = ((a*f)-(e*c))/((a*d)-(b*c));
        
        if(((a*d)-(b*c)) == 0)
            System.out.print("\nThe equation has no solution.");
        else
        {
            System.out.println("\nx:" + x);
            System.out.println("y:" + y);
        }
        
    }
    
}
