/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t9;


public class T9Q3 {
    public static void main (String [] args) {
        
        new RegularPay(3.2,45).display();
        new SpecialPay(3.2,45).display();
        
    }
    
}

class PaySystem {
    
    public double payRate;
    public double numOfHour;
    
    PaySystem (double payRate, double numOfHour) {
        this.payRate = payRate;
        this.numOfHour = numOfHour;
    }
    
    // a method to return the total pay for a given amount of hours
    public double totalPay (double payRate, double numOfHour) {
        return payRate * numOfHour;
    }
    
    // method to display the total payment
    public void display () {
        System.out.printf("Total pay: RM %.2f \n" ,totalPay(payRate, numOfHour));
    }
}

class RegularPay extends PaySystem {
    
    RegularPay (double payRate, double numOfHour) {
        super(payRate, numOfHour);
    }
}

class SpecialPay extends PaySystem {
    
    SpecialPay (double payRate, double numOfHour) {
        super(payRate, numOfHour);
    }
    
    @Override
    public double totalPay (double payRate, double numOfHour) {
        return 1.3 * (payRate * numOfHour);
    }
    
}