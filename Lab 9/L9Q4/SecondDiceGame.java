/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9.L9Q4;

import java.util.Random;

class SecondDiceGame extends Dice {
    
     public static void main (String [] args) {
        
        SecondDiceGame s1 = new SecondDiceGame ("A");
        SecondDiceGame s2 = new SecondDiceGame ("B");
        
        while (s1.getScore() < 100 && s2.getScore() < 100) {
            
            s1.move();
            
            if (s1.getScore() >= 100) {
                System.out.printf("Player %s wins!\n", s1.getPlayer());
                break;
            }
            
            s2.move();
            
            if (s2.getScore() >= 100) {
                System.out.printf("Player %s wins!\n", s2.getPlayer());
                break;
            }
            
        }
    }
    
    SecondDiceGame (String player) {
        super (player);
    }
    
    @Override
    public void move () {
        
        Random g = new Random ();
        
        this.dice1 = g.nextInt(6) + 1;
        System.out.printf("Player %s rolls: %d \n",getPlayer(),dice1);
            
        if (dice1 == 6){
            
            dice1 = g.nextInt(6) + 1;
            
            if (dice1 == 6) {
                dice1 = 0;
            }
        }
        
        score += dice1;
        System.out.printf("Current scores: %d\n\n",score);
    }
    
    public int getScore () {
        return this.score ;
    }
    
    public String getPlayer () {
        return this.player;
    }
    
}
