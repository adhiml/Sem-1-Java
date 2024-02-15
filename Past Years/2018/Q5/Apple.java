/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PY2018.Q5;


public class Apple extends Fruit{
    
    public int apple;
    
    Apple(String name, String type, int apple) {
        super("Apple",type);
        this.apple = apple;
    }
    
    @Override
    public double totalPrice() {
        return apple * ((type.equals("Red"))? 1.8 : 1.2);
    }
    
    public String toString () {
        return super.toString() + String.format(" - %d = RM%.2f", apple, totalPrice());
    }
    
}
