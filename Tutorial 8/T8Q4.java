/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8;


public class T8Q4 {
    public static void main (String [] args)
    {
        new CashPayment (78898);
        new ChequePayment (67128, "908-8996-9989");
        new CreditCardPayment (73827,"Jae","Debit","7 February 1997",7887);
    }
}


class Payment {
    
    // protected = can be access by all class
    protected int amount;
    
    protected Payment (int amount) {
        this.amount = amount;
    }
    
    public void makePayment () {
        System.out.println("Your payment is succesfull!");
    }
}

class CashPayment extends Payment {
    
    CashPayment (int amount) {
        super(amount);
    }
    
    @Override
    public void makePayment () {
        System.out.println("Cash Payment");
        super.makePayment();
    }
}

class ChequePayment extends Payment {
    private String chequeNumber;
    
    ChequePayment (int amount, String chequeNumber) {
        super(amount);
        this.chequeNumber = chequeNumber;
    }
    
    @Override
    public void makePayment () {
        System.out.println("Cheque Payment");
        super.makePayment();
    }
}

class CreditCardPayment extends Payment {
    private String owner;
    private String cardType;
    private String expired;
    private int verification;
    
    CreditCardPayment (int amount, String owner,String cardType, String expired, int code)
    {
        super (amount);
        this.owner = owner;
        this.cardType = cardType;
        this.expired = expired;
        this.verification = code;
    }
    
    @Override
	public void makePayment() {
		System.out.println("Credit Card Payment.");
		super.makePayment();
	}
}