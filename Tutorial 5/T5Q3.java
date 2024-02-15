/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saada
 */

// cannot execute because this is a just an example
public class T5Q3 {
    public static void main(String [] args)
    {
        int[] marks = new int[5];
        int i = 0, j = 1;
        
        marks[i] = 12;
        System.out.println("marks[i] = " + marks[i]);
        
        marks[j] = marks[i] + 19;  
        System.out.println("marks[j] = marks[i] + 19: " + marks[j]);
        
        marks[j-1] = marks[j] * marks [j];
        System.out.println("marks[j-1] = marks[j] * marks [j]: " + marks[j-1]);
        
        marks[j*3] = marks[i+1];
        System.out.println("marks[j*3] = marks[i+1]: " + marks[j*3]);
        
        marks[++j] = marks[i]%5;
        System.out.println("marks[++j] = marks[i]%5" + marks[++j]);
        
        marks[2*j] = marks[j-1];
        System.out.println("marks[2*j] = marks[j-1]" + marks[2*j]);

    }
}
