/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6;


import java.util.Scanner;
import java.util.Random;

public class T6Q1 {
    
    private static int highest = Integer.MIN_VALUE;
    
    public static void main(String[] args) 
    {
            Scanner g = new Scanner(System.in);
            
            System.out.print("Question a.\n");
            
            for (int i = 0; i < 3; i++)
            {
                System.out.print("Enter an integer:");
                int n = g.nextInt();
                maxNum(n);
            }
            
            System.out.println("The maximum number is " + highest);
            
            
            System.out.print("\nQuestion b.\n");
            
            System.out.print("Enter an integer:");
            int k = g.nextInt();
            squareNum(k);
            System.out.println("The number " + k + (squareNum(k)? " is a square number." : " is not a square number."));
            
            
            System.out.print("\nQuestion c.\n");
            
            System.out.print("For C(n,k), enter n:");
            int n = g.nextInt();
            System.out.print("For C(n,k), enter k:");
            int K = g.nextInt();
            
            if (n < K || K < 0)
                System.out.println("The input is invalid.");
            else
                System.out.println("C(n,k) = n! / (k! (n-k)! = " + combination(n,K));


              System.out.print("\nQuestion d.\n");
              System.out.print("Enter the parameters:");
              int parameters = g.nextInt();
              
              if (pentNum (parameters))
                  System.out.print(parameters + " is a pentagonal number\n");
              else
                  System.out.println(parameters + " is not a pentagonal number\n");
              
              
             System.out.print("\nQuestion e.\n"); 
             
             System.out.print("Enter a statement containing digits and alphabets:");
             String statement = g.nextLine();
             
             System.out.println("Number of digits:" + digits(statement));
             System.out.println("Number of letters:" + alphabets(statement));
             
             
             System.out.print("\nQuestion f.\n"); 
             
             random (0);
             

             System.out.print("\nQuestion g.\n"); 
             
             System.out.print("Enter radius:");
             int radius = g.nextInt();
                     
             area (radius);
             System.out.println();
             circumference(radius);
             System.out.println();

               System.out.print("\nQuestion h.\n"); 
               
               twice (0);
    }
    
//////////////////////////////////////// a. ////////////////////////////////////  
    
    public static int maxNum (int n)
        {
            if (n > highest)
                highest = n;
            return highest;
        }
//////////////////////////////////////// b. ////////////////////////////////////
    
    public static boolean squareNum (int k)
    {
        int sqrt = (int) Math.sqrt(k);
        return sqrt*sqrt == k;
    }
    
//////////////////////////////////////// c. ////////////////////////////////////
    
    public static int combination (int n, int K)
    {
        // = 1 because wanna multiply, if = 0, result would be 0
        int numerator =1;
        int denominator =1;
        
        // because we tryna find "k" combinations for "n" items
        // so limiting factor is K
        for (int i = 0; i < K; i++)
        {
             numerator *= (n - i);
             denominator *= (i + 1);
        }
        return numerator / denominator;
    }
    
//////////////////////////////////////// d. //////////////////////////////////// 
 
    public static boolean pentNum (int parameters)
    {
        int m = 0;
        int i = 1;
        //the code will calculate the formula until 
        do 
        {
            // pentagonal formula
            m = (i * (3*i - 1)) / 2;
            i++;
            
        } while (m < parameters);
        
        return (m == parameters);
    }
    
//////////////////////////////////////// e. ////////////////////////////////////
    
    public static int digits (String statement)
    {
        int counter = 0;
        for (int i = 0; i < statement.length();i++)
        {
            if (statement.charAt(i) >= '0' && statement.charAt(i) <= '9')
              counter++;
        }
        
        return counter;
    }
    
    public static int alphabets (String statement)
    {
        int counter = 0;
        for (int i = 0; i < statement.length();i++)
        {
            if ((statement.charAt(i) > 64 && statement.charAt(i) < 91) || (statement.charAt(i) > 96 && statement.charAt(i) < 123))
                counter++;
        }
        
        return counter;
    }
    
//////////////////////////////////////// f. ////////////////////////////////////
    
    public static void random (int n)
    {
        Random g = new Random();
        for ( int i = 0; i < 10; i++)
        {
            n = g.nextInt(101);
            
            // use array cause printing out != return
            System.out.print(n + " ");
        }
    }
    
//////////////////////////////////////// g. ////////////////////////////////////    
    
   // wrong cause it's  supposed to return stuff, not print 
    // use array,so can pass by reference, so in way it kinda return la
    
    public static void area (float radius)
    {
        double area;
        area = Math.PI * Math.pow(radius,2);
        System.out.printf("Area is %.2f", area);
    }
    
    public static void circumference (float radius)
    {
        double circumference;
        circumference = 2 * Math.PI * radius;
        System.out.printf("Circumference is %.2f", circumference);
    }
    
//////////////////////////////////////// h. ////////////////////////////////////
    
    public static void twice (int n)
    {
        Random g = new Random();
        int m = -1;
        
        while (true)
        {
            n = g.nextInt(11);
            System.out.println("Generated number is " + n);
            
            if(n == m)
            {
                System.out.print("The number " + m + " is generated twice.");
                break;
            }
            
            m = n;
        }
        
        // not exactly right
        // have to use array for better precision
    }
}
