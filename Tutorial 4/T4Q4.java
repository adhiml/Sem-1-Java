/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saada
 */
import java.util.Scanner;
public class T4Q4 {
    public static void main (String [] args)
    {
        Scanner g = new Scanner(System.in);
        System.out.print("Enter a string:");
        String sentence = g.nextLine();
        
        int length = sentence.length(); // finding the length of the sentence
        
        for ( int n = length - 1; n >= 0; n--) // length minus 1 because index start from 0
        {
            System.out.print(sentence.charAt(n) + " ");
        }
    }
}
