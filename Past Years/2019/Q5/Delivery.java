/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyears.PastYear2019.Q5;

/**
 *
 * @author saada
 */
public class Delivery {

    public String sender;
    public String recipient;
    public double weight;
    public double cost = 0.0;

    Delivery(String sender, String recipient, double weight) {
        this.recipient = recipient;
        this.sender = sender;
        this.weight = weight;
    }

    public double totalCost() {

        double tempW = 0.0;

        if (weight > 50) {
            tempW = weight - 50;
            cost += (double) tempW * 8.6;
            weight = weight - tempW;
        }

        if (weight > 20 && weight <= 50) {
            tempW = weight - 20;
            cost += (double) tempW * 7.0;
            weight = weight - tempW;
        }

        if (weight > 5 && weight <= 20) {
            tempW = weight - 5;
            cost += (double) tempW * 5.2;
            weight = weight - tempW;
        }

        if (weight <= 5) {
            cost += (double) weight * 2.8;
        }

        return cost;
    }

    @Override
    public String toString() {
        return String.format("From: %s \tTo: %s \nWeight of Package: %.2f \nShipping Cost: RM%.2f", sender, recipient, weight, this.totalCost());

    }
}
