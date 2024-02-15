/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */





public class L6Q4 {
    public static void main (String [] args)
    {
        int a, b;
        int result;
        
        a = 200;
        b = 625;
        result = gcd (a,b);
        System.out.println("GCD of (" + a + "," + b + ") = " + result);
        
        a = 24;
        b = 8;
        result = gcd (a,b);
        System.out.println("GCD of (" + a + "," + b + ") = " + result);
    }
    
    public static int gcd (int a, int b)
    {
        if (a == 0)
            return b;
        
        return gcd(b % a,a);
    }
    
}
