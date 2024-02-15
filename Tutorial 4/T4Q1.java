/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saada
 */
import java.util.Random;
import java.util.Scanner;
public class T4Q1 {
    public static void main(String[] args)
    {

///////////////////////////////////// a. ///////////////////////////////////////
        
        System.out.println("Question a.\n");
        
        for (int n = 0; Math.pow(n,3) < 2000;n++)
        {
            System.out.println("Integer n:" + n);
            System.out.println("n^3 = " + Math.pow(n,3));
        }
        
///////////////////////////////////// b. ///////////////////////////////////////
        
        System.out.println("\nQuestion b.\n");
                
        for (int n = 0; n <= 12;n++)
        {
            System.out.println("Integer n:" + n);
            System.out.println("n^2 = " + Math.pow(n,2));
        }
      
///////////////////////////////////// c. ///////////////////////////////////////
        
        System.out.println("\nQuestion c.\n");
        
        Random g = new Random();
        
        for (int i = 1; i < 5; i++)
        {
            int matrix1 = g.nextInt(101);
            int matrix2 = g.nextInt(101);
            int matrix3 = g.nextInt(101);
            int matrix4 = g.nextInt(101);
            int matrix5 = g.nextInt(101);
            System.out.println(matrix1 + " " + matrix2 + " " + matrix3 + " " + matrix4 + " " + matrix5);      
        }
        
///////////////////////////////////// d. ///////////////////////////////////////
        
        System.out.println("\nQuestion d.\n");
        
        System.out.print("Enter an integer:");
        Scanner d = new Scanner(System.in);
        int num = d.nextInt();
        int sum = 0;
        
        for (int i = 0; i <= num; i++)
        {
            sum += i;
        }
        
        System.out.println("Total sum:" + sum);

///////////////////////////////////// e. ///////////////////////////////////////
        
        System.out.println("\nQuestion e.\n");
        
        float total =0;
        
        for (int i = 1, n = 25; i <= 25; i++, n--) 
                total += (float) i/n;

        System.out.printf("Total:%.2f" ,total);
    }
}
