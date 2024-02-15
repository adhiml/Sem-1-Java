/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

import java.util.Random;
import java.util.Scanner;


public class L8Q5 {
    public static void main (String [] args) {
        
        Game player1 = new Game("A");
        Game player2 = new Game ("B");
        
        String name1 = player1.getName();
        String name2 = player2.getName();
        
        int amount1 = 0, amount2 = 0;
        int move1, move2;
        
        while (amount1 < 100 || amount2 < 100) {
            
            move1 = player1.move();
            amount1 += move1;
            System.out.println(name1 + " roles " + move1  + " -> Current Points: " + amount1);
            
            if (amount1 >= 100) {
                System.out.println(name1 + " wins!");
                break;
            }
            
            move2 = player2.move();
            amount2 += move2;
            System.out.println(name2 + " roles " + move2 + " -> Current Points: " + amount2);
            
            if (amount2 >= 100) {
                System.out.println(name2 + " wins!");
                break;
            }
        }
    }
}


class Game {
    
    private String name;
    private int dice;
    
    Game (String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    public int move () {
        Random g = new Random ();
        dice = g.nextInt(12 + 1);
        
        return dice;
    } 
}