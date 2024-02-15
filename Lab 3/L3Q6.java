/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saada
 */

import java.util.Scanner;
public class L3Q6 {
    public static void main(String[] args)
    {
        System.out.print("Please enter the radius of the circle:");
        Scanner g = new Scanner(System.in);
        int radius = g.nextInt();
        
        System.out.print("Coordinate x:");
        int x = g.nextInt();
        
        System.out.print("Coordinate y:");
        int y = g.nextInt();
        
        if (x < 0)
            x = x*-1;
        if (y < 0)
            y = y*-1;
        
        if ( y <= radius && x <= radius)
            System.out.print("The coordinate is within the circle.");
        else
            System.out.print("The coordinate is outside the circle.");
        
    }
}
