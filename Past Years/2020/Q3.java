/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyears.PY2020;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Q3 {
    public static void main (String [] args) throws FileNotFoundException {
        
        String filePath = "raw.txt";
        ArrayList <Integer> num = new ArrayList <> ();
        Map <Integer, Integer> frequency = new HashMap <> ();
        
        try (Scanner s = new Scanner(new File (filePath))) {
            
            while (s.hasNext()) {
                num.add(s.nextInt());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        int ctwo = 0, cfour = 0, csix = 0, ceight = 0, cten = 0;
        for (int n : num) {
            
            switch (n) {
                case 2: ctwo++; break;
                case 4: cfour++; break;
                case 6: csix++; break;
                case 8: ceight++; break;
                case 10: cten++; break;
            }
        }
       
        frequency.put(2, ctwo);
        frequency.put(4, cfour);
        frequency.put(6, csix);
        frequency.put(8, ceight);
        frequency.put(10, cten);
       
       int maxFrequency = Integer.MIN_VALUE;
       int mode = 0;
       
       for (Map.Entry<Integer, Integer> f : frequency.entrySet()) {
           
           if (f.getValue() > maxFrequency) {
               maxFrequency = f.getValue();
               mode = f.getKey();
           }
           
       }
       
       
       
        
        System.out.println("Frequency Distribution Table");
        System.out.println("2 : " + frequency.get(2));
        System.out.println("4 : " + frequency.get(4));
        System.out.println("6 : " + frequency.get(6));
        System.out.println("8 : " + frequency.get(8));
        System.out.println("10 : " + frequency.get(10));
        System.out.println("The mode of the dataset is : " + mode);
    }
    
    
}
