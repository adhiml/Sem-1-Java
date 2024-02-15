/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saada
 */
//6. Write a java program that print the circumference of a circle. The input of the 
//program is diameter. Display the result in three decimal places. (Note  = Math.PI)

import java.lang.Math; 
public class T2Q6 {
    public static void main(String[] args)
    {
        double diameter = 11.8;
        double radius = diameter/2;
        double circumferences;

        circumferences = radius*Math.PI*2;
        System.out.printf("%5.3f\n",circumferences);
        
//      final double pi = 3.142;
//      circumferences = radius*pi*2;
    }
}
