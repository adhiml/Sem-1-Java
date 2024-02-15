/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class L5Q6 {
    
/// This code cannot display zero at empty array yet
    
    public static void main (String [] args)
    {
        Scanner g = new Scanner (System.in);
        
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int row = g.nextInt();
        System.out.print("The Pascal Triangle of (" + row + ") row(s)");
        
        int[][] matrix = new int[row][];
        
        for (int i = 0; i < row; i++)
        {
            matrix[i] = new int[i +1];
            
            for (int n = 0; n <= i; n++)
            {
                matrix[i][n] = pascalTriangle(i, n);
            }
            System.out.println();
        }
        
        for (int i = 0; i < row; i++)
        {
            for (int n = 0; n <= i; n++)
            {
                System.out.print(" " + matrix[i][n] + " ");
            }
            System.out.println();
        }
        
    }
    
    public static int pascalTriangle (int row, int column)
        {
            if ( column == 0 || row == 0)
                return 1;
            else
                return pascalTriangle(row - 1, column - 1) + pascalTriangle(row -1,column);
        }
}
