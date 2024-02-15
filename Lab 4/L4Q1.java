/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;


import java.util.Scanner;
public class L4Q1 {
    public static void main (String [] args)
    {
        Scanner g = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int num = g.nextInt();
        System.out.print("The factors of " + num + ": ");
                        
        for (int y = 1; y <= num; y++ )
        {
            if (num%y == 0)
                System.out.print(y + " ");
        }
    }
}
