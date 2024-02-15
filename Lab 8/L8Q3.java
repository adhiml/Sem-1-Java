/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

import java.util.Scanner;

public class L8Q3 {
    public static void main (String [] args) {
        
        Scanner g = new Scanner (System.in);
        
        System.out.print("Age: ");
        int age = g.nextInt();
        
        System.out.print("Height (in cm): ");
        double height = g.nextInt();
        
        WeightCalculator k = new WeightCalculator(age,height);
        k.display();
    }
}

class WeightCalculator {
    private int age;
    private double height;
    
    WeightCalculator (int age, double height) {
        
        this.age = age;
        this.height = height;
    }
    
    public double recWeight (int age, double height) {
        return (height - 100 + age/10) * 0.9;
    }
    
    public void display () {
        System.out.println("");
        System.out.println("Age: " + age);
        System.out.println("Height (in cm): " + height);
        System.out.printf("Recommended Weight: %.2f", recWeight(age,height));
        System.out.println(" kg");
    }
}