/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saada
 */
import java.util.Random;
public class L3Q4 {
    public static void main(String [] args)
    {
        Random g = new Random();
        int throw1 = g.nextInt(6) + 1;  // dalam letak bound 
        int throw2 = g.nextInt(6) + 1;
        
        // int dice1 = g.nextInt(12) + 1;
        // int dice2 = g.nextInt(12) + 1;
        
        int throw3 = g.nextInt(6) + 1;  // dalam letak bound 
        int throw4 = g.nextInt(6) + 1;
        
        int dice1 = throw1 + throw2;
        int dice2 = throw3 + throw4;
        
        if (dice1 > dice2)
        {
            System.out.println("The first player score :" +dice1);
            System.out.println("The second player score :" +dice2);
            System.out.println("The highest score :" +dice1);
            System.out.println("The first player wins!");
        }
        else if (dice1 < dice2)
        {
            System.out.println("The first player score :" +dice1);
            System.out.println("The second player score :" +dice2);
            System.out.println("The highest score :" +dice2);
            System.out.println("The second player wins!");
        }
        else
        {
            System.out.println("The first player score :" +dice1);
            System.out.println("The second player score :" +dice2);
            System.out.println("The highest score :" +dice2);
            System.out.println("The game is tie!");
        } 
        
        
    }
}
