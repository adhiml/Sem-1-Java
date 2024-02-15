/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saada
 */
import java.util.Scanner;
public class T3Q4 {
    
    public static void main(String [] args)
    {
// Write the java statements that used the if statement to find the biggest number among three given integers.
        
        System.out.print("Please enter an integer:");
        Scanner g = new Scanner(System.in);
        int x = g.nextInt();
        
        System.out.print("Please enter an integer:");
        int y = g.nextInt();
        
        System.out.print("Please enter an integer:");
        int z = g.nextInt();
        
        
        if (x > y && x > z)
            System.out.print(x + " is the largest number.");
        else if (y > x && y > z)
            System.out.print(y + " is the largest number.");
        else if (z > x && z > y)
            System.out.print(z + " is the largest number.");
        else if (x == y && x > z)
            System.out.print(x + " is the largest number.");
        else if (x == z && x > y)
            System.out.print(x + " is the largest number.");
        else if (y == z && y > x)
            System.out.print(y + " is the largest number.");
        else 
            System.out.print("The numbers enter are equal.");
        
//        if ( x >= y)
//        {
//            if ( x >= z)
//                System.out.print(x + " is the largest.");
//            else
//                System.out.print(z + " is the largest.");
//        }
//        else 
//        {
//            if (y >= z)
//                if (y >= x)
//                    System.out.print(y + " is the largest.");
//                else 
//                    System.out.print(x + " is the largest.");
//        }
    }
    
}
