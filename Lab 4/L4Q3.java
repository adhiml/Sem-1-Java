/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import java.util.Scanner;
public class L4Q3{
    
    public static double powerSumOfSquares (int n, int total)
    {
        return Math.pow(total,2)/(n-1);
    }
    public static void main (String [] args)
    {
        int score;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n = 0;
        double average = 0;
        double sd = 0;
        int total = 0;
        
        while (true)
        {
            Scanner g = new Scanner(System.in);
            System.out.print("Enter a score [Enter a negative score to quit]:");
            score = g.nextInt();
            
            if (score < 0)
                break;
            
            if (score > max)
                max = score;
            if (score < min)
                min = score;
            
            sum += score;
            n++;
            average = (double) sum/n;
            
            sd = Math.sqrt(((Math.pow(score,2))- (Math.pow(average,2)/n))/(n-1));
        }
        System.out.println("Maximum score:" + max);
        System.out.println("Minimum score:" + min);
        System.out.printf("Average score:%.2f",average);
        System.out.println(" ");
        System.out.printf("Standard Deviation: %.2f", sd);
        System.out.println(" ");
        
    }
}