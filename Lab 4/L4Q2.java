/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import java.util.Scanner;
public class L4Q2 {
    public static void main (String [] args)
    {
        Scanner g = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int num = g.nextInt();
        
        int sum = 0;
        int result = 0;
        
        for (int n =1; n <= num;n++)
        {
            sum = sum + n;
//            System.out.println(sum);
            result += sum;
        }
        System.out.println("The total:" + result);
    }
}


