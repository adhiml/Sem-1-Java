/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saada
 */
public class T4Q3 {
    
    static class fibonacci {
    public static int fib(int n)
    {
        if (n > 2)
           return fib(n-1) + fib(n-2);
        else
            return n;
    }
    }
    public static void main (String [] args)
    {
        int n = 0;
        while (n < 10) 
        {
            System.out.print(fibonacci.fib(n) + " ");
            n++;
        }
        
    }
    
}
