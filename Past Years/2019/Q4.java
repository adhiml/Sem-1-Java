/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyears.PastYear2019;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author saada
 */
public class Q4 {
    public static void main (String [] args ) {
        
        String filePath = "myAmbition.txt";
        
        String sentence = "";
        
        try ( Scanner s = new Scanner (new File (filePath))) {
            
            while (s.hasNext()) {
                sentence = s.nextLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        
        int dots = 0, words = 1;
        int [] letterCount = new int[26];
        
        for (int i = 0; i < sentence.length(); i++) {
            char c = Character.toLowerCase(sentence.charAt(i));
            
            if (c == '.')
                dots++;
            if(c == ' ')
                words++;
            if(c >= 'a' && c <= 'z')
                letterCount [c - 'a']++;
        }

        System.out.println("No. of Sentences: " + dots);
        System.out.println("No. of Words: " + words);
        
       for (int i = 0; i < 26; i++) {
           
           char letter =  (char)('A' + i);
           
           System.out.printf("%c:%d \t", letter, letterCount[i]);
       }
    }
        
}
