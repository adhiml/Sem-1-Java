/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PY2018.Q5;

import java.util.Arrays;

public class Tester {

    public static void main(String[] args) {

        Apple[] apple = new Apple[2];

        apple[0] = new Apple("Apple", "Red", 8);
        apple[1] = new Apple("Apple", "Green", 11);

        Watermelon[] wm = new Watermelon[2];

        wm[0] = new Watermelon("Watermelon", "Local", 7.6);
        wm[1] = new Watermelon("Watermelon", "Imported", 4.0);

        double[] price = new double[4];

        for (int i = 0; i < 2; i++) {
            System.out.println(apple[i]);
            price[i] = apple[i].totalPrice();
        }

        for (int i = 0; i < 2; i++) {
            System.out.println(wm[i]);
        }

        price[2] = wm[0].totalPrice();
        price[3] = wm[1].totalPrice();

        double min = Double.MAX_VALUE;
        int index = 0;

        for (int j = 0; j < 4; j++) {
            if (price[j] < min) {
                min = price[j];
                index = j;
            }
        }

        System.out.print("\nThe Cheapest Item: ");
        switch (index) {
            case 0:
                System.out.println(apple[0]);
                break;
            case 1:
                System.out.println(apple[1]);
                break;
            case 2:
                System.out.println(wm[0]);
                break;
            case 3:
                System.out.println(wm[1]);
                break;
        }
    }
}
