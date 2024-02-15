/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyears.PY2020;

import java.util.Scanner;
import static java.lang.Math.*;
/**
 *
 * @author saada
 */
public class Q2 {
    public static void main (String [] args) {
        
        Scanner s = new Scanner(System.in);
        char d1, d2, d3, d4;
        
        int[] la_location1 = new int[3];
        int[] lo_location1  = new int[3];
        
        int[] la_location2 = new int[3];
        int[] lo_location2 = new int[3];
        
        
        double latitude1, latitude2, longitude1, longitude2, distance;
        
        System.out.println("Enter Location 1");
        System.out.print("Enter latitude direction (N, S): ");
        d1 = s.next().charAt(0);
        
        System.out.print("Enter Degree, Minute and Second: ");
        la_location1[0] = s.nextInt();
        la_location1[1] = s.nextInt();
        la_location1[2] = s.nextInt();
               
        System.out.print("Enter longitude direction (E, W): ");
        d2 = s.next().charAt(0);
        
        System.out.print("Enter Degree, Minute and Second: ");
        lo_location1[0] = s.nextInt();
        lo_location1[1] = s.nextInt();
        lo_location1[2] = s.nextInt();
        
        
        System.out.println("Enter Location 2");
        System.out.print("Enter latitude direction (N, S): ");
        d3 = s.next().charAt(0);
        
        System.out.print("Enter Degree, Minute and Second: ");
        la_location2[0] = s.nextInt();
        la_location2[1] = s.nextInt();
        la_location2[2] = s.nextInt();
        
        System.out.print("Enter longitude direction (E, W): ");
        d4 = s.next().charAt(0);
        
        System.out.print("Enter Degree, Minute and Second: ");
        lo_location2[0] = s.nextInt();
        lo_location2[1] = s.nextInt();
        lo_location2[2] = s.nextInt(); 
        
        latitude1 = degree(d1, la_location1);
        longitude1 = degree(d2, lo_location1);
        latitude2 = degree(d3, la_location2);
        longitude2 = degree(d4, lo_location2);
        
        System.out.printf("Location 1: %.6f Latitude, %.6f Longitude", latitude1,longitude1);
        System.out.printf("\nLocation 2: %.6f Latitude, %.6f Longitude", latitude2,longitude2);
        System.out.printf("\nDistance: %.2f KM",distance(latitude1, longitude1, latitude2, longitude2));
    }
    
    public static double degree (char direction, int[]info) {
        
        double flag = (direction == 'S' || direction == 'W')? -1:1;
        return (double) flag * (double)(info[0] + (info[1]*60 + info[2]) / (double)3600);
    }
    
    public static double distance (double la1, double lo1, double la2, double lo2) {
        
        double la_diff, lo_diff;
        
        if (la2 > la1)
            la_diff =  la2 - la1;
        else
            la_diff = la1 - la2;
            
        if (lo2 > lo1)
            lo_diff =  lo2 - lo1;
        else
            lo_diff = lo1 - lo2;
        
        la1 = Math.toRadians(la1);
        la2 = Math.toRadians(la2);
        
        la_diff = Math.toRadians(la_diff);
        lo_diff = Math.toRadians(lo_diff);
        
        double a  = pow(sin(la_diff/2),2) + cos(la1) * cos(la2) * pow(Math.sin(lo_diff/2),2);
        double c = 2 * atan2(sqrt(a), sqrt(1 -a));
        return 6371 * c;
    }
    
    
}
