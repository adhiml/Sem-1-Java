/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9.L9Q4;

import java.util.Random;


public class Dice {
    
      public static void main (String [] args) {
        
        Dice p1 = new Dice ("A");
        Dice p2 = new Dice ("B");
        
        
        while (p1.getScore() < 100 && p2.getScore() < 100) {
            
            p1.move();
            
            if (p1.getScore() >= 100) {
                System.out.printf("Player %s wins!\n", p1.getPlayer());
                break;
            }
            
            p2.move();
            
            if (p2.getScore() >= 100) {
                System.out.printf("Player %s wins!\n", p2.getPlayer());
                break;
            }
        }
    }
      
    String player;
    int dice1;
    int dice2;
    int score;
    
    Dice (String player) {
        this.player = player;
    }
    
    public void move () {
        
        Random g = new Random ();
        
        do {
            this.dice1 = g.nextInt(6) + 1;
            System.out.printf("Player %s rolls: %d \n",getPlayer(),dice1);
            
            this.dice2 = g.nextInt(6) + 1;
            System.out.printf("Player %s rolls: %d \n",getPlayer(),dice2);
            
            this.score += dice1 + dice2;
            System.out.printf("Current scores: %d\n\n",score);
            
        } while (dice1 == dice2);
    }
    
    public int getScore () {
        return this.score ;
    }
    
    public String getPlayer () {
        return this.player;
    }
}
