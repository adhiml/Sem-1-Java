/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class L7Q4 {
    public static void main (String [] args) throws IOException
    {
        String filePath = "example.txt; // assuming there's a file called example
        
        try (Scanner scanner = new Scanner (new File(filePath)))        
        {
            int lineCount = 0;
            int wordCount = 0;
            int charCount = 0;
            
            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                lineCount++;
                charCount += line.length();
                wordCount += line.split(" ").length;
            }
            
            System.out.println("File path: " + filePath);
            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of line: " + lineCount);
        }
    }
}
