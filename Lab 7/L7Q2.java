/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.net.URLConnection;

public class L7Q2 {
    public static void main (String [] args) throws IOException
    {
        
        try 
        {
            URL u = new URL("https://fsktm.um.edu.my/");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            
            FileOutputStream fos = new FileOutputStream ("index.htm");
            String line;
            
            while (in.hasNextLine())
            {
                line = in.nextLine();
                
                //The reason getBytes() is used in this case is because the write() method of 
                //the FileOutputStream object fos expects an array of bytes as its argument. 
                //The write() method does not know how to handle strings, 
                //so the string has to be converted into an array of bytes first.
                
                fos.write(line.getBytes());
                fos.write("\n".getBytes());
            }
            
            fos.close();
        }
        catch (IOException e){
            System.out.println("IO Error:" + e.getMessage());}
    }
}

