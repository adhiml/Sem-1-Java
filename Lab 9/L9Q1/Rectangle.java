/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9.L9Q1;

import java.util.Scanner;

public class Rectangle extends Shape {
    
    double length;
    double width;
    
    // initiliaze the variable name
    Rectangle () {
        
        super("Rectangle");
    }
    
    // initiliaze the variable - length and width
    public void input () {
        
        Scanner g = new Scanner (System.in);
        
        System.out.print("Enter the length: ");
        this.length = g.nextDouble();
        
        System.out.print("Enter the width: ");
        this.width = g.nextDouble();
    }
    
    public void compute () {
        setPerimeter (length*2 + width*2);
        setArea (length * width);
    } 
}
