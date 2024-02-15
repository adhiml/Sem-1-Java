/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import java.io.IOException;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class L7Q3 {
    public static void main (String [] args) throws IOException
    {
        Scanner userSentence = new Scanner (System.in);
        System.out.print("Enter a sentence:");
        String oriSentence = userSentence.nextLine();
        
        String [] sentence = oriSentence.split(" ");
        
        try (PrintWriter output = new PrintWriter (new FileWriter ("original.txt")))
        {
            for (String word : sentence)
            {
                output.println(word);
            }
        } 
        
        try (BufferedReader input = new BufferedReader (new FileReader ("original.txt"));
                PrintWriter output2 = new PrintWriter(new FileWriter ("reverse.txt")))
        {
            String line;
            while ((line = input.readLine()) != null) {
                
                // StringBuilder = an object that allows you to efficiently modify the content of a character sequence.
                // we need to make a stringbuilder object named "line" mutable as we want to modify (reversed) the string
                // reverse() = StringBuilder method to reverse the characters in stringbuilder 
                // to string = to convert back into string and stored it in "reversedLine" variable
                
                String reversedLine = new StringBuilder(line).reverse().toString(); 
                output2.println(reversedLine);
            }
        }
    }
}



