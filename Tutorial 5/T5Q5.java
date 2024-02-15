/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;
public class T5Q5 {
    public static void main(String[] args) 
    {
        System.out.print("Please enter a sentence:");
        Scanner g = new Scanner(System.in);
        String statement = g.nextLine();

        String [] sentence = statement.split(" ");
        
        // Display the array in reverse order
        System.out.println("Reverse Array:");
        
        // Reverse the array
        reverseArray(sentence);
    }

    // Function to reverse a string array
    private static void reverseArray(String[] sentence) {
        
        // Swap elements from the beginning and end of the array
        for (int i = sentence.length - 1; i >= 0; i--) {
            System.out.print(sentence[i] + " ");
        }
    }
}
