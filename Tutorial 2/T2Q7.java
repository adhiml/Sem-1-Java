/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saada
 */
//7. Write a java program that converts inches to meters. (Given 1 inch equals to 2.54 
//centimeters). Print the output in two decimal places

public class T2Q7 {
    public static void main(String[] args)
    {
        double inch = 20.17;
        double meter = inch * 0.0254;
        
        System.out.printf("%2.2f\n", meter);
    }
}
