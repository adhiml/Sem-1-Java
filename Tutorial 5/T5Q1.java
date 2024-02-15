/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Random;
import java.util.Scanner;
public class T5Q1 {
    public static void main (String [] args)
    {
        
//////////////////////////////////// a. /////////////////////////////
        
        System.out.println("Question a.");
        
        int i = 0;
        float[] arraya = new float[13];
        
        Random g = new Random();
        
        for (i = 0;i < 12; i++)
        {
            arraya[i] = g.nextFloat() * 101;
            System.out.printf("\nArray [" + i + "]:%.2f", arraya[i]);
        }
        System.out.println();
        
//////////////////////////////////// b. /////////////////////////////
        
        System.out.println("\nQuestion b.");
        
        int l = 0;
        char[] arrayb = new char[6];
        
        Random h = new Random();
        for (l = 0;l < 5; l++)
        {
            arrayb[l] = (char)('A' + h.nextInt(6)); // generate random upper case letters
            System.out.printf("\nArray [" + l + "]:%c", arrayb[l]);
        }
        System.out.println();
        
//////////////////////////////////// c. /////////////////////////////
        
        System.out.println("\nQuestion c.\n");
        
        int n = 0;
        String[] arrayc = new String[101]; // String name [] =  new String [100] 
        
        Scanner j = new Scanner(System.in);
        
        for (int y = 0;y < 101; y++) 
        {
                System.out.print("Please enter a student name:");
                arrayc[y] = j.nextLine();
        }
        
        for (n = 0;n < 101; n++)
        {
//            System.out.println("\nArray [" + n + "]:" + arrayc[n]);
            System.out.printf("\nArray [" + n + "]:%S", arrayc[n]);
        }
        System.out.println();
        
//////////////////////////////////// d. /////////////////////////////
        
        System.out.println("\nQuestion d.\n");
        
        int[][] arrayd = new int[6][2];
        int columns;
        
        Scanner k = new Scanner(System.in);
        
        for (int row = 0;row < 6; row++) 
        {
            for (columns = 0;columns < 2; columns++) 
            {
                System.out.print("Please enter an integer:");
                arrayd[row][columns] = k.nextInt();
            }
        }
        System.out.println();
        System.out.println("Array:");
        for (int row = 0;row < 6; row++) 
        {
            for (columns = 0;columns < 2; columns++) 
            {
                System.out.print(arrayd[row][columns] + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        
//////////////////////////////////// e. /////////////////////////////
        
        System.out.println("\nQuestion e.");
        
        int [][] arraye = {{6,9},{2,5},{4,6}};
        int column;
        
        System.out.println("Array:");
        for (int rows = 0;rows < 3; rows++) 
        {
            for (column = 0;column < 2; column++) 
            {
                System.out.print(arraye[rows][column] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
//////////////////////////////////// f. /////////////////////////////
        
        System.out.println("\nQuestion f.");
        
        int [][] arrayf1 = {{6,9},{2,5},{4,6}};
        int columnf;
        
        System.out.println("\nArray 1:");
        for (int rowf = 0;rowf < 3; rowf++) 
        {
            for (columnf = 0;columnf < 2; columnf++) 
            {
                System.out.print(arrayf1[rowf][columnf] + " ");
            }
            System.out.println();
        }
        
        int [][] arrayf2 = {{6,9},{2,5},{3,7}}; // masukkan through index
        System.out.println("Array 2:");
        for (int rowf = 0;rowf < 3; rowf++) 
        {
            for (columnf = 0;columnf < 2; columnf++) 
            {
                System.out.print(arrayf2[rowf][columnf] + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        
//////////////////////////////////// g. /////////////////////////////
        
        System.out.println("Question g.");
        
        System.out.print("\nEnter an integer:");
        Scanner r = new Scanner(System.in);
        int u = r.nextInt();
        
        int[] contact = new int[u];
        Random b = new Random();
        
        System.out.println();
        for (int a = 0;a < u; a++) // (int i = 0; i < contact.length;i++)
        {
            contact[a] = b.nextInt(51);
            System.out.println("Array [" + a + "]:" + contact[a]);
        }
        System.out.println();
    }
}
