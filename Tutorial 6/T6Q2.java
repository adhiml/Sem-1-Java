/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6;

import java.util.Random;

public class T6Q2 {
    public static void main (String [] arsg)
    {
        Random g = new Random();
        
        int a = g.nextInt(101);
        System.out.println("Integer A:" + a);
        
         int b = g.nextInt(101);
        System.out.println("Integer B:" + b);
        
         int c = g.nextInt(101);
        System.out.println("Integer C:" + c);
        
        sort(a,b,c);
    }
    
    public static void sort(int a, int b, int c)
    {
        
        if (a <= b && a <= c && b <= c)
            System.out.println(a + " < " + b + " < " + c);
        if (b <= c && b <= a && c <= a)
            System.out.println(b + " < " + c + " < " + a);
        if (c <= a && c <= b && a <= b)
            System.out.println(c + " < " + a + " < " + b);
        if (a <= b && a <= c && c <= b)
            System.out.println(a + " < " + c + " < " + b);
        if (b <= c && b <= a && a <= c)
            System.out.println(b + " < " + a + " < " + c);
        if (c <= a && c <= b && b <= a)
            System.out.println(c + " < " + b + " < " + a);
    }
}
