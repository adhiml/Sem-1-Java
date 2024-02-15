/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saada
 */
import java.util.Scanner;
public class L3Q3 {
    public static void main(String [] args)
    {
        Scanner g = new Scanner(System.in);
        System.out.print("Please enter sales amount:");
        double sales = g.nextFloat();
        double com = 0;
        
        if (sales > 1000)
        {
            com = (sales - 1000)*0.125 + (0.1*1000);
            System.out.print("The commission is:" + com);
        }
        else if (sales > 500)
        {
            com = (sales - 500)*0.1 + 500*0.075;
            System.out.print("The commission is:" + com);
        }
        else if (sales > 100)
        {
            com = (sales - 100)*0.075 + 100*0.05;
            System.out.print("The commission is:" + com);
        }
        else if (sales > 0)
        {
            com = sales*0.05;
            System.out.print("The commission is:" + com);
        }
        else
            System.out.print("The total sales input is invalid.");
        
        System.out.print(" ");
    }
    
}

            


