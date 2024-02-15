/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;


public class L8Q6 {
    public static void main (String [] args) {
        
        
        Burger stall1 = new Burger ("AE12");
        Burger stall2 = new Burger ("AE13");
        
        stall1.sold(230);
        stall2.sold(230);
        stall1.sold(98);
        stall2.sold(67);
        
        System.out.println("Burger stall " + stall1.toString() + " solds: " + stall1.getbSolds());
        System.out.println("Burger stall " + stall2.toString() + " solds: " + stall2.getbSolds());
        System.out.println("Total sales of burgers across all stalls: " + Burger.gettotalBSolds());
        
    }
}

class Burger {
    
    private String ID;
    private int bSolds;
    private static int totalBSolds;
    
    Burger (String ID) {
        this.ID = ID;
        this.bSolds = 0;
    }
    
    public void sold (int counter) {
        if (counter > 0)
            bSolds += counter;
            totalBSolds += counter;
    }
    
    public int getbSolds () {
        return bSolds;
    }
    
    public static int gettotalBSolds () {
        return totalBSolds;
    }
    
    @Override
    public String toString () {
        return this.ID;
    }
}