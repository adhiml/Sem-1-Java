/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;


// FileInputStream and FileOutputStream: 
// Used for reading and writing binary files.
// But FileInputStream only gives you a very basic interface.

//When you're wanting to read numbers, Strings (or even complex Objects) rather than just bytes,
//use a second input stream "wrapping" the first, which gives you a more useful interface. 
//DataInputStream is one of these.

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class L7Q5 {
    
    public static void main (String [] args) throws IOException
    {
        try (ObjectInputStream in = new ObjectInputStream (new FileInputStream ("Lab07\\person.dat")))
        {
            int num = in.readInt();
            
            String [] name = new String [num];
            int [] age = new int [num];
            char [] gender = new char [num];
            
            for (int i = 0; i < num; i++)
            {
                name[i] = in.readUTF();
                age[i] = in.readInt();
                gender[i] = in.readChar();
            }
            
            String nameTemp;
            int ageTemp;
            char genderTemp;

            
            for (int j = 0; j < name.length; j++)
            {
                for (int n = 0; n < name.length - 1; n++)
                {
                    if (name[n].compareToIgnoreCase(name[n + 1]) > 0) // if answer > 0 == n comes after n + 1
                    {
                        nameTemp = name[n];
                        name[n] = name [n + 1];
                        name [n +  1] = nameTemp;
                        
                        ageTemp = age[n];
                        age[n] = age [n + 1];
                        age [n +  1] = ageTemp;
                        
                        genderTemp = gender[n];
                        gender[n] = gender [n + 1];
                        gender [n +  1] = genderTemp;
                        
                    }
                }
            }
            
        for (int y = 0; y < num; y++)
        {
            System.out.println("Name: " + name[y]);
            System.out.println("Age: " + age[y]);
            System.out.print("Gender: " );
            
            if (gender[y] == 'M')
                System.out.println("Male");
            else
                System.out.println("Female");
        }
        }
    }
}

