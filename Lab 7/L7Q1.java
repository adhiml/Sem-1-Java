/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import java.io.*;
import java.util.Scanner;
public class L7Q1 {
    
    public static void main (String[] args ) throws IOException
    {
        try (ObjectOutputStream output = new ObjectOutputStream (new FileOutputStream ("coursename.dat")))
        {
            String [] courseCode = {"WXES1116", "WXES1115", "WXES1110", "WXES1112"};
            String [] courseNames = {"Programming I", "Data Structure", "Operating System", "Computing Mathematics I"};
            
            output.writeObject(courseCode);
            output.writeObject(courseNames);
        }
        
        try (ObjectInputStream input = new ObjectInputStream (new FileInputStream ("coursename.dat")))
        {
            String [] courseCode = (String []) input.readObject();
            String [] courseNames = (String []) input.readObject();
            
            for (int w =0; w < courseCode.length; w++)
            {
                System.out.println("Course Code: " + courseCode[w]);
                System.out.println("Course Name: " + courseNames[w]);
            }
            
            
            Scanner g = new Scanner (System.in);
            System.out.print("\nEnter a course code:");
            String coursecode = g.nextLine();
            
            for (int w =0; w < courseCode.length; w++)
            {
                if (coursecode.equals(courseCode[w])){
                    System.out.println("Course Name: " + courseNames[w]);
                    break;}
            }
        } catch (Exception e)
        {
            System.out.println(" ");
        }
    }
}

