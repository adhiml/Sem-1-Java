/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t9;


public class T9Q4 {
    public static void main (String [] args) {
        
        new PurchaseSystem ("8997 7654", 5.67,6).display();
        new SugarPurchase ("8997 7654",5.67,6, .89).display();
    }
}

class PurchaseSystem {
    
    public String code;
    public double price;
    public int quantity;
    public double totalPrice;
    
    PurchaseSystem (String code, double price, int quantity) {
        
        this.code = code;
        this.price = price;
        this.quantity = quantity;
    }
    
    public double compute (int quantity, double price) {
        return (double) quantity * price;
    }
    
    public void display () {
        System.out.printf("Total price: RM %.2f\n", compute(quantity,price));
    }
}

class SugarPurchase extends PurchaseSystem {
    
    public double SugarWeightGram;
    
    SugarPurchase(String code, double price, int quantity,double SugarWeightGram) {
        
        super (code,price, quantity);
        this.SugarWeightGram = SugarWeightGram;
    }
    
    @Override
    public double compute (int quantity, double price) {
        return (double) quantity * price * SugarWeightGram;
    }
}