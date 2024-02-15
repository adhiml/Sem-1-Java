/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;
public class L4Q6 {
    public static void main(String[] args)
    {
        Random g = new Random();
        int num = g.nextInt();
        int n = 0;
        String numString = Integer.toString(num);
        int length = numString.length();
        
        if (num < 0)
            num =  num * -1;
        
        while (n < length)
            n++;
        
        System.out.println("The integer:" + num);
        System.out.println("The number of digit in the integer:" + n);
    }
    
}
