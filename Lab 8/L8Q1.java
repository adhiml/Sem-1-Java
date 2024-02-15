/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

import java.util.Arrays;
import java.util.Random;
import java.io.IOException;
public class L8Q1 {
    public static void main (String [] args) 
    {
//        Number instance = new Number();
        
        Number a = new Number ();
        System.out.println("Number a:");
        a.displayAll();
        
        System.out.println("");
        
        Number b = new Number (5);
        System.out.println("Number b:");
        b.displayAll();
        
        System.out.println("");
        
        Number c = new Number (4,50);
        System.out.println("Number c:");
        c.displayAll();
        
    }
}

class Number {
    
    Random g = new Random ();
    int [] array;
    
    
    Number () {
        // have to  initialize first
        array = new int [10];       
        for (int i = 0; i < 10; i++)
        {
            array[i] = g.nextInt(101);        // cause of error on line 34
                                                   // array is not initialize
            if (array[i] == 0)
                i--;
        }
        
        Arrays.sort(array);
    }
    
    Number (int number) {
        
        array = new int [number];
        for (int i = 0; i < number; i++)
        {
            array[i] = g.nextInt(101);
            
            if (array[i] == 0)
                i--;
        }
        
        Arrays.sort(array);
    }
    
    Number (int number, int ceiling) {
        
        array = new int [number];
        for (int i = 0; i < number; i++)
        {
            array[i] = g.nextInt(ceiling + 1);
            
            if (array[i] == 0)
                i--;
        }
        
        Arrays.sort(array);
    }
    public boolean prime (int num ) {
        
        if (num < 2)
            return false;
        
        if (num == 2)
            return true;
        
        for (int i = 3; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        
        return true;
    }
    
    public void checkPrime (int num) {
        if (prime(num))
            System.out.print(num + " ");
    }
    
    public boolean even (int number) {
        if (number % 2 == 0)
            return true;
        return false;
    }
    
    public void checkEven (int num) {
        if (even(num))
            System.out.print(num + " ");
    }
    
    public int getMaxNum (int[] array) {
        return array[array.length - 1];
    }
    
    public int getMinNum (int[] array) {
        return array[0];
    }
    
    public boolean perfectSquare (int number) {
        
        // use (int) to ignore the decimal part of the sqrt
        if ((int)Math.sqrt(number) * (int)Math.sqrt(number) == number)
            return true;
        
        return false;
    }
    
    public void checkPerfectSquare (int num) {
        if (perfectSquare(num))
            System.out.print(num + " ");
    }
    
    public void squareNum (int num) {
        System.out.print(num*num + " ");
    }
    public double average (int [] array ) {
        
        double sum = 0.0;
        
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        
        return sum / array.length;
    }
    
    public void displayAll () {
        
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Maximum numbers: " + getMaxNum(array));
        System.out.println("Maximum numbers: " + getMinNum(array));
        
        System.out.print("Prime numbers: ");
        // for every num in this array
        for (int num : array)
            checkPrime(num);
        
        System.out.println("");
        
        System.out.print("Even Numbers:");
        for (int num : array)
            checkEven(num);
        
        System.out.println("");
        
        System.out.print("Squares:");
        for (int num : array)
            squareNum(num);
        
        System.out.println("");
        
        System.out.print("Perfect Squares:");
        for (int num : array)
            checkPerfectSquare(num);
        
        System.out.println("");
        
        System.out.println("Average: " + average(array));
    }
}