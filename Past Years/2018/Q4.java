/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PY2018;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class Q4 {
    public static void main (String [] args) {
        
        HashMap <String, double []> players = new HashMap <String, double []> ();
         
        String name;
        double [] marks = new double [5];
        
        String filePath = "Q4.txt";
        try (Scanner s = new Scanner (new File (filePath))){
            
            while (s.hasNext()) {
                
                marks = new double [5];
                name = s.next();
                String [] line = s.next().split(",");
                
                for (int i = 0; i < line.length; i++) {
                    marks [i] = Double.parseDouble(line[i]);
                }
                
                players.put(name, marks);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.printf("%s - ",players.entrySet().toString());
    }  
}
