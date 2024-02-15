/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyears.PY2020.Q5;

/**
 *
 * @author saada
 */
public class Q5 {
    public static void main (String [] args) {
        
        CloudPackaging cp1 = new CloudPackaging("P2-15", 4, 15, 1.24);
        CloudPackaging cp2 = new CloudPackaging("P2-30", 6, 30, 2.11);
        CloudPackaging cp3 = new CloudPackaging("P2-20", 4, 20, 1.38);
        CloudPackaging cp4 = new CloudPackaging("P2-20", 6, 20, 1.88);
        
        CloudPackaging [] cp = {cp1, cp2, cp3, cp4};
        
        Job J1 = new Job("J1",252, 20);
        Job J2 = new Job("J2",108, 10);
        Job J3 = new Job("J3",72, 25);
        
        int index = 0;
        
        System.out.println(J1.toString());
        index = leastCost(cp, J1);
        System.out.println(cp[index].toString());
        
        System.out.println("\n" + J2.toString());
        index = leastCost(cp, J2);
        System.out.println(cp[index].toString());
        
        System.out.println("\n" + J3.toString());
        index = leastCost(cp, J3);
        System.out.println(cp[index].toString());
        
    }
    
    public static int leastCost (CloudPackaging [] cp, Job b) {
        
        int index = 0;
        double cost = Double.MAX_VALUE;
        
        for (int i = 0; i < 4; i++) {
            
            if( cp[i].Check(b)) {
                cp[i].totalCost(b);
                    if(cp[i].getTotalCost() < cost) {
                        cost = cp[i].getTotalCost();
                        index = i;
                    }
            }
        }
        return index;
    }
}
