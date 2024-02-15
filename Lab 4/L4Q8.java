/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Random;
public class L4Q8 {
    private static boolean isPrime(int prime)
    {
        if (prime < 2)
            return false;
        
        for (int i = 2; i <= Math.sqrt(prime);i++)
        {
            if (prime%i == 0)
                return false;
        }
        
        return true;
    }
    
    public static void main(String[] args)
    {
        Random g = new Random();
        int n = g.nextInt(101);
        
        int prime = 2; // 1 and 0 is not prime number
        System.out.print("The generation of the first " + n + " prime numbers.\n");
        System.out.print("The prime numbers: ");
        
        for (int count = 1;count <= n;prime++)
        {
                if (isPrime(prime))
                {
                    System.out.print(prime + " ");
                }
                count++;
        }
        
        System.out.println();
    }
}


