/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PY2018.Q5;

/**
 *
 * @author saada
 */
public abstract class Fruit {
    
    public String name;
    public String type;
    
    Fruit (String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    public abstract double totalPrice();
    
    public String toString () {
        return String.format("%s %s",type,name);
    }
}
