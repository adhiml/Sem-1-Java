

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class T7Q1cd {
    public static void main (String [] args)
    {
        
        int k = 0, num = 0, n = 0;
        Random g = new Random ();
        int [] number = new int[10];
        
///////////////////////////////////// c. ///////////////////////////////////////

        try
        {
            BufferedWriter input = new BufferedWriter(
                    new FileWriter ("integer.dat"));
            
            while (k < 10)
            {
                num = g.nextInt(1001);
                input.write(num + "\n");
                k++;
            }
            
            input.close();
        } catch (IOException ex){
            System.out.println("Problem with output file.");}

///////////////////////////////////// d. ///////////////////////////////////////

        System.out.println("From binary file:");
        DataInputStream output = null;
        try 
        {
            output = new DataInputStream( 
                    new FileInputStream ("integer.dat"));
            
            
            while (n < 10)
            {
                try{
                    number[n] = Integer.parseInt(output.readLine());
                    System.out.print(number [n] + " ");
                    n++;
                } catch (EOFException e){
                    break;
                }
            }
            output.close();
        } catch (IOException ex){
            System.out.println("Problem with input file.");}
        
        System.out.println("\nAverage:" + average(number));
        
        }

    public static double average (int array[])
    {
        int sum = 0;
        
        for (int i = 0; i < array.length;i++)
        {
            sum += array[i];
        }
        
        return (double) sum/array.length;
    }
}
