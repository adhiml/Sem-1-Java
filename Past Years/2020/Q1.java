/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyears.PY2020;

import java.util.Scanner;


public class Q1 {
    public static void main (String [] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("This program changes all the odd numbers in the aray into even numbers.");
        
        int size = 5;
        int[] num = new int[size];
        System.out.print("Enter five integr numbers: ");
        
        for (int i = 0; i < size; i++) {
            num[i] = s.nextInt();
        }
        
        convert(num);
        System.out.println("The numbers are: ");
        for (int i = 0; i< size; i++) {
            System.out.print(num[i] + " ");
        } System.out.println("");
    }
    
    public static int [] convert (int [] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                a[i] += 2;
                if (a[i] % 2 == 1) 
                    a[i] += 1;
            }
        }
        
        return a;
    }
}
