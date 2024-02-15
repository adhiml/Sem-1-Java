/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9.L9Q1;

import java.util.Scanner;

public class Circle extends Shape {
    
    double diameter;
    
    // initiliaze the variable name
    Circle () {
        
        super("Circle");
    }
    
    // initiliaze the variable - length and width
    public void input () {
        
        Scanner g = new Scanner (System.in);
        
        System.out.print("Enter the diameter: ");
        this.diameter = g.nextDouble();
    }
    
    public void compute () {
        setPerimeter (2 * (diameter/2) * Math.PI);
        setArea (Math.PI * (diameter/2) * (diameter/2));
    } 
}
