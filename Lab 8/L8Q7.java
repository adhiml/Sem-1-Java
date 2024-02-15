/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

/**
 *
 * @author saada
 */
public class L8Q7 {
    public static void main (String [] args) {
        
        Money test = new Money(890.86);
        test.display();
        
        System.out.println("");
        
        test.add(345.87, 98.00);
        test.sub(567.98, 87.67);
    }
}

class Money {
    
    private double amount, amountRoundUp;
    private int n100, n50 , n10, n5, n1;
    private int c50, c20, c10, c5;
    
    Money (double amount) {
        
        this.amount = amount;
        
        this.n100 = 0;
        this.n50 = 0;
        this.n10 = 0;
        this.n5 = 0;
        
        this.c50 = 0;
        this.c20 = 0;
        this.c10 = 0;
        this.c5 = 0;
    }
    
    public void compute () {
        
        int calc = (int) amountRoundUp(amount);
        
        n100 = calc/10000;
        calc%=10000; // update amount
        
        n50 = calc/5000;
        calc%=5000;
        
        n10 = calc/1000;
        calc%=1000;
        
        n5 = calc/500;
        calc%=500;
        
        n1 = calc/100;
        calc%=100;
        
        c50 = calc/50;
        calc%=50;
        
        c20 = calc/20;
        calc%=20;
        
        c10 = calc/10;
        calc%=10;
        
        c5 = calc/5;
        calc%=5;
        
        System.out.println("RM100 notes: " + n100 + "\nRM50 notes: " + n50 +
                            "\nRM10 notes:" + n10 + "\nRM50 notes:" + n5 +
                            "\nRM1 notes:" + n1 + "\nRM0.50 coins:" + c50 +
                            "\nRM0.20 coins:" + c20 + "\nRM0.10 coins:" + c10 +
                            "\nRM0.50 coins:" + c5 );
    }
    
    public double amountRoundUp (double amount) {
        
        amount *= 100;
        
        if (amount%10 == 4 || amount%10 == 9 )
            amount += 1;
        if (amount%10 == 3 || amount%10 == 8)
            amount+= 2;
        if (amount%10 == 1 || amount%10 == 6)
            amount -= 1;
        if (amount%10 == 2 || amount%10 == 7)
            amount -= 2;
        
        return amount;
    }
    
    public void sub (double a, double b) {
        double sum = a - b;
        System.out.println("RM" + a + " - " + "RM" + b + " = " + "RM" + sum);
    }
    
    public void add (double a, double b) {
        double sum = a + b;
        System.out.println("RM" + a + " + " + "RM" + b + " = " + "RM" + sum);
    }
    
    public void display () {
        
        double answer = amountRoundUp(amount);
        System.out.printf("Amount before round up: RM%.2f", this.amount);
        System.out.println("");
        System.out.printf("Amount after round up: RM%.2f", answer);
        System.out.println("");
        compute();
    }
}