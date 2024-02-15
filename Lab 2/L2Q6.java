/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saada
 */
import java.util.Scanner;
public class L2Q6 {
    // kalau nak letak exponent = %e
    public static void main(String[] args)
    {
        //Alt 1
        double M1 = 55500/1000;
        double initialTemp1 = (38.3-32)/1.8;
        double finalTemp1 = (50.9-32)/1.8;
        
        double Q1 = M1*(finalTemp1 - initialTemp1)*4184;
        System.out.printf("The energy is: %e joules %n", Q1);
        
        //Alt 2
        System.out.println(" ");
        
        System.out.print("Weight(g):");
        Scanner weight = new Scanner(System.in);
        double M = weight.nextDouble()/1000;
        
        System.out.print("Inital temperature(F):");
        Scanner fahrenheit1 = new Scanner(System.in);
        double initialTemp = (fahrenheit1.nextDouble()-32)/1.8;
        
        System.out.print("Final temperature(F):");
        Scanner fahrenheit2 = new Scanner(System.in);
        double finalTemp = (fahrenheit2.nextDouble()-32)/1.8;
        
        double Q = M*(finalTemp - initialTemp)*4184;
        System.out.printf("The energy is: %e joules %n", Q);

    }
}
