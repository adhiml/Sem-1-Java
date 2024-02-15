/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Random;
import java.util.Scanner;

public class L5Q1 {
    public static void main(String[] args) 
    {
        Random g = new Random();
        Scanner j = new Scanner(System.in);
        
        System.out.print("Please enter a number of students:");
        int numStudents = j.nextInt();
        int [] students = new int[numStudents];
        
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int average = 0;
        
        int u = 0;
        while (u < numStudents)
        {
            students[u] = g.nextInt(101);
            
            if (students [u] > highest)
                highest = students [u];
            if (students [u] < lowest)
                lowest = students [u];
            
            average += (students[u] / numStudents);
            u++;
        }
        
        System.out.println("Highest score:" + highest);
        System.out.println("Lowest score:" + lowest);
        System.out.println("Average score:" + average);
    }
}