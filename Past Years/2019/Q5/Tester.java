/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyears.PastYear2019.Q5;

public class Tester {

    public static void main(String[] args) {

        double totalCost = 0.0;
        SpecialDelivery[] sp = new SpecialDelivery[4];

        sp[0] = new SpecialDelivery("Ali", "Ahmad", 4.4, false, false);
        sp[1] = new SpecialDelivery("Ah Chong", "Fatimah", 63.1, false, false);
        sp[2] = new SpecialDelivery("FSKTM, UM", "FK, UM", 32.5, true, false);
        sp[3] = new SpecialDelivery("Ang", "Liew", 19.0, true, true);

        for (int i = 0; i < 4; i++) {
            System.out.println(sp[i]);
            System.out.println("");
        }
        
        for (int i = 0; i < 4; i++) {
            totalCost += sp[i].cost;
        }
        
        System.out.println("The total shipping cost is RM" + totalCost);
        
    }
}
