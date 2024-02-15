


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.*;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.Random;

public class T7Q1ab {
    public static void main (String [] args)
    {
        
///////////////////////////////////// a. ///////////////////////////////////////
        
        Random g = new Random();
        int num = 0, i = 0, k =0, n =0;
        
        try
        {
            BufferedWriter input = new BufferedWriter(
                    new FileWriter ("integer.txt"));
            
            while (i < 10)
            {
                num = g.nextInt(1001);
                input.write(num + "\n");
                i++;
            }
            
            input.close();
        } catch (IOException ex){
            System.out.println("Problem with output file.");}
        
///////////////////////////////////// b. ///////////////////////////////////////

        int [] number = new int [10];
        System.out.println("From txt File:");
        try 
        {
            BufferedReader output = new BufferedReader( 
                    new FileReader ("integer.txt"));
            
            while (n < 10) // while (true) = runs forever
            {
                    number[n] = Integer.parseInt(output.readLine());
                    System.out.print(number [n] + " ");
                    n++;
            }
            
            output.close();
        } catch (IOException ex){
            System.out.println("Problem with input file.");}
        
        System.out.println("\nLargest Number:" + largest(number));

    }
    
    public static int largest (int array[])
    {
        int Max = Integer.MIN_VALUE;
        
        for (int i = 0; i < array.length;i++)
        {
            if (array[i] > Max)
                Max = array[i]; 
        }
        
        return Max;
    }
}
