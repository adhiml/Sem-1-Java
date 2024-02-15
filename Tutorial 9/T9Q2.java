/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t9;


public class T9Q2 {
    public static void main (String [] args) {
        
        new Animal(20,5.3,150.78).display();
    }
}

abstract class Organism {
    
    public double size;
    public double growthRate;
    
    Organism (double size, double growthRate) {
        
        this.size = size;
        this.growthRate = growthRate;
    }
}

class Animal extends Organism {
    
    public double amountOfFood ;
    
    Animal (double size, double growthRate, double amountOfFood) {
        
//        this.size = size;
//        this.growthRate = growthRate;

        // correct way to invoke initialized variables from superclass
        super(size, growthRate);
        this.amountOfFood = amountOfFood;
    }
    
    public void display () {
        System.out.printf("Size: %.2f \nGrowth Rate: %.2f \nAmount of Food: %.2f \n", size,growthRate, amountOfFood);
    }
}