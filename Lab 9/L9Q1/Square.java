/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9.L9Q1;

import java.util.Scanner;

public class Square extends Shape {
    
    double length;
    
    // initiliaze the variable name
    Square () {
        
        super("Square");
    }
    
    // initiliaze the variable - length and width
    public void input () {
        
        Scanner g = new Scanner (System.in);
        
        System.out.print("Enter the length: ");
        this.length = g.nextDouble();
    }
    
    public void compute () {
        setPerimeter (length*4);
        setArea (length * length);
    } 
}
