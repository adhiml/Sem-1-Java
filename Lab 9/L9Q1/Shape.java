/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9.L9Q1;

public class Shape {
    
    String name;
    double perimeter;
    double area;
    
    Shape (String name) {
        
        this.name = name;
    }
    
    // setter method 
    public void setPerimeter (double perimeter) {
        this.perimeter = perimeter;
    }
    
    // gettor / accessor method
    public double getPerimeter () {
        return perimeter;
    }
    
    public void setArea (double area) {
        this.area = area;
    }
    
    // gettor / accessor method
    public double getArea () {
        return area;
    }
    
    
    public void display () {
        System.out.println("Name: " + name);
        System.out.printf("Perimeter: %.2f \nArea: %.2f\n",getPerimeter(), getArea());
    }
}
