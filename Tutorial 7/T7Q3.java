/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class T7Q3 {
    public static void main (String [] args) throws IOException
    {
        
        String sentence = "Hello World!";

        // converting into binary
        
        try (BufferedWriter writer = new BufferedWriter (new FileWriter("data.txt")))
            {
                for (char c: sentence.toCharArray()) // iterate over each characters (c) in the sentence
                {
                    // convert character c to its binary representation
                    // then writes the representation into the Writer object
                    
                    writer.write(Integer.toBinaryString(c)); 
                    
                    // creates space between each characters
                    writer.write(' ');
                }
            }
        
        // read text and display the sentence
        
        // StringBuilder used as temporary buffer to hold the binary string representation of each character
        StringBuilder  sb = new StringBuilder();
        
        try (BufferedReader reader = new BufferedReader (new FileReader("data.txt")))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                // line is split into individual words separated by spaces
                // the resulting array words is stored in 'parts'
                String [] parts = line.split(" ");
                
                for (String part : parts)
                {
                    if (!part.isEmpty())
                    {
                        // used to convert binary into integer value then into character
                        // Integer.parseInt returns integer value
                        // part 
                        char c = (char) Integer.parseInt(part,2); 
                        
                        // add all the characters together to become a sentence
                        // append means add
                        sb.append(c);
                    }
                }
            }
         System.out.println("Sentence from Binary Data: " + sb.toString());
        }
    }
}

//line is the sentence binary representation, 
//and we divide it into parts array which stores each word binary representation, 
//and part is for each character in each words
