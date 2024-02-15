/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PY2018;

import java.util.Random;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random g = new Random();

        System.out.print("Enter N number: ");
        int n = s.nextInt();

        int[] random = new int[n];

        for (int i = 0; i < n; i++) {
            random[i] = g.nextInt(101) + 50;
        }

        System.out.println("Random Numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.print(random[i] + " ");
        }
        
        int AAA = 0, AA = 0, A = 0;
        
        for (int i = 0; i < n; i++) {
            random[i] %= 10;
        }
        
        for (int i = 0; i < n; i++) {
            
            if (random[i] < 4)
                AAA++;
            if(random[i] > 3 && random[i] < 7)
                AA++;
            if (random[i] > 6)
                A++;
        }
        
        System.out.printf("\nGroup AAA: %d \nGroup AA: %d \nGroup A: %d\n", AAA, AA, A);
    }
}
