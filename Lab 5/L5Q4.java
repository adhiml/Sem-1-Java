/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Random;

public class L5Q4 {
    public static void main (String [] args)
    {
        int [][] array = new int [3][3];
        Random g = new Random();
        
        for(int rows = 0; rows < 3; rows++)
        {
            for(int column = 0; column < 3; column++)
            {
                array[rows][column] = g.nextInt(10);
            }
        }
        
        System.out.println("3 by 3 Matrix:");
        
        for(int rows = 0; rows < 3; rows++)
        {
            for(int column = 0; column < 3; column++)
            {
                System.out.print(" " + array[rows][column] + " ");
            }
            System.out.println();
        }
        
        System.out.println("After rotates 90 degrees clockwise:");
        
        for(int rows = 0; rows < 3; rows++)
        {
            for(int column = 2; column > -1; column--)
            {
                System.out.print(" " + array[column][rows] + " ");
            }
            System.out.println();
        }
    }
}
