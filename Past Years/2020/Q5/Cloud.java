/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyears.PY2020.Q5;

/**
 *
 * @author saada
 */
public class Cloud {
    
    public String cloudPackage;
    public double totalCost;
    
    public Cloud (String cp) {
        this.cloudPackage = cp;
    }
    
    public double getTotalCost () {
        return this.totalCost;
    }
    
    @Override
    public String toString() {
        return String.format("Cloud Package: %s \tTotalCost: %.2f",cloudPackage, this.totalCost);
    }
}
