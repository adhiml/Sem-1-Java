/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;
public class L4Q5 {
    public static void main (String[] args)
    {
        Random g = new Random();
        int sum1, sum2;
        
        for (sum1 = 0,sum2 = 0; sum1 <= 100 || sum2 <=100;)
        {
            int dice1 = g.nextInt(7);
            System.out.println("Score (Player 1): " + dice1);
            System.out.println();
            if ( dice1 == 6){
                dice1 = g.nextInt(7);
                    System.out.println("Score (Player 1): " + dice1);
                    System.out.println();}
            sum1 += dice1;
            
           int dice2 = g.nextInt(7);
           System.out.println("Score (Player 2): " + dice2);
           System.out.println();
           if (dice2 == 6){
               dice2 = g.nextInt(7);
               System.out.println("Score (Player 2): " + dice2);
               System.out.println();}
           
           sum2 += dice2;
        }
        
        if (sum1 > sum2)
            System.out.println("Player 1 wins with " + sum1);
        else if (sum1 < sum2)
            System.out.println("Player 2 wins with " + sum2);
        else
            System.out.println("Player 2 is tied with " + sum2);
    }
}
