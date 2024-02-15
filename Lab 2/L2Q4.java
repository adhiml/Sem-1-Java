/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saada
 */
public class L2Q4 {
    public static void main(String[] args)
    {
        int seconds = 123456;
        double minutes, hours;
        
        hours = seconds / 3600;
        minutes = seconds / 60;
        
        System.out.printf(seconds + " seconds in minutes is:%.2f", minutes);
        System.out.println(" ");
        System.out.printf(seconds + " seconds in hours is:%.2f %n", hours);
    }
}
