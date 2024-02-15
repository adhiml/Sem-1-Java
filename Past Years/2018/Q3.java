/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PY2018;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int size, format;
        char c;

        System.out.print("Enter font size: ");
        size = s.nextInt();

        System.out.print("Enter font type: ");
        c = s.next().charAt(0);

        System.out.print("Enter format [1 - Vertically, 2 - Horizontal]: ");
        format = s.nextInt();

        if (format == 2) {
            Hori(size, c);
        }
    }

    public static void Hori(int size, char c) {

        size += 2;
        int count = size;

        while (count > 0) {
            for (int i = 1; i <= size; i++) {
                System.out.print(c);
            }

            System.out.println("");
            count--;
            for (int j = 0; j <= size - 2; j++) {
                System.out.print(c);

                for (int y = 0; y < size - 2; y++) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
