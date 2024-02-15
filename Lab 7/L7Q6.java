/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class L7Q6 {
    public static void main (String [] args) throws IOException
    {
        try
        {
            BufferedReader in1 = new BufferedReader( new FileReader ("Lab07\\product.txt"));
            BufferedReader in2 = new BufferedReader( new FileReader ("Lab07\\order.txt"));
                    
            String line1 = in1.readLine(), line2 = in2.readLine();
            int counter1 = 0, counter2 = 0;
            
            // Count lines in the first file
            while (line1 != null)
            {
                line1 = in1.readLine();
                counter1++;
            }
            
            // Count lines in the 2nd file
            while (line2 != null)
            {
                line2 = in2.readLine();
                counter2++;
            }
            
            // Initialize arrays for the first file
            String [] ProductIDP = new String [counter1];
            String [] ProductName = new String [counter1];
            double [] ProductPrice = new double [counter1];
            
            // Initialize arrays fro the 2nd file
            String [] OrderID = new String [counter2];
            String [] ProductIDO = new String [counter2];
            int [] OrderQuantity = new int [counter2];
            
            // close and reopen the 1st file to reset where it starts
            in1.close(); 
            in1 = new BufferedReader(new FileReader("Lab07\\product.txt"));

            // Read content of the first file into the Product's arrays
            while(counter1 > 0)
            {
                String line3 = in1.readLine();
                String [] parts = line3.split(",");

                for (int i = 0; i < counter1; i++)
                {
                    for (int words = 0; words < 3; words++) {
                    ProductIDP[words] = parts[0];
                    ProductName[words] = parts[1];
                    ProductPrice[words] = Double.parseDouble(parts[2]);}
                    
                    // read the next line
//                    line3 = in1.readLine();
                    
                    counter1--;
            } }
            
            
            in2.close();
            in2 = new BufferedReader (new FileReader ("Lab07\\order.txt"));
            
            
            String line4 = in2.readLine();
               String [] parts = line4.split(",");
            
            // Read content of the 2nd file into the Order's arrays
            while (counter2 > 0)
            {
                for (int i = 0; i < counter2; i++)
                {
                    OrderID[i] = parts[0];
                    ProductIDO[i] = parts[1];
                    OrderQuantity[i] = Integer.parseInt(parts[2]);
                    
                    // read the next line
//                    line4 = in2.readLine();
                }
                counter2--;
            }
            
            for (int i = 0; i < counter2; i++) {
                System.out.println("OrderID[" + i + "]: " + OrderID[i]);
                System.out.println("ProductIDO[" + i + "]: " + ProductIDO[i]);
                 System.out.println("OrderQuantity[" + i + "]: " + OrderQuantity[i]);}
            System.out.println("");

    
            for (int i = 0; i < counter2;i++)
            {
                int f = 0;
                while ( f < counter1)
                {
                    if (ProductIDO[i] != null && ProductIDO[i].equalsIgnoreCase(ProductIDP[f]))
                    {
                        double total = total(ProductPrice[f],OrderQuantity[i]);
                        System.out.println("ProductIDP[" + i + "]: " + ProductIDP[f]);
                        System.out.println("ProductIDO[" + i + "]: " + ProductIDO[i]);
                        f++;
                    }
                    else
                        f++;
                }
            }
        } catch (IOException e)
        {
        }
    }
    
    public static double total (double ProductPrice, int OrderQuantity)
            {
                return (double) ProductPrice * OrderQuantity;
            }
}