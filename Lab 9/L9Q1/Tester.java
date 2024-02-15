/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9.L9Q1;


public class Tester {
    public static void main (String [] args) {
        
        Shape s = new Shape ("Shape");
        s.setArea(34.5);
        s.setPerimeter(67);
        s.display();
        
        System.out.println("");
        
        Rectangle r = new Rectangle();
        r.input();
        r.compute();
        r.display();
        
        System.out.println("");
        
        Square q = new Square();
        q.input();
        q.compute();
        q.display();
        
        System.out.println("");
        
        Circle c = new Circle();
        c.input();
        c.compute();
        c.display();
    }
}
