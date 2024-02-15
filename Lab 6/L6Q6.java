/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


// A palindromic number is a number (such as 16461) that remains the same when its digits are reversed
// A palindromic prime is a prime number that is also a palindromic number
// An emirp (prime spelled backwards) is a prime number that results in a different prime when its decimal digits are reversed. 


public class L6Q6 {
    public static void main (String [] args)
    {
        printAnswer(20);
    }
  
// Method to determine if a number is a prime
    
    public static boolean prime (int num)
    {
        if ( num < 2)
            return false;
        if (num == 2)
            return true;
        
        for (int i = 3; i <= Math.sqrt(num); i += 2) // checking prime formula mechanism
        {
            if (num % i == 0)
                return false;
        }
        
        return true;
    }
    
    
    public static int reverse (int num)
    {
        int reversed = 0;
        while ( num > 0)
        {
            reversed = reversed * 10 + num % 10; 
            num /= 10; 
            // 123 divides by 10 = 12 becuse int only
        }
        
        return reversed;
    }
    
// Let's say you have the number num = 123.
//
//First iteration (rightmost digit):
//
//num % 10 gives you the rightmost digit, which is 3.
//reversed * 10 + num % 10 is initially 0 * 10 + 3, so reversed becomes 3.
//Second iteration (middle digit):
//
//num % 10 now gives you the next digit to the left, which is 2.
//reversed * 10 + num % 10 becomes 3 * 10 + 2, so reversed becomes 32.
//Third iteration (leftmost digit):
//
//num % 10 now gives you the leftmost digit, which is 1.
//reversed * 10 + num % 10 becomes 32 * 10 + 1, so reversed becomes 321.
    
    
// Method to check if palindromic
    
    public static boolean palindromic (int num)
    {
        return num == reverse(num);
    }


// Method to check if emirp
    
    public static boolean emirp (int num)
    {
        return prime(num) && prime(reverse(num)) && !palindromic(num);
    }
    
    
// Method to determine if a number is a palindromic prime
    
    public static boolean isPalinPrime(int num)
    {
        return prime(num) && palindromic(num);
    }
    
// Method to display palindromic prime and emirp
    
    public static void printAnswer (int n)
    {
        int count = 0;
        int num = 2;
        
        while (count < n)
        {
            if (isPalinPrime (num))
            {
                System.out.println("Palindromic Prime: " + num);
                count++;
            }
            if (emirp (num))
            {
                System.out.println("Emirp: " + num);
                count++;
            }    
            
            num++;
        }
    }
}
