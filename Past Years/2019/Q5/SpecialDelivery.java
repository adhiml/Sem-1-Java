/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyears.PastYear2019.Q5;

/**
 *
 * @author saada
 */
public class SpecialDelivery extends Delivery {

    public boolean weekend;
    public boolean night;

    SpecialDelivery(String sender, String recipient, double weight, boolean weekend, boolean night) {
        super(sender, recipient, weight);
        this.night = night;
        this.weekend = weekend;
    }

    @Override
    public double totalCost() {
        return cost = (super.totalCost() + (this.weekend ? 50 : 0)) * (this.night ? 1.2 : 1);
    }

    public String toString() {
        return super.toString() + String.format(weekend ? "\nWeekend Delivery" : "") + String.format(night ? "\nNight Time Delivery" : "");

    }

}
