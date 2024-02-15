/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import java.util.Random;

public class L6Q3 {
    public static void main (String [] args)
    {
        Random g = new Random();
        
        int[] array =  new int[10];
        
        for (int i = 0; i < 10; i++)
        {
            array[i] = g.nextInt(21);
            System.out.print(array[i] + " ");
        }
        
        System.out.println();
        reverseArray(array);
    }
    
    public static void reverseArray (int array[])
    {
        // try array
        for (int n = 9; n > -1; n--)
            System.out.print(reverseNum(array[n]) + " ");
    }
    
    public static int reverseNum (int g)
    {
        int remainder;
        int reverse = 0;
        while (g != 0)
        {
            remainder = g % 10;
            reverse = reverse * 10 + remainder;
            g /= 10;  
        }
        
        return reverse;
    }
}
