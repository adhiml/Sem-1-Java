/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PY2018.Q5;

public class Watermelon extends Fruit {

    public double weight;
    
    Watermelon(String name, String type, double weight) {
        super("Watermelon", type);
        this.weight = weight;
    }

    @Override
    public double totalPrice() {
        
        double cost = 0.0;
        double tempW = 0.0;
        
        if (type.equals("Local")) {
            if (weight > 5)
                cost+= weight*1.65;
            else if(weight >= 2 && weight <= 5)
                cost += weight*1.95;
            else
                cost += weight*2.25;
        }
        else
            if (weight > 5)
                cost+= weight*3.15;
            else if(weight >= 2 && weight <= 5)
                cost += weight*3.45;
            else
                cost += weight*3.75;
        
        return cost;
    }
    
    public String toString () {
        return super.toString() + String.format(" - %.1fkg = RM%.2f", weight, totalPrice());
    }
}
