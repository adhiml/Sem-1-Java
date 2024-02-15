/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8;


public class T8Q2 {
    public static void main (String [] args)
    {
        new Digit (4567).display();
    }
    
}

class Digit {
    private int number;
    
    Digit (int number)
    {
        this.number = number;
    }
    
    public static int digitMultiplication (int number)
    {
        int multiplied = 1;
        
        while (number > 0)
        {
            multiplied *= (number % 10);
            number /= 10;
        }
        
        return multiplied;
    }
    
    public void display () {
        System.out.println("Multiplication of " + number + " is " + digitMultiplication(number));
    }
}