/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saada
 */

import java.util.Random;

public class L2Q5 {
    public static void main (String[] args)
    {
        Random R = new Random();
        final int MAX = 10000;
        final int MIN = 0;
        
        int num = R.nextInt(MAX - MIN +1) + MIN;
        System.out.println("Random number:" + num);
        int sum = 0;
        
        while (num > 0)
        {
            sum += num % 10;
            num /= 10;
        }
        
        System.out.println("The sum of the digits is: " +sum);
    }
}
