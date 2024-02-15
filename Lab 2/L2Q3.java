/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saada
 */
import java.util.Random;

public class L2Q3 {
    public static void main(String [] args)
    {
       Random R = new Random();
       
      // random.nextInt( max - min + 1) + min fro range
      
      int MAX = 50;
      int MIN = 10;
      double num1 = R.nextInt(MAX - MIN +1 ) + 10;
      double num2 = R.nextInt(MAX - MIN +1 ) + 10;
      double num3 = R.nextInt(MAX - MIN +1 ) + 10;
      double average = (num1+num2+num3)/2;
      
//      System.out.printf("%.2f Num1:"+num1);
//      System.out.printf("%n %.2f Num2:"+num2);
//      System.out.printf("%n %.2f Num3:"+num3);

        System.out.print("Num1:"+num1);
        System.out.print("\nNum2:"+num2);
        System.out.print("\nNum3:"+num3);
      
      System.out.print("\nSum:"+(num1+num2+num3));
      System.out.printf("\nAverage:%.2f %n", average);
      
    }
    
}
