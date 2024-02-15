/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyears.PastYear2019;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String g, gene;
        
        do {
        System.out.println("Enter genome string [quit to stop]: ");
        g = s.nextLine();
        
        if (g.equals("quit"))
            break;
        
        
        
        } while (!g.equals("quit"));
    }
    
    public int starts (String g) {
        
        return g.indexOf("ATG");
    }
    
    public int ends (String g) {
        
        int TAA = g.indexOf("TAA");
            
    }
}
