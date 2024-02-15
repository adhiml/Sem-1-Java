/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import java.util.Random;
import java.util.Scanner;

public class L6Q5 {
        public static void main ( String [] args)
    {
        Scanner g = new Scanner (System.in);
        Random j = new Random();
        
        int points = 0;
        int counter = 0;
        int x,y,z;
        
        do 
        {
            x = j.nextInt(13);
            y = j.nextInt(13);

            System.out.println("Enter your answer (Enter (-) number to quit");
            System.out.printf("%d X %d = ", x,y);
            z = g.nextInt();
            
            if ( z < 0)
                break;
            else
                counter++;
            
            if (check(x,y,z))
                points++;
            
        } while (true);
        
        System.out.println("Score " + points + "/" + counter);
    }
    
    public static boolean check (int x,int y,int z)
    {
        return x*y == z;
    }
}
