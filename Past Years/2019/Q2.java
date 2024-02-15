/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyears.PastYear2019;

import java.util.Random;
import java.util.Scanner;

public class Q2 {
    public static void main (String [] args) {
       
        Scanner s = new Scanner (System.in);
        System.out.print("Enter N: ");
        int n = s.nextInt();
        
        int[][] m1 = generateMatrix(n);
        int[][] m2 = generateMatrix(n);
        
        System.out.println("Matrix A: ");
        displayMatrix(m1, n);
        
        System.out.println("\nMatrix B: ");
        displayMatrix(m2, n);
       
        System.out.println("\nSum: ");
        displayMatrix(addMatrix(m1, m2, n), n);
        
        System.out.println("\nProduct: ");
        displayMatrix(productOfMatrix(m1, m2, n), n);
        System.out.println("");
       
    }
    
    public static int [][] generateMatrix (int n) {
        
        Random r = new Random ();
        
        int [][] matrix = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = r.nextInt(10);
            }
        }
        
        return matrix;
    }
    
    public static void displayMatrix (int[][] m, int n) {
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static int[][] addMatrix (int[][] m1, int[][] m2, int n) {
        
        int[][] sum = new int [n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }
        
        return sum;
    }
    
    public static int[][] productOfMatrix (int[][] m1, int[][] m2, int n) {

        int[][] product = new int [n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                product[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        
        return product;
    }
}
